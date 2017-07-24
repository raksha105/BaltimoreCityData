<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


	<h2>Restaurant Information</h2>
	
	<div class="container">
	<form:form method="POST"
		action="http://localhost:8080/BaltimoreCityData/addResult">
		
		<ul>
		
		<div class="form-group">


			<form:label path="name" style="align:right">Name</form:label>
			<form:input path="name" class="form-control" size="50" />
		</div>

		<div class="form-group">

			<form:label path="zipcode">zipcode</form:label>
			<form:input type="number" path="zipcode" class="form-control" min = "21200" max="22000"/>
		</div>

		<div class="form-group">

			<form:label path="neighborhood">neighborhood</form:label>
			<form:input path="neighborhood" class="form-control" size="50"/>
		</div>
		<div class="form-group">


			<form:label path="councildistrict">councildistrict</form:label>
			<form:input path="councildistrict" class="form-control" size="50" />
		</div>



		<div class="form-group">

			<form:label path="policedistrict">policedistrict</form:label>
			<form:input path="policedistrict" class="form-control" size="50"/>
		</div>
		<div class="form-group">

			<form:label path="location_1_city">location_1_city</form:label>
			<form:input path="location_1_city" class="form-control" size="50"/>
		</div>
		<div class="form-group">


			<form:label path="location_1_state">location_1_state</form:label>
			<form:input path="location_1_state" class="form-control" size="50"/>
		</div>
		<div class="form-group">

			<form:label path="location_1_address">location_1_address</form:label>
			<form:input path="location_1_address" class="form-control" size="50"/>
		</div>
	<input type="submit" value="Submit" class="btn btn-primary"/>
		</ul>
		
	</form:form>
	</div>


</body>
</html>