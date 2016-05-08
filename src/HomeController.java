import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("username") == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Views/login.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("user", session.getAttribute("username"));
			request.getRequestDispatcher("Views/index.jsp").forward(request, response);
		}
	}

}
