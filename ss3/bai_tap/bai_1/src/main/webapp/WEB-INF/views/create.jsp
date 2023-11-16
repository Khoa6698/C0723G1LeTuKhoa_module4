<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/16/2023
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="setting" modelAttribute="mailbox" method="post">
    <form:hidden path="id"/>
    Languages:
    <form:select path="languages">
        <form:options items="${languages}"/>
    </form:select>
    <br>
    Page Size:
    Show <form:select path="pageSize">
        <form:options items="${pageSize}"/>
    </form:select> emails per page
    <br>
    Spams filter:
    <form:checkbox path="spamsFilters"/>
    <br>
    Signature:
    <form:input path="signature"/>
    <br>
    <form:button>Update</form:button>
</form:form>
</body>
</html>
