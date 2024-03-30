<%@page import="java.sql.SQLException"%>
<%@page import="java.util.List"%>
<%@page import="eventos.models.MyTicket"%>
<%@page import="eventos.services.impl.TicketTypeDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Meta tags and other head content -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>Eventos - My Tickets</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">
<link rel="apple-touch-icon" sizes="180x180"
	href="/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="/favicon-16x16.png">
<link rel="manifest" href="/site.webmanifest">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="myTickets.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="css/custom.css">
<!-- Modernizer for Portfolio -->
<script src="js/modernizer.js"></script>
<script src="https://cdn.jsdelivr.net/npm/qrcodejs2@1.0.0/qrcode.min.js"></script>

<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<h1>My Tickets</h1>
	<table border="1">
		<tr>
			<th>Ticket ID</th>
			<th>Event Name</th>
			<th>Date</th>
			<th>City</th>
			<th>Seat Category</th>
			<th>Number of Seats</th>
			<th>Booking Date</th>
		</tr>
		<%
		TicketTypeDAOImpl myTicketsDAO = new TicketTypeDAOImpl();
		int customerId = (int) session.getAttribute("customer_id"); // Replace with the actual customer ID
		List<MyTicket> myTicketsList = null;
		try {
			myTicketsList = myTicketsDAO.getMyTickets(customerId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (myTicketsList != null) {
			for (MyTicket myTicket : myTicketsList) {
		%>
		<tr>
			<td><%=myTicket.getTicketId()%></td>
			<td><%=myTicket.getEventName()%></td>
			<td><%=myTicket.getDate()%></td>
			<td><%=myTicket.getCity()%></td>
			<td><%=myTicket.getSeatCategory()%></td>
			<td><%=myTicket.getNumberOfSeats()%></td>
			<td><%=myTicket.getBookingDate()%></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	<div class="col-md-4 mb-4">
		<div class="card h-100">
			<div class="card-body">
				<p class="card-text">Ticket ID: 1</p>
				<h5 class="card-title">Event Name 1</h5>
				<p class="card-text">Date: 2024-03-21</p>
				<p class="card-text">City: City 1</p>
				<p class="card-text">Seat Category: Gold</p>
				<p class="card-text">Number of Seats: 2</p>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-4">
		<div class="card h-100">
			<div class="card-body">
				<p class="card-text">Ticket ID: 1</p>
				<h5 class="card-title">Event Name 1</h5>
				<p class="card-text">Date: 2024-03-21</p>
				<p class="card-text">City: City 1</p>
				<p class="card-text">Seat Category: Gold</p>
				<p class="card-text">Number of Seats: 2</p>
			</div>
		</div>
	</div>
	<div class="col-md-4 mb-4">
		<div class="card h-100">
			<div class="card-body">
				<p class="card-text">Ticket ID: 1</p>
				<h5 class="card-title">Event Name 1</h5>
				<p class="card-text">Date: 2024-03-21</p>
				<p class="card-text">City: City 1</p>
				<p class="card-text">Seat Category: Gold</p>
				<p class="card-text">Number of Seats: 2</p>
			</div>
		</div>
	</div>
</body>
</html>