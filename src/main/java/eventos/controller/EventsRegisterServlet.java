package eventos.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import eventos.models.Events;
import eventos.models.TicketType;
import eventos.services.EventsDAOInterface;
import eventos.services.impl.EventsDAOImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/EventsRegisterServlet")
public class EventsRegisterServlet extends HttpServlet {
    private EventsDAOInterface eventsDAO;
    Timestamp newDateTime = null;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize your DAO implementation
        eventsDAO = new EventsDAOImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Getting parameters from the request for the event
        	
            String eventName = request.getParameter("eventName");
            System.out.println(eventName);
            String eventVenue = request.getParameter("eventVenue");
            System.out.println(eventVenue);
            String eventCategory = request.getParameter("eventCategory");
            System.out.println(eventCategory);
            String eventCity = request.getParameter("eventCity");
            System.out.println(eventCity);

            String eventDateTimeString = request.getParameter("eventDateTime");
            
            // Parse eventDateTime string to Timestamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date parsedDate = dateFormat.parse(eventDateTimeString);
            Timestamp eventDateTime = new Timestamp(parsedDate.getTime());
            System.out.println(eventDateTime);


            String eventDescription = request.getParameter("eventDescription");
            System.out.println(eventDescription);

            String eventBanner = request.getParameter("eventBanner");
            System.out.println(eventBanner);

            
            // Get the organizerId from session
            HttpSession session = request.getSession();
            int organizerId = (int) session.getAttribute("organizerId");
            System.out.println(organizerId);


            // Creating the event object
            Events event = new Events(eventName, eventVenue, eventCategory, eventCity, eventDateTime,
                    eventDescription, eventBanner, organizerId);

            List<TicketType> ticketTypes = new ArrayList<>();
            int ticketTypeCount = Integer.parseInt(request.getParameter("ticketTypeCount"));
            System.out.println("ticketTypeCount "+ticketTypeCount);

            
            for (int i = 1; i <= ticketTypeCount; i++) {
                String ticketTypeName = request.getParameter("ticketName" + i);
                System.out.println(ticketTypeName);
                float ticketPrice = Float.parseFloat(request.getParameter("ticketPrice" + i));
                System.out.println(ticketPrice);
                int ticketQuantity = Integer.parseInt(request.getParameter("ticketQuantity" + i));
                System.out.println(ticketQuantity);
                TicketType ticketType = new TicketType(ticketTypeName, ticketPrice, ticketQuantity);
                ticketTypes.add(ticketType);
            }


            // Calling DAO method to create event and insert ticket types
            String status = eventsDAO.createEvent(event, ticketTypes);

            // Redirecting based on registration status
            if ("Event Registered Successfully".equals(status)) {
                // If the event and tickets are successfully registered
                RequestDispatcher rd = request.getRequestDispatcher("Succesfully registered");
                rd.forward(request, response);
            } else {
                // Handle registration failure
                request.setAttribute("errorMessage", status);
                RequestDispatcher rd = request.getRequestDispatcher("errorPage.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            throw new ServletException("An error occurred while processing the request", e);
        }
    }

}
