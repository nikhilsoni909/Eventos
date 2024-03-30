package eventos.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eventos.models.MyTicket;
import eventos.models.TicketType;
import eventos.services.TicketTypeDAOInterface;
import eventos.utility.dbutil;

public class TicketTypeDAOImpl implements TicketTypeDAOInterface {
	private Connection conn;

	public TicketTypeDAOImpl() {
//			 try {
//				conn = dbutil.provideConnection();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		conn = dbutil.provideConnection();
	}

	@Override
	public List<TicketType> getTicketTypesForEvent(int eventId) throws SQLException {
System.out.println("getTicketTypesForEvent dao called");
		List<TicketType> ticketTypes = new ArrayList<>();
		String query = "SELECT * FROM tbl_ticket_types WHERE event_id = ?";

		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, eventId);
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			int ticketTypeId = resultSet.getInt("ticket_type_id");
			String ticketType = resultSet.getString("ticket_type");
			float ticketPrice = resultSet.getFloat("ticket_price");
			int ticketQuantity = resultSet.getInt("ticket_quantity");
			// Create TicketType object and add to list
			TicketType ticket = new TicketType(ticketTypeId, eventId, ticketType, ticketPrice, ticketQuantity);
			ticketTypes.add(ticket);
		}
		System.out.println("getTicketTypesforevents dao ended");
		return ticketTypes;
	}

	@Override
	public List<MyTicket> getMyTickets(int customerId) throws SQLException {
		System.out.println("getMyTickets dao called");
		System.out.println("value of customerDao:"+customerId);
		List<MyTicket> myTickets = new ArrayList<>();
		  String sql = "SELECT b.booking_id AS \"Ticket_ID\", " +
	                "e.event_name AS \"Event_Name\", " +
	                "e.event_date_time AS \"Date\", " +
	                "e.event_city AS \"City\", " +
	                "tt.ticket_type AS \"Seat_Category\", " +
	                "b.booking_quantity AS \"Number_of_Seats\", " +
	                "b.booking_timestamp AS \"Booking_Date\" " +
	                "FROM tbl_Bookings b " +
	                "JOIN tbl_events e ON b.event_id = e.event_id " +
	                "JOIN tbl_ticket_types tt ON b.ticket_type_id = tt.ticket_type_id " +
	                "WHERE b.customer_id = ?";
 
		  PreparedStatement pstmt = conn.prepareStatement(sql);
		  pstmt.setInt(1, customerId);
		  ResultSet rs = pstmt.executeQuery();
		  while (rs.next()) {
              MyTicket myTicket = new MyTicket();
              myTicket.setTicketId(rs.getInt("Ticket_ID"));
              myTicket.setEventName(rs.getString("Event_Name"));
              myTicket.setDate(rs.getTimestamp("Date"));
              myTicket.setCity(rs.getString("City"));
              myTicket.setSeatCategory(rs.getString("Seat_Category"));
              myTicket.setNumberOfSeats(rs.getInt("Number_of_Seats"));
              myTicket.setBookingDate(rs.getTimestamp("Booking_Date"));
              myTickets.add(myTicket);
          }
		  System.out.println("getMyTickets dao ended");
		  System.out.println(myTickets);
		return myTickets;
	}

}
