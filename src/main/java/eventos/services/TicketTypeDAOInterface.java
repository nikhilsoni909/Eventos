package eventos.services;

import java.util.List;

import eventos.models.MyTicket;
import eventos.models.TicketType;

public interface TicketTypeDAOInterface {
	List<TicketType> getTicketTypesForEvent(int eventId) throws Exception;
	List<MyTicket> getMyTickets(int customerId) throws Exception;
}
