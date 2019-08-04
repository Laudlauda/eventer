<%--
  Created by IntelliJ IDEA.
  User: W530
  Date: 2019-08-04
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new event</title>
</head>
<body>
<h1>Add new event</h1>
<form action="/events" method="post">
    <label>Name:</label>
    <input type="text" name="title"/><br>
    <label>Date:</label>
    <input type="datetime-local" name="date"/><br>
    <label>Content</label>
    <textarea row="5" col="30" name="content"></textarea>
    <input type="submit" value="Add">
</form>

</body>
</html>
