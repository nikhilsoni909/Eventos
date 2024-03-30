
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
					<a class="navbar-brand nigga" href="OrganizerEventsServlet"><h1
							class="logotxt">
							<h1>Eventos</h1>
						</h1></a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a  href="index.jsp">Home</a></li>
						<li><a href="GetAllEventsServlet">Events</a></li>
                        <li><a  href="about-us.jsp">About us</a></li>
                        <li><a href="contact.jsp">Contact</a></li>
						<li><a class="
						<%
						if(session.getAttribute("customer_name")==null) out.print("active");
						%>
						" href="
						<%
						
						
						if(session.getAttribute("customer_name") != null) out.print("userHome.jsp");
						else out.print("CustomerLogin.jsp");
						%>
						">
						<%
						System.out.println(session.getAttribute("customer_name"));
						if(session.getAttribute("customer_name") != null) out.print("Profile");
						else out.print("Login");
						%>
						
						
						</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
</body>
</html>