package eventos.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

}
