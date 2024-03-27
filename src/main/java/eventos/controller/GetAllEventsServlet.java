package eventos.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import eventos.models.Events;
import eventos.services.EventsDAOInterface;
import eventos.services.impl.EventsDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/GetAllEventsServlet")
public class GetAllEventsServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("servlet called");
    	 EventsDAOInterface eventDAO= new EventsDAOImpl();
        List<Events> events = null;
		try {
			events = eventDAO.getAllEvents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.setAttribute("events", events);
        request.getRequestDispatcher("events.jsp").forward(request, response);
    System.out.println("servlet ended");
    }
}

