<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/16/2023
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: green">${mes}</h1>
<br>
<h1>Languages: ${mailbox.languages}</h1>
<br>
<h1>Page Size: ${mailbox.pageSize}</h1>
<br>
<h1>Spams filter: ${mailbox.spamsFilters}</h1>
<br>
<h1>Signature: ${mailbox.signature}</h1>
<a href="/mailbox/setting">Update</a>
</body>
</html>
