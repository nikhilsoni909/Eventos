package eventos.services;

import java.sql.Timestamp;
import java.util.List;

import eventos.models.Events;
import eventos.models.TicketType;

//private int eventId;
//private String eventName;
//private String eventVenue;
//private int eventCatagory;
//private int eventCity;
//private Date eventDateTime;
//private String eventDescription;
//private String eventBanner;
//private int organizerId;
public interface EventsDAOInterface {
//	can write :throws Exception(at last)

	public String createEvent(Events event, List<TicketType> ticketTypes);
	
	public int getGeneratedEventId(int organizerId);


	public String updateEvent(int eventId);

	public String getEventDetails(String eventName, String eventVenue, String eventCategory, String eventCity,
			Timestamp eventDateTime, String eventDescription, String eventBanner, int organizerId);
	
	public List<Events> getEventDetailsByOrganizerId(int OrganizerId);
	
	
   // this code is used for fetching events in customer's account
	List<Events>  getAllEvents() throws Exception;
    Events getEventDetailsByEventId(int eventId) throws Exception;

}