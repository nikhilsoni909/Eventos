package eventos.services;

import eventos.models.Booking;
import eventos.models.Payment;

public interface BookingDAOInterface {
void createBooking(Booking booking) throws Exception;
int getBookingId(int customerId,int event_id,int ticket_type_id) throws Exception;
void createPayment(Payment payment) throws Exception;
}
