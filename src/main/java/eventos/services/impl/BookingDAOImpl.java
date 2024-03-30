package eventos.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eventos.models.Booking;
import eventos.models.Payment;
import eventos.services.BookingDAOInterface;
import eventos.utility.dbutil;

public class BookingDAOImpl implements BookingDAOInterface {
	private Connection conn;

	public BookingDAOImpl() {
//		 try {
//			conn = dbutil.provideConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		conn = dbutil.provideConnection();
	}

	@Override
	public void createBooking(Booking booking) throws SQLException {
		 PreparedStatement preparedStatement = null;
		String query = "INSERT INTO TBL_BOOKINGS (CUSTOMER_ID, EVENT_ID, TICKET_TYPE_ID, BOOKING_QUANTITY, BOOKING_PRICE) VALUES (?, ?, ?, ?, ?)";
		preparedStatement = conn.prepareStatement(query);
		preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, booking.getCustomerId());
		preparedStatement.setInt(2, booking.getEventId());
		preparedStatement.setInt(3, booking.getTicketTypeId());
		preparedStatement.setInt(4, booking.getBookingQuantity());
		preparedStatement.setDouble(5, booking.getBookingPrice());
		int rows = preparedStatement.executeUpdate();
		
		if(rows > 0) {
			System.out.println("Booking created successfully!");
        } else {
            System.out.println("Failed to create booking!");
		}
	}

	@Override
	public int getBookingId(int customerId, int eventId, int ticketTypeId) throws Exception {
		 int bookingId = -1; // Default value if booking ID is not found

	        String query = "SELECT booking_id FROM tbl_Bookings WHERE customer_id = ? AND event_id = ? AND ticket_type_id = ?";
	        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	            preparedStatement.setInt(1, customerId);
	            preparedStatement.setInt(2, eventId);
	            preparedStatement.setInt(3, ticketTypeId);
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                if (resultSet.next()) {
	                    bookingId = resultSet.getInt("booking_id");
	                }
	            }
	        } catch (Exception e) {
	            throw new Exception("Error while fetching booking ID: " + e.getMessage());
	        }

	        return bookingId;
	}

	@Override
	public void createPayment(Payment payment) throws SQLException {
		  String sql = "INSERT INTO tbl_payments (booking_id, price,  payment_status, payment_method) VALUES (?, ?, ?, ?)";
		  try (PreparedStatement statement = conn.prepareStatement(sql)) {
	            // Set values for the prepared statement
	            statement.setInt(1, payment.getBookingId());
	            statement.setDouble(2, payment.getPrice());
	            statement.setString(3, payment.getPaymentStatus());
	            statement.setString(4, payment.getPaymentMethod());

	            // Execute the query
	            int rowsInserted = statement.executeUpdate();
	            if(rowsInserted>0)System.out.println("tables values inserted");
	  		  else System.out.println("tables values not inserted");
	            // Check if the insertion was successful
	        }
		  
		
	}

	

}
