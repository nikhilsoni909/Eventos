<!DOCTYPE html>
<html lang="en">

<head>
<!-- Basic -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Site Metas -->
<title>Eventos</title>
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
<link rel="stylesheet" href="editEvent.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="css/custom.css">

<!-- Modernizer for Portfolio -->
<script src="js/modernizer.js"></script>

<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<!-- LOADER -->
	<div id="preloader">
		<div class="loader">
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__bar"></div>
			<div class="loader__ball"></div>
		</div>
	</div>
	<!-- END LOADER -->

	<header class="header header_style_01">
		<nav class="megamenu navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand nigga" href="index.html">
						<h1 class="logotxt">Eventos</h1>
					</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="index.html">Home</a></li>
						<li><a href="about-us.html">About us</a></li>
						<li><a href="events.html">Events</a></li>
						<li><a href="contact.html">Contact</a></li>
						<li><a href="organizerLogin.html">Login</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<!-- Form for editing event details -->
	<section class="edit-event-section">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<form id="editEventForm" class="edit-event-form"
						action="EventsRegisterServlet" method="post">
						<h2 class="edit-event-heading">Edit Event Details</h2>
						<div class="form-group">
							<label for="eventName" class="edit-event-label">Event
								Name</label> <input type="text" class="form-control edit-event-input"
								id="eventName" name="eventName" required>
						</div>
						<div class="form-group">
							<label for="eventVenue" class="edit-event-label">Venue</label> <input
								type="text" class="form-control edit-event-input"
								id="eventVenue" name="eventVenue" required>
						</div>
						<div class="form-group">
							<label for="category" class="edit-event-label">Category</label> <select
								class="form-control edit-event-input" id="category"
								name="eventCategory">
								<option value="Stand-up">Stand-up</option>
								<option value="Concert">Concert</option>
								<option value="Theatre">Theatre</option>
								<option value="Others">Others</option>
							</select>
						</div>
						<div class="form-group">
							<label for="location" class="edit-event-label">Location
								(City)</label> <input type="text" class="form-control edit-event-input"
								id="location" name="eventCity" required>
						</div>
						<div class="form-group">
							<label for="eventDateTime" class="edit-event-label">Date
								and Time of Event</label> <input type="datetime-local"
								class="form-control edit-event-input" id="eventDateTime"
								name="eventDateTime" required>
						</div>
						<div class="form-group">
							<label for="description" class="edit-event-label">Description</label>
							<textarea class="form-control edit-event-input" id="description"
								name="eventDescription" required></textarea>
						</div>
						<div class="form-group">
							<label for="imageUrl" class="edit-event-label">Image URL</label>
							<input type="url" class="form-control edit-event-input"
								id="imageUrl" name="eventBanner" required>
						</div>

						<!-- Ticket types section -->
						<div id="ticketTypes">
							<!-- Pre-added div for ticket types -->

							<div class="ticket-type-fieldset">
								<input type="hidden" class="ticket-type-count"
									name="ticketTypeCount" id="ticketTypeCount" value="1">
								<label for="ticketTypeName1">Ticket Type Name</label> <input
									type="text" class="form-control ticket-type-name"
									id="ticketTypeName1" name="ticketName1" required> <label
									for="ticketTypeQuantity1">Ticket Quantity</label> <input
									type="number" class="form-control ticket-type-quantity"
									id="ticketTypeQuantity1" name="ticketQuantity1" required>
								<label for="ticketTypePrice1">Ticket Price</label> <input
									type="number" class="form-control ticket-type-price"
									id="ticketTypePrice1" name="ticketPrice1" required>
								<button type="button" class="btn btn-danger remove-ticket-btn">Remove</button>
							</div>

						</div>
						<!-- Button to add more ticket types -->
						<button type="button" class="btn btn-default add-ticket-btn"
							id="addTicketTypeBtn">Add Ticket Type</button>

						<!-- Submit button -->
						<button type="submit" class="btn btn-primary save-changes-btn">Save
							Changes</button>

					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- END Form for editing event details -->

	<footer class="footer">
		<!-- Footer content -->
	</footer>

	<!-- jQuery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(document)
				.ready(
						function() {
							// Enable/disable price input based on checkbox state
							var TicketTypeCount = 2; // Start from 2 since there's already one ticket type added

							// Add ticket type button click event
							$('.add-ticket-btn')
									.click(
											function() {
												var newTicketType = $(
														'.ticket-type-fieldset')
														.first().clone();
												newTicketType
														.find(
																'.ticket-type-count')
														.attr('value',
																TicketTypeCount);
												newTicketType
														.find('label:eq(0)')
														.attr(
																'for',
																"ticketTypeName"
																		+ TicketTypeCount);
												newTicketType
														.find(
																'.ticket-type-name')
														.attr(
																'name',
																"ticketName"
																		+ TicketTypeCount)
														.attr(
																'id',
																"ticketTypeName"
																		+ TicketTypeCount)
														.val('');
												newTicketType
														.find('label:eq(1)')
														.attr(
																'for',
																"ticketTypeQuantity"
																		+ TicketTypeCount);
												newTicketType
														.find(
																'.ticket-type-quantity')
														.attr(
																'name',
																"ticketQuantity"
																		+ TicketTypeCount)
														.attr(
																'id',
																"ticketTypeQuantity"
																		+ TicketTypeCount)
														.val('');
												newTicketType
														.find('label:eq(2)')
														.attr(
																'for',
																"ticketTypePrice"
																		+ TicketTypeCount);
												newTicketType
														.find(
																'.ticket-type-price')
														.attr(
																'name',
																"ticketPrice"
																		+ TicketTypeCount)
														.attr(
																'id',
																"ticketTypePrice"
																		+ TicketTypeCount)
														.val('');
												$('#ticketTypeCount').val(
														TicketTypeCount);
												TicketTypeCount++;
												$('#ticketTypes').append(
														newTicketType);
											});

							// Remove ticket type button click event
							$(document)
									.on(
											"click",
											".remove-ticket-btn",
											function() {
												// Remove the parent div of the clicked remove button
												$(this)
														.closest(
																".ticket-type-fieldset")
														.remove();
											});
						});
	</script>

	<!-- ALL JS FILES -->
	<script src="js/all.js"></script>
	<!-- ALL PLUGINS -->
	<script src="js/custom.js"></script>
	<script src="js/portfolio.js"></script>
	<script src="js/hoverdir.js"></script>

	<a href="#" id="scroll-to-top" class="dmtop global-radius"><i
		class="fa fa-angle-up"></i></a>

</body>

</html>