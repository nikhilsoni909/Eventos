<%@page import="eventos.models.Payment"%>
<%@page import="eventos.models.Booking"%>
<%@page import="eventos.services.impl.BookingDAOImpl"%>
<%@page import="eventos.services.BookingDAOInterface"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.sql.SQLException"%>
<html>
<head>
<title>Payment Confirmation</title>
<!-- Include Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href=paymentPage.css>
<style>
body {
	background-color: #f8f9fa;
	background-image: url("images/bg.png");
	padding: 50px 0;
}

.card {
	margin-top: 100px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.card-title {
	color: #007bff;
}
</style>
</head>
<body>

	<%
	// Initialize DAO
	BookingDAOInterface bookingDAO = new BookingDAOImpl();

	int customerId = (int) session.getAttribute("customer_id");
	// Customer ID is not null, proceed to create the booking
	Booking booking = new Booking();
	booking.setCustomerId(customerId); // Set customer ID

	// Convert string parameters to integers
	int eventId = Integer.parseInt(request.getParameter("eventId"));
	int ticketTypeId = Integer.parseInt(request.getParameter("ticketId"));
	int bookingQuantity = Integer.parseInt(request.getParameter("ticketQuantity"));

	// Set event ID, ticket type ID, and booking quantity
	booking.setEventId(eventId);
	booking.setTicketTypeId(ticketTypeId);
	booking.setBookingQuantity(bookingQuantity);

	// Convert string parameter to double (assuming totalAmount represents a monetary value)
	double bookingPrice = Double.parseDouble(request.getParameter("totalAmount"));
	booking.setBookingPrice(bookingPrice);
	int bookingId = 0;
	// Now you can use the booking object as needed
	try {
		// Insert booking
		bookingDAO.createBooking(booking);
	

		bookingId = bookingDAO.getBookingId(customerId, eventId, ticketTypeId);
	} catch (SQLException e) {
		out.println("Error creating booking: " + e.getMessage());
	} catch (Exception e) {
		out.println("Error fetching booking ID: " + e.getMessage());
	}
	String paymentMethod=request.getParameter("payment_method");
	Payment payment = new Payment();
	 payment.setBookingId(bookingId);
     payment.setPrice(bookingPrice);
     payment.setPaymentStatus("S"); // Set the initial payment status
     payment.setPaymentMethod("Credit Card");
     bookingDAO.createPayment(payment);
    
	%>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title text-center">Payment Successful</h4>
						<p class="card-text text-center">Thank you for your payment!</p>
						<hr>
						<p class="card-text">
							Transaction ID: <strong><%=bookingId%></strong>
						</p>
						<p class="card-text">
							Amount Paid: <strong>₹<%=request.getParameter("totalAmount")%></strong>
						</p>
						<p class="card-text">
							Date and Time:
							<%=new java.util.Date()%></p>
						<hr>
						<div class="text-center">
							<a href="index.jsp" class="btn btn-primary">Back to Home</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
