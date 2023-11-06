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
    <h1>Save Travels</h1>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Expense</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="expense" items="${expenses}">
                <tr>
                    <td><a href="/expenses/${expense.id}"><c:out value="${expense.name}"/></a></td>
                    <td><c:out value="${expense.vendor}"/></td>
                    <td><c:out value="${expense.amount}"/></td>
                    <td><a href="/edit/${expense.id}">edit</a></td>
                    <td><form action="/delete/${expense.id}" method="post">
                        <input type="hidden" name="_method" value="DELETE">
                        <button type="submit"><a>Delete</a></button>
                    </form></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <h2>Add an expense:</h2>
    <form:form action="/addExpense" mode="post" modelAttribute="expense">
        <div>
            <form:label path="name">Expense Name:</form:label><br>
            <form:input path="name" style="width:250px;"/>
            <form:errors path="name" class="text-danger"/>
        </div>
        <div>
            <form:label path="vendor">Vendor:</form:label><br>
            <form:input path="vendor" style="width:250px;"/>
            <form:errors path="vendor" class="text-danger"/>
        </div>
        <div>
            <form:label path="amount">Amount:</form:label><br>
            <form:input path="amount" style="width:250px;"/>
            <form:errors path="amount" class="text-danger"/>
        </div>
        <div>
            <form:label path="description">Description</form:label><br>
            <form:textarea path="description" rows="3" style="width:250px;"/>
            <form:errors path="description" class="text-danger"/>
        </div>
        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form:form>
</body>
</html>