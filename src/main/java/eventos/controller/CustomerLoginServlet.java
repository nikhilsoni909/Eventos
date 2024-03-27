package eventos.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import eventos.models.Customers;
import eventos.services.impl.CustomerDAOImpl;


@WebServlet("/CustomerLogin")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1;
			
	public CustomerLoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("In");

		String Email = request.getParameter("Email");
		String password = request.getParameter("Password");
//		String userType = request.getParameter("usertype");
		response.setContentType("text/html");
        System.out.println("out");
		String status = "Login Denied! Invalid Username or password.";

		
			CustomerDAOImpl udao = new CustomerDAOImpl();
			System.out.println("out");

			status = udao.isValidCredential(Email, password);

			if (status.equalsIgnoreCase("valid")) {
				// valid user
				
				System.out.println("Sign in Succesful");

				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

				rd.forward(request, response);

			} else {
				// invalid user;

				RequestDispatcher rd = request.getRequestDispatcher(status);

				rd.forward(request, response);

			}
		}

//	}


}


