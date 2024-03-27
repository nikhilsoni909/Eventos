<!DOCTYPE html>
<html lang="en">

    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
     <!-- Site Metas -->
    <title>Eventos</title>  
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
    </div><!-- end loader -->
    <!-- END LOADER -->
    
	
    <header class="header header_style_01">
        <nav class="megamenu navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand nigga" href="index.jsp"><h1 class="logotxt"><h1>Eventos</h1></h1></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a class="active" href="index.jsp">Home</a></li>
                        <li><a href="about-us.html">About us</a></li>
                        <li><a href="GetAllEventsServlet">Events</a></li>
                        <li><a href="contact.html">Contact</a></li>
                        <li><a href="CustomerLogin.html">Login</a></li>     
                    </ul>
                </div>
            </div>
        </nav>
    </header>
	
	<div class="slider-area">
		<div class="slider-wrapper owl-carousel">
			<div class="slider-item home-one-slider-otem slider-item-four slider-bg-one">
				<div class="container">
					<div class="row">
						<div class="slider-content-area">
							<div class="slide-text">
								<h1 class="homepage-three-title">Booking <span>Tickets</span> made easy.</h1>
								<h2>Experience the ease of booking tickets for your favorite events with just a few clicks. Say goodbye to hassle and hello to convenience. </h2>
								<div class="slider-content-btn">
									<a href="events.jsp"><button class="button-40" role="button">Book Now</button></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="slider-item text-center home-one-slider-otem slider-item-four slider-bg-two">
				<div class="container">
					<div class="row">
						<div class="slider-content-area">
							<div class="slide-text">
								<h1 class="homepage-three-title">Simplify Your <span>Event</span> Plans</h1>
								<h2>Unlock the simplicity of securing event tickets online. Discover, book, and enjoy with ease! </h2>
								<div class="slider-content-btn">
									<a href="events.jsp"><button class="button-40" role="button">Events</button></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="slider-item home-one-slider-otem slider-item-four slider-bg-three">
				<div class="container">
					<div class="row">
						<div class="slider-content-area">
							<div class="slide-text">
								<h1 class="homepage-three-title">Efficient <span>Ticket</span> Booking</h1>
								<h2>Save time and energy with our streamlined ticketing system. Reserve your tickets effortlessly and focus on enjoying the event.</h2>
								<div class="slider-content-btn">
								<a href="events.jsp"><button class="button-40" role="button">Explore Now</button></a>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


    <div class="parallax section noover" data-stellar-background-ratio="0.7" style="background-image:url('uploads/parallax_05.png');">
        <div class="container">
            <div class="row text-center">
                <div class="col-md-6">
                    <div class="customwidget text-left">
                        <h1>Hola Amigos!</h1>
                        <p>Welcome to Eventos - Your Ticket to Unforgettable Experiences! Start booking now!</p>
                        <ul class="list-inline">
                            <li><i class="fa fa-check"></i> Effortless</li>
                            <li><i class="fa fa-check"></i> Secure</li>
                            <li><i class="fa fa-check"></i> Fast</li>
                            <li><i class="fa fa-check"></i> Intuitive</li>
                        </ul><!-- end list -->
                        <button class="button-40" role="button">Start Booking</button>
                    </div> <br><br>
                </div><!-- end col -->
				<div class="col-md-6">
                    <div class="text-center image-center hidden-sm hidden-xs">
                        <img src="images/logos/logo.png" alt="" class="img-responsive wow fadeInUp">
                    </div>
                </div>
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->

    <div id="services" class="parallax section lb">
        <div class="container">
            <div class="section-title text-center">
                <h3>Upcoming Events</h3>
                <p class="lead">Explore the excitement that lies ahead with our upcoming events! From electrifying concerts to thrilling sports matches and captivating theater shows, we have something for everyone.</p>
            </div><!-- end title -->

            <div class="owl-services owl-carousel owl-theme">
                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/1.jpg" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/1.jpg" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Shreya Ghoshal</h3>
						<p>Aliquam sagittis ligula et sem lacinia, ut facilisis enim sollicitudin. Proin nisi est, convallis nec purus vitae, iaculis posuere sapien. Cum sociis natoque.</p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/2.jpg" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/2.jpg" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Prithvi Theatre</h3>
						<p>Duis at tellus at dui tincidunt scelerisque nec sed felis. Suspendisse id dolor sed leo rutrum euismod. Nullam vestibulum fermentum erat. It nam auctor. </p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/3.jpg" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/3.jpg" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Jodhpur Heritage Walk</h3>
						<p>Etiam materials ut mollis tellus, vel posuere nulla. Etiam sit amet lacus vitae massa sodales aliquam at eget quam. Integer ultricies et magna quis accumsan.</p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/4.png" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/4.png" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Gaurav Kapoor</h3>
						<p>Praesent in neque congue sapien lobortis faucibus id eget erat. <br>Pellentesque maximus rutrum felis. Interdum et malesuada fames ac </p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/5.jpg" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/5.jpg" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Book Reading</h3>
						<p>Etiam materials ut mollis tellus, vel posuere nulla. Etiam sit amet lacus vitae massa sodales aliquam at eget quam. Integer ultricies et magna quis accumsan.</p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/6.avif" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/6.avif" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Ed Sheeran</h3>
						<p>Etiam materials ut mollis tellus, vel posuere nulla. Etiam sit amet lacus vitae massa sodales aliquam at eget quam. Integer ultricies et magna quis accumsan.</p>
					</div>
                </div>
                <!-- end service -->

                <div class="service-widget">
                    <div class="post-media wow fadeIn">
                        <a href="uploads/7.jpg" data-rel="prettyPhoto[gal]" class="hoverbutton global-radius"><i class="flaticon-unlink"></i></a>
                        <img src="uploads/7.jpg" alt="" class="img-responsive img-rounded">
                    </div>
					<div class="service-dit">
						<h3>Ahemdabad Heritage Walk</h3>
						<p>Etiam materials ut mollis tellus, vel posuere nulla. Etiam sit amet lacus vitae massa sodales aliquam at eget quam. Integer ultricies et magna quis accumsan.</p>
					</div>
                </div>
                <!-- end service -->
            </div><!-- end row -->

        </div><!-- end container -->
    </div><!-- end section -->

    
    

    
	
    <!-- <div id="features" class="section lb">
        <div class="container">
            <div class="section-title text-center">
                <h3>Features & Overviews</h3>
                <p class="lead">Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, <br>lorem quis bibendum auctor, nisi elit consequat ipsum, nec sagittis sem!</p>
            </div>

            <div class="row">
                <div class="col-md-4 col-sm-6 col-xs-12">
                    <ul class="features-left">
                        <li class="wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.2s">
                            <i class="flaticon-wordpress-logo"></i>
                            <div class="fl-inner">
                                <h4>WordPress Installation</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.3s">
                            <i class="flaticon-windows"></i>
                            <div class="fl-inner">
                                <h4>Browser Compatible</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.4s">
                            <i class="flaticon-price-tag"></i>
                            <div class="fl-inner">
                                <h4>eCommerce Ready</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInLeft" data-wow-duration="1s" data-wow-delay="0.5s">
                            <i class="flaticon-new-file"></i>
                            <div class="fl-inner">
                                <h4>Easy to Customize</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4 hidden-xs hidden-sm">
                    <img src="uploads/ipad.png" class="img-center img-responsive" alt="">
                </div>
                <div class="col-md-4 col-sm-6 col-xs-12">
                    <ul class="features-right">
                        <li class="wow fadeInRight" data-wow-duration="1s" data-wow-delay="0.2s">
                            <i class="flaticon-pantone"></i>
                            <div class="fr-inner">
                                <h4>Limitless Colors</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInRight" data-wow-duration="1s" data-wow-delay="0.3s">
                            <i class="flaticon-cloud-computing"></i>
                            <div class="fr-inner">
                                <h4>Lifetime Update</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInRight" data-wow-duration="1s" data-wow-delay="0.4s">
                            <i class="flaticon-line-graph"></i>
                            <div class="fr-inner">
                                <h4>SEO Friendly</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                        <li class="wow fadeInRight" data-wow-duration="1s" data-wow-delay="0.5s">
                            <i class="flaticon-coding"></i>
                            <div class="fr-inner">
                                <h4>Simple Clean Code</h4>
                                <p>Lorem Ipsum dolroin gravida nibh vel velit auctor aliquet. </p>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    -->

   

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
                            <li><a href="/index.jsp">Home <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="about-us.html">About <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="events.jsp">Events <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="contact.html">Contact <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="CustomerLogin.html">Login <span class="icon icon-arrow-right2"></span></a></li>
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