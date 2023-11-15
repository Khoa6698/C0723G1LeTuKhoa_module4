<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/2023
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/caculator" method="post">
    <tr>
        <td>
            <label for="number1">Number 1: </label>
            <input required type="number" id="number1" name="number1">
        </td>
        <td>
            <label for="number2">Number 2: </label>
            <input required type="number" id="number2" name="number2">
        </td>
    </tr>
    <br>
    <br>
    <tr>
        <td>
            <button type="submit" value="addition" name="caculator">Addition(+)</button>
        </td>
        <td>
            <button type="submit" value="subtraction" name="caculator">Subtraction(-)</button>
        </td>
        <td>
            <button type="submit" value="multiplication" name="caculator">Multiplication(X)</button>
        </td>
        <td>
            <button type="submit" value="division" name="caculator">Division(/)</button>
        </td>
    </tr>
</form>
<p>${result}</p>
</body>
</html>
