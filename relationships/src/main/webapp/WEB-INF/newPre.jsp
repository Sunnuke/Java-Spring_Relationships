<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row align-items-start">
			<h1>New Person</h1>
		</div>
		<div class="row">
			<div class="col">
				<form:form action="/Person" method="post" modelAttribute="person">
					<form:input path="firstName" placeholder="First Name"/><br>
					<br><form:input path="lastName" placeholder="Last Name"/><br>
					<br><br><form:button type="submit">Create</form:button><br>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>