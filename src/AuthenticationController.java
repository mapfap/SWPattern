import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		if (session.getAttribute("username") != null) {
			request.setAttribute("error", "already logged in");
			response.sendRedirect("/SWPattern/");
			return;
		}
		if (User.validate(username, password)) {
			session.setAttribute("username", username);
			response.sendRedirect("/SWPattern/");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Views/loginfail.jsp");
			dispatcher.forward(request, response);
		}
	}

}
