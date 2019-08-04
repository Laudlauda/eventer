<%--
  Created by IntelliJ IDEA.
  User: W530
  Date: 2019-07-28
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Events</title>
</head>
<body>
<h2>Add event</h2>
<a href="/events/add">Add</a>
<h1>Events list:</h1>
<c:forEach var="event" items="${events}">
    <div>${event.name} - ${event.date}  <a href ="/events/${event.id}">View</a> </div>
</c:forEach>

</body>
</html>
