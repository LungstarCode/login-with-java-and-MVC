

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String town = request.getParameter("town");
		
		Model model = new Model();
		model.setName(name);
		model.setEmail(email);
		model.setPassword(password);
		model.setTown(town);
		 
		int ra = model.register();
		HttpSession session = request.getSession();
		
		if (ra == 0)
		{
			response.sendRedirect("");
		}
		else 
		{
			response.sendRedirect("");
		}
	}

}
