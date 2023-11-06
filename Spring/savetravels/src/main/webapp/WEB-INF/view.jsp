<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save Travels</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
</head>
<body>
    <h1>Expense Details</h1>
    <h4>Expense Name:</h4>
    <p><c:out value="${expense.name}"/></p>
    <h4>Vendor Name:</h4>
    <p><c:out value="${expense.vendor}"/></p>
    <h4>Amount:</h4>
    <p><c:out value="${expense.amount}"/></p>
    <h4>Description</h4>
    <p><c:out value="${expense.description}"/></p>
    <a href="/">Go Back</a>

</body>
</html>