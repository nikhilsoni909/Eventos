<%@page import="java.sql.SQLException"%>
<%@page import="java.util.List"%>
<%@page import="eventos.models.MyTicket"%>
<%@page import="eventos.services.impl.TicketTypeDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Meta tags and other head content -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>Eventos - My Tickets</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
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
 <% 
            TicketTypeDAOImpl myTicketsDAO = new TicketTypeDAOImpl();
            int customerId = (int)session.getAttribute("customer_id"); // Replace with the actual customer ID
            //int customerId=100;
            List<MyTicket> myTicketsList = null;
            try {
                myTicketsList = myTicketsDAO.getMyTickets(customerId);
            } catch (SQLException e) {
                e.printStackTrace();
            }
         
        %>
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
    </div><!-- end loader -->
    <!-- END LOADER -->
      <%@ include file="customerNavbar.jsp"%>
    
    
    <div id="services" class="parallax section lb">
        <div class="container">
            <div class="section-title text-center">
                <h3>My Tickets</h3>
            </div><!-- end title -->
            <!-- Tickets Container -->
            <div class="row" id="eventsContainer">
               <% 
               if (myTicketsList != null && !myTicketsList.isEmpty()) {
            for (MyTicket ticket : myTicketsList) {
    %>
    <div class="col-md-4 mb-4">
        <div class="card h-100">
            <div class="card-body">
                <p class="card-text">Booking ID: <%= ticket.getTicketId() %></p>
                <h4 class="card-title" style="min-height: 56px;">Event: <%= ticket.getEventName() %></h5>
                <p class="card-text">Event Date : <%= ticket.getDate() %></p>
                <p class="card-text">Booking Date : <%= ticket.getBookingDate()%></p>
                <p class="card-text">City: <%= ticket.getCity() %></p>
                <p class="card-text">Seat Category: <%= ticket.getSeatCategory() %></p>
                <p class="card-text">Number of Seats: <%= ticket.getNumberOfSeats() %></p>
            </div>
        </div>
    </div>
    <% 
            }
        } else {
    %>
    <div class="col-md-12 text-center">
        <h1 >No tickets found.</p>
    </div>
    <% } %>
            </div> <br><br><br><br>
            
            <!-- End Tickets Container -->
        </div><!-- end container -->
    </div><!-- end section -->

    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <img src="images/logos/logo.png" alt="" / class="logo">
                        </div>
                        <p>Explore, Experience, Enjoy: Your one-stop destination for seamless event ticketing. Stay connected for updates, offers, and exclusive deals. Start planning your next adventure with us today!</p>
                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>
                    </div><!-- end clearfix -->
                </div><!-- end col -->

				<div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <h3>Pages</h3>
                        </div>

                        <ul class="footer-links hov">
                            <li><a href="/index.html">Home <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="about-us.html">About <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="events.html">Events <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="contact.html">Contact <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="login.html">Login <span class="icon icon-arrow-right2"></span></a></li>
                        </ul><!-- end links -->
                    </div><!-- end clearfix -->
                </div><!-- end col -->
				
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="footer-distributed widget clearfix">
                        <div class="widget-title">
                            <h3>Subscribe</h3>
							<p>Stay in the Loop! Subscribe for Exclusive Offers, Event Updates, and Early Access to Tickets. Join Now for a Front Row Seat to Your Favorite Experiences!</p>
                        </div>
						
						<div class="footer-right">
							<form method="get" action="#">
								<input placeholder="Subscribe our newsletter.." name="search">
								<i class="fa fa-envelope-o"></i>
							</form>
						</div>                        
                    </div><!-- end clearfix -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </footer><!-- end footer -->

    <div class="copyrights">
        <div class="container">
            <div class="footer-distributed">
                <div class="footer-left">                   
                    <p class="footer-company-name">All Rights Reserved. &copy; 2024 <a href="#">Eventos</a>
                </div>

                
            </div>
        </div><!-- end container -->
    </div><!-- end copyrights -->

    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>  
    
</body>



</html>