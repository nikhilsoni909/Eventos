<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="stylesheet" href="./css/particularEvent.css">
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

	   <%@ include file="customerNavbar.jsp"%>

	<div id="about" class="section wb">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="message-box">
						<h2 class="red">${event.eventName}</h2>
						<h4>${event.eventCity},${event.eventVenue}</h4>
						<h4>Date And Time:${event.eventDateTime}</h4>
						<p class="lead">${event.eventDescription}</p>
						<button class="btn btn-primary button-40" role="button"
							id="powerBtn">Book Tickets</button>
						<br>

					</div>
					<!-- end messagebox -->
				</div>
				<!-- end col -->
				<div class="col-md-6">
					<div class="post-media wow fadeIn">
						<img src="${event.eventBanner}" alt=""
							class="img-responsive img-rounded">
					</div>
					<!-- end media -->
				</div>
				<!-- end col -->
			</div>
			<!-- end row -->
		</div>
		<!-- end container -->
	</div>
	<!-- end section -->
	<div class="card bg-warning text-dark text-center">
		<div class="card-body">
			<h4 class="card-title">
				Important Note:
				</h5>
				<p class="card-text">Please note that you can only book one type
					of ticket at a time.</p>
		</div>
	</div>
	<!-- Ticket Categories Container -->
	<div id="ticketCategories" class="container mx-auto justify-content-center" style=" display: none;">

		<!-- Dynamic content will be added here -->
	</div>

	<!-- Total Price Container -->
	<div class="container mt-5" id="totalPriceContainer"
		style="display: none;">
		<h3 class="mb-4">
			Total Price: <span id="totalPrice">₹0</span>
		</h3>
	<a href="#" id="payLink"> 
		<button class="btn btn-success" id="payBtn">Pay</button>
	</a>
	
		<!-- Pay button -->
	</div>

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
	  var total_quantity=0;
      var total_amount=0;
      var final_ticket_type_id=0;
      var  total_ticket_quantity=0;
        document.getElementById('powerBtn').addEventListener('click', function(event) {
    // Prevent default behavior of anchor links
    event.preventDefault();

    // Show ticket categories container
    document.getElementById('ticketCategories').style.display = 'block';
    // Create ticket categories dynamically
    createTicketCategories();
    // Smooth scroll to the ticket categories section
    document.getElementById('powerBtn').scrollIntoView({
        behavior: 'smooth'
    });
});

         //variable for total quantity of tickets and total amount
        
      
        function createTicketCategories() {
            var ticketTypes = [
                <c:forEach var="ticketType" items="${ticketTypes}">
                    {
                        ticketId: ${ticketType.ticketId},
                        eventId: ${ticketType.eventId},
                        ticketType: '${ticketType.ticketType}',
                        ticketPrice: ${ticketType.ticketPrice},
                        ticketQuantity: ${ticketType.ticketQuantity}
                    }<c:if test="${!loop.last}">,</c:if>
                </c:forEach>
            ];

            var container = document.getElementById('ticketCategories');
            container.innerHTML = '';

            // Global variables to store the currently selected ticket type and its quantity
            var selectedTicketType = null;
            var selectedTicketQuantity = 0;
            var totalPrice = 0;

            // Reference to the total price element
            var totalPriceElement = document.getElementById('totalPrice');

            // Function to create a ticket category container
            function createCategoryContainer(ticketType) {
                // Create category container
                var categoryContainer = document.createElement('div');
                categoryContainer.classList.add('row', 'ticket-category','justify-content-center');
                categoryContainer.style.width = '100%'; 
                // Create category title element
                var categoryTitle = document.createElement('div');
                categoryTitle.classList.add('col-md-3');
                categoryTitle.innerHTML = '<h3>' + ticketType.ticketType + '</h3>';

                // Create price element
                var priceElement = document.createElement('div');
                priceElement.classList.add('col-md-3', 'text-right');
                priceElement.innerHTML = '<span class="font-weight-bold">₹' + ticketType.ticketPrice + '</span>';

                // Create available element
                var availableElement = document.createElement('div');
                availableElement.classList.add('col-md-3', 'text-right');
                availableElement.innerHTML = '<span class="font-weight-bold">Available: ' + ticketType.ticketQuantity + '</span>';

                // Create buttons container
                var buttonsContainer = document.createElement('div');
                buttonsContainer.classList.add('col-md-3', 'text-right');

                // Create minus button
                var minusButton = document.createElement('button');
                minusButton.classList.add('btn', 'btn-secondary', 'btn-minus');
                minusButton.textContent = '-';
                minusButton.addEventListener('click', function() {
                    decreaseTickets(ticketType);
                });

                // Create ticket count input
                var ticketCount = document.createElement('input');
                ticketCount.type = 'number';
                ticketCount.value = 0;
                ticketCount.disabled = true;

                // Create plus button
                var plusButton = document.createElement('button');
                plusButton.classList.add('btn', 'btn-secondary', 'btn-plus');
                plusButton.textContent = '+';
                plusButton.addEventListener('click', function() {
                    increaseTickets(ticketType);
                });

                // Append elements to category container
                buttonsContainer.appendChild(minusButton);
                buttonsContainer.appendChild(ticketCount);
                buttonsContainer.appendChild(plusButton);
                categoryContainer.appendChild(categoryTitle);
                categoryContainer.appendChild(priceElement);
                categoryContainer.appendChild(availableElement);
                categoryContainer.appendChild(buttonsContainer);

                return categoryContainer;
            }

            // Function to reset quantity and total price to zero
            function resetQuantityAndTotal() {
                selectedTicketQuantity = 0;
                total_quantity=selectedTicketQuantity;
                totalPrice = 0;
                totalPriceElement.textContent = '₹0.00';
                container.querySelectorAll('input[type="number"]').forEach(function(input) {
                    input.value = 0;
                });
            }

            // Function to decrease ticket quantity
            function decreaseTickets(ticketType) {
            	final_ticket_type_id=ticketType.ticketId;
            	total_tickets_quantity=ticketType.ticketQuantity;
                if (selectedTicketType !== ticketType) {
                    resetQuantityAndTotal();
                    selectedTicketType = ticketType;
                }
                var ticketCountInput = event.target.parentElement.querySelector('input[type="number"]');
                var currentCount = parseInt(ticketCountInput.value);
                if (currentCount > 0) {
                    ticketCountInput.value = currentCount - 1;
                    selectedTicketQuantity = currentCount - 1;
                    //*
                    total_quantity=selectedTicketQuantity;
                    updateTotalPrice(ticketType.ticketPrice, -1,ticketType.ticketId);
                }
                console.log(total_quantity);
                console.log(total_amount);
                console.log(final_ticket_type_id);
            }

            // Function to increase ticket quantity
            function increaseTickets(ticketType) {
            	final_ticket_type_id=ticketType.ticketId;
            	total_tickets_quantity=ticketType.ticketQuantity;
                if (selectedTicketType !== ticketType) {
                    resetQuantityAndTotal();
                    selectedTicketType = ticketType;
                }

                var ticketCountInput = event.target.parentElement.querySelector('input[type="number"]');
                var currentCount = parseInt(ticketCountInput.value);
                if (currentCount < ticketType.ticketQuantity) {
                    ticketCountInput.value = currentCount + 1;
                    selectedTicketQuantity = currentCount + 1;
                    //*
                    total_quantity=selectedTicketQuantity;
                    updateTotalPrice(ticketType.ticketPrice, 1,ticketType.ticketId);
                }
                console.log(total_quantity);
                console.log(total_amount);
                console.log(final_ticket_type_id);
               
            }

            // Function to update total price
            function updateTotalPrice(ticketPrice, increment,ticketId) {
            	 console.log(total_tickets_quantity);
                totalPrice += ticketPrice * increment;
                total_amount=totalPrice;
                totalPriceElement.textContent = '₹' + totalPrice.toFixed(2);
               //***** code to set the  attributes in the request .we are setting the href of pay button here
                var payLink = document.getElementById('payLink');
                payLink.href = "paymentPage.jsp?totalAmount="+total_amount+"&ticketQuantity="+total_quantity+"&ticketId="+ticketId+"&eventId="+${event.eventId};
            }

            // Create ticket categories
            ticketTypes.forEach(function(ticketType) {
                var categoryContainer = createCategoryContainer(ticketType);
                container.appendChild(categoryContainer);
            });
            document.getElementById('totalPriceContainer').style.display = 'block';
            console.log(total_quantity);
            console.log(total_amount);
        }

    

        
       /* document.getElementById('payBtn').addEventListener('click', function() {
            var totalPrice = document.getElementById('totalPrice').textContent;
            alert('Total amount to be paid: ' + totalPrice);
            // Implement payment processing logic here
        });*/
        
console.log(total_quantity);
console.log(total_amount);

    </script>

</body>
</html>

