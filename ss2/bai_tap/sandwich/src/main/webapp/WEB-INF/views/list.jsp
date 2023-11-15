<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/2023
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
  <input type="checkbox" name="condiment" value="Lettuce">Lettuce
  <input type="checkbox" name="condiment" value="Tomato">Tomato
  <input type="checkbox" name="condiment" value="Mustard">Mustard
  <input type="checkbox" name="condiment" value="Sprouts">Sprouts
  <br>
  <button type="submit">Save</button>
</form>
<p>${condiment}</p>
</body>
</html>
