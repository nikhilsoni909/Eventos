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
				HttpSession session = request.getSession();
				session.setAttribute("IsOrganizer", false);	
				session.setAttribute("userRole","Customer");
				session.setAttribute("customer_email",Email);
				String customer_name=udao.getCustomerName(Email);
				int customer_id=udao.getCustomerId(Email);
				session.setAttribute("customer_name",customer_name);
				session.setAttribute("customer_id",customer_id);
				System.out.println(customer_name);
				System.out.println(customer_id);
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