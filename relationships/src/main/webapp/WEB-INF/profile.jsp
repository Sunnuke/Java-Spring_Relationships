<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row align-items-start">
			<h1>${person.firstName} ${person.lastName}</h1>
		</div>
		<div class="row">
			<div class="col">
				<p>License Number: </p>
				<p>State: </p>
				<p>Expiration Date: </p>
			</div>
			<div class="col">
				<p>${License.number}</p>
				<p>${License.state}</p>
				<p>${License.expirationDate}</p>
			</div>
		</div>
	</div>
</body>
</html>