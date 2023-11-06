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
<br>
<h2>Add new burger</h2>
<form:form action="/addBurger" mode="post" modelAttribute="burger">
	<div>
		<form:label path="burgerName">Burger Name:</form:label><br>
		<form:errors path="burgerName" class="text-danger"/>
		<form:input path="burgerName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="restaurantName">Restaurant Name:</form:label><br>
		<form:errors path="restaurantName" class="text-danger"/>
		<form:input path="restaurantName" style="width:250px;"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:errors path="rating" class="text-danger"/>
		<form:input path="rating" style="width:250px;"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:errors path="notes" class="text-danger"/>
		<form:textarea path="notes" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>