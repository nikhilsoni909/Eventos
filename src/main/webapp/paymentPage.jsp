<!DOCTYPE html>
<html lang="en">
<head>
<!-- Basic -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Site Metas -->
<title>Eventos</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">

<!-- Favicon -->
<link rel="icon" type="image/png" sizes="32x32"
	href="/favicon-32x32.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="paymentPage.css">
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
<style>
</style>
</head>
<body>

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
					<a class="navbar-brand nigga" href="index.html"><h1
							class="logotxt">
							<h1>Eventos</h1>
						</h1></a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a class="active" href="index.html">Home</a></li>
						<li><a href="about-us.html">About us</a></li>
						<li><a href="events.html">Events</a></li>
						<li><a href="contact.html">Contact</a></li>
						<li><a href="userLogin.html">Login</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!--form submission was not working properly so I added

	onclick="window.location.href='paymentDone.jsp?totalAmount=${param.totalAmount}?ticketQuantity=${param.ticketQuantity}?ticketId=${param.ticketId}?eventId=${param.eventId}';"
 -->
	<section class="payment-container">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2>Enter Payment Details</h2>

					<form id="payment-form"
						action="paymentDone.jsp?totalAmount=${param.totalAmount}&ticketQuantity=${param.ticketQuantity}&ticketId=${param.ticketId}&eventId=${param.eventId}"
						method="post">

						<div class="form-group">
							<label for="name">Name:</label> <input type="text"
								class="form-control" id="name" name="booking_name"
								value=${sessionScope.customer_name } 
								required>
						</div>
						<div class="form-group">
							<label for="email">Email:</label> <input type="email" name="booking_email"
								class="form-control" id="email" placeholder="Enter your email" value=${sessionScope.customer_email } 
								required>
						</div>
						<div class="form-group">
							<label for="payment-mode">Payment Mode:</label> 
							<select
								class="form-control" name="payment_method" id="payment-mode" required>
								<option value="">Select Payment Mode</option>
								<option value="debit-card">Debit Card</option>
								<option value="upi">UPI</option>
							</select>
						</div>
						<div id="debit-card-details" style="display: none;">
							<h3>Debit Card Details</h3>
							<div class="form-group">
								<label for="card-number">Card Number:</label> <input type="text"
									class="form-control" id="card-number"
									placeholder="Enter your card number">
							</div>
							<!-- Add more fields for card details as needed -->
						</div>
						<div id="upi-details" style="display: none;">
							<h3>UPI ID</h3>
							<div class="form-group">
								<label for="upi-id">UPI ID:</label> <input type="text"
									class="form-control" id="upi-id"
									placeholder="Enter your UPI ID">
							</div>
						</div>
						<!-- Display total amount from backend -->
						<div class="form-group">
							<label for="total-amount">Total Amount:</label> <input
								type="text" class="form-control" id="total-amount"
								placeholder="Total amount" value=${param.totalAmount }  readonly>
						</div>

						<button type="submit" class="btn btn-primary">Pay
							Now</button>



					</form>
				</div>
			</div>
		</div>
	</section>



	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-sm-4 col-xs-12">
					<div class="widget clearfix">
						<div class="widget-title">
							<img src="images/logos/logo.png" alt="" / class="logo">
						</div>
						<p>Explore, Experience, Enjoy: Your one-stop destination for
							seamless event ticketing. Stay connected for updates, offers, and
							exclusive deals. Start planning your next adventure with us
							today!</p>
						<p>Sed fermentum est vitae rhoncus molestie. Cum sociis
							natoque penatibus et magnis dis montes.</p>
					</div>
					<!-- end clearfix -->
				</div>
				<!-- end col -->

				<div class="col-md-4 col-sm-4 col-xs-12">
					<div class="widget clearfix">
						<div class="widget-title">
							<h3>Pages</h3>
						</div>

						<ul class="footer-links hov">
							<li><a href="/index.html">Home <span
									class="icon icon-arrow-right2"></span></a></li>
							<li><a href="about-us.html">About <span
									class="icon icon-arrow-right2"></span></a></li>
							<li><a href="events.html">Events <span
									class="icon icon-arrow-right2"></span></a></li>
							<li><a href="contact.html">Contact <span
									class="icon icon-arrow-right2"></span></a></li>
							<li><a href="login.html">Login <span
									class="icon icon-arrow-right2"></span></a></li>
						</ul>
						<!-- end links -->
					</div>
					<!-- end clearfix -->
				</div>
				<!-- end col -->

				<div class="col-md-4 col-sm-4 col-xs-12">
					<div class="footer-distributed widget clearfix">
						<div class="widget-title">
							<h3>Subscribe</h3>
							<p>Stay in the Loop! Subscribe for Exclusive Offers, Event
								Updates, and Early Access to Tickets. Join Now for a Front Row
								Seat to Your Favorite Experiences!</p>
						</div>

						<div class="footer-right">
							<form method="get" action="#">
								<input placeholder="Subscribe our newsletter.." name="search">
								<i class="fa fa-envelope-o"></i>
							</form>
						</div>
					</div>
					<!-- end clearfix -->
				</div>
				<!-- end col -->
			</div>
			<!-- end row -->
		</div>
		<!-- end container -->
	</footer>
	<!-- end footer -->

	<div class="copyrights">
		<div class="container">
			<div class="footer-distributed">
				<div class="footer-left">
					<p class="footer-company-name">
						All Rights Reserved. &copy; 2024 <a href="#">Eventos</a>
				</div>
			</div>
		</div>
		<!-- end container -->
	</div>
	<!-- end copyrights -->

	<a href="#" id="scroll-to-top" class="dmtop global-radius"><i
		class="fa fa-angle-up"></i></a>

	<!-- ALL JS FILES -->
	<script src="js/all.js"></script>
	<!-- ALL PLUGINS -->
	<script src="js/custom.js"></script>


	<script>
		document.addEventListener("DOMContentLoaded", function() {
			// Select elements
			var paymentModeSelect = document.getElementById("payment-mode");
			var debitCardDetails = document
					.getElementById("debit-card-details");
			var upiDetails = document.getElementById("upi-details");
			// Event listener for payment mode select change
			paymentModeSelect.addEventListener("change", function() {
				// Hide both debit card and UPI fields
				debitCardDetails.style.display = "none";
				upiDetails.style.display = "none";

				// Show selected payment method fields
				var selectedOption = paymentModeSelect.value;
				if (selectedOption === "debit-card") {
					debitCardDetails.style.display = "block";
				} else if (selectedOption === "upi") {
					upiDetails.style.display = "block";
				}
			});
		});
	</script>



</body>
</html>

