<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Events</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
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