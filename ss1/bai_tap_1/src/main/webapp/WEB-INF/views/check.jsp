<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/14/2023
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Chuyển đổi từ USD sang VND</h2>
<form action="/convert" method="post">
    <tr>
        <td>USD: </td>
        <td><input type="number" name="usd"></td>
    </tr>
    <tr>
        <td><button type="submit">VND</button></td>
    </tr>
</form>
<h3>VND: ${vnd}</h3>
</body>
</html>
