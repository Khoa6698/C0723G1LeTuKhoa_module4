<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/14/2023
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 1px solid #000;
        }

        th, td {
            border: 1px dotted #555;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${list}" var="list" varStatus="loop">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.email}</td>
            <td>${list.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
