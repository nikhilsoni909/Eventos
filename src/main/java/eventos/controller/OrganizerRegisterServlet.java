package eventos.controller;

import java.io.IOException;

import eventos.services.impl.OrganizerDAOImpl;
import eventos.utility.PasswordEncryption;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/OrganizerRegisterServlet")
public class OrganizerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String organizerName = request.getParameter("organizer_name");
		String organizerMobileNumber = request.getParameter("organizer_mobile_number");
		String organizerEmail = request.getParameter("organizer_email");
		String organizerPassword = request.getParameter("organizer_password");
		System.out.println(organizerPassword);
		String organizerConfirmPassword = request.getParameter("organizer_confirm_password");
		System.out.println(organizerConfirmPassword);
		String status = "";

		if (organizerPassword != null && organizerPassword.equals(organizerConfirmPassword)) {
			try {
				String[] encryptionResult = PasswordEncryption.encryption(organizerConfirmPassword);
				String organizerPasswordHash = encryptionResult[0];
				String organizerPasswordSalt = encryptionResult[1];

				OrganizerDAOImpl userService = new OrganizerDAOImpl();
				status = userService.registerOrganizer(organizerName, organizerMobileNumber, organizerEmail,
						organizerPasswordHash, organizerPasswordSalt);
			}  catch (Exception e) {
                status = "Error parsing date.";
            }
		} else {
			status = "Password not matching!";
		}

		RequestDispatcher rd = request.getRequestDispatcher(status);
		rd.forward(request, response);

	}

}