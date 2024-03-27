<%@ page import="java.util.List" %>
<%@ page import="eventos.models.Events" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Events</title>
</head>
<body>
    <h1>Events</h1>
    <%
        List<Events> events = (List<Events>) request.getAttribute("events");
        if(events != null) {
            for (Events event : events) {
    %>
        <div class="event-card">
            <h2><%= event.getEventName() %></h2>
            <p><strong>Venue:</strong> <%= event.getEventVenue() %></p>
            <p><strong>Category:</strong> <%= event.getEventCategory() %></p>
            <p><strong>Date & Time:</strong> <%= event.getEventDateTime() %></p>
            <p><strong>Description:</strong> <%= event.getEventDescription() %></p>
            <!-- Add more details as needed -->
        </div>
    <%
            }
        } else {
            %>
            <p>No events found</p>
            <% 
        }
    %>
</body>
</html>
