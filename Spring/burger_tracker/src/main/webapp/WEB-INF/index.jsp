<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Burger Tracker</title>
</head>
<body>
    <h1>Burger Tracker</h1>
<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating (out of 5)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.burgerName}"/></td>
				<td><c:out value="${burger.restaurantName}"/></td>
				<td><c:out value="${burger.rating}"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>