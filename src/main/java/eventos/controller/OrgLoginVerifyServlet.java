package eventos.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import eventos.services.OrganizerDAOInterface;

import eventos.services.impl.OrganizerDAOImpl;

@WebServlet("/organizerLogin")
public class OrgLoginVerifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private OrganizerDAOImpl organizerDAOImpl=new OrganizerDAOImpl();
    public OrgLoginVerifyServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        OrganizerDAOImpl organizerDAO = new OrganizerDAOImpl();
		if (organizerDAO.verifyOrganizer(email, password)) {
			System.out.println("Entered into System");
			int organizerId=organizerDAOImpl.getOrganizerIdByEmail(email);
			String organizerName=organizerDAOImpl.getOrganizerNameByEmail(email);
			System.out.println("organizerId "+organizerId);
			HttpSession session = request.getSession();
			session.setAttribute("organizerId", organizerId);
			session.setAttribute("organizerName", organizerName);
			System.out.println(session.getAttribute("organizerName"));
			response.sendRedirect("OrganizerHome.jsp");
		} else {
			response.sendRedirect("Error.jsp");
		}
	}

}
