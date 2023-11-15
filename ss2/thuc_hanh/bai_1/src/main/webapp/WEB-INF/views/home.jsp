<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/2023
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Email Validate</h1>
    <h3 style="color: red">${mess}</h3>
    <form action="/validate" method="post">
        <input type="text" name="email">
        <input type="submit" value="validate">
    </form>
</body>
</html>
