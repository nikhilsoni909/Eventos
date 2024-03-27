<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


    <header class="header header_style_01">
        <!-- Your header content goes here -->
    </header>

    <div class="banner-area banner-bg-1">
        <!-- Your banner content goes here -->
    </div>

    <div id="portfolio" class="section wb">
        <div class="container">
            <div class="section-title text-center">
                <h3>Book now</h3>
                <p class="lead">Secure your spot now and be a part of the excitement! Book your tickets today for an unforgettable event experience.</p>
            </div><!-- end title -->
        </div><!-- end container -->

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div id="da-thumbs" class="da-thumbs portfolio">
                        <!-- Iterate over the list of events and generate dynamic cards -->
                        <c:forEach var="event" items="${events}">
                            <div class="post-media pitem item-w1 item-h1">
                                <a href="${event.eventBanner}" data-rel="prettyPhoto[gal]">
                                    <img src="${event.eventBanner}" alt="" class="img-responsive">
                                    <div>
                                        <h3>${event.eventName} <small>${event.eventCity}</small></h3>
                                        <i class="flaticon-unlink"></i>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div><!-- end portfolio -->
                </div>
            </div>
        </div><!-- end container -->
    </div><!-- end section -->

    <footer class="footer">
        <!-- Your footer content goes here -->
    </footer>

    <!-- Bootstrap JS -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>