import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FrontControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public final String prefix = "/SWPattern/";

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		Controller c = null;
		if (uri.equals(prefix)) {
			c = new HomeController();
			c.execute(request, response);
			return;
		} else if (uri.equals(prefix + "login")) {
			c = new LoginController();
			c.execute(request, response);
			return;
		} else {
			PrintWriter out = response.getWriter();
			out.println("404 NOT FOUND");
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		Controller c = null;
		if (uri.equals(prefix + "login")) {
			c = new AuthenticationController();
			c.execute(request, response);
			return;
		} else if (uri.equals(prefix + "logout")) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				session.invalidate();
			}
			response.sendRedirect(prefix);
			return;
		} else {
			PrintWriter out = response.getWriter();
			out.println("404 NOT FOUND");
		}
	}

}
