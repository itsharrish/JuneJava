<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/static/custom.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Information</title>
</head>
<body>
<form:form action="insertEmployee.html" modelAttribute="employee" method="POST">
	
	<form:label path="e_id">Enter Employee ID:</form:label>
	<form:input path="e_id"/>
	<form:errors path="e_id"></form:errors><br><br>
	
	<form:label path="name">Enter Employee Name:</form:label>
	<form:input path="name"/>
	<form:errors path="name"></form:errors><br><br>
	
	<form:label path="deptt">Select Department:</form:label>
	<form:radiobuttons path="deptt" items="${departments}"/><br><br>
	<form:errors path="name"></form:errors><br><br>
	
	<form:label path="desig">Designation:</form:label>
	<form:select path="desig">
		<form:option value="">Select Designation</form:option>
		<form:options items="${designations}"/>
	</form:select><br><br>
	<form:errors path="name"></form:errors><br><br>

	<form:label path="basic">Enter Basic Salary:</form:label>
	<form:input path="basic"/>
	<form:errors path="basic"></form:errors><br><br>
	
	<input type="submit" value="Insert">
	
</form:form>
</body>
</html>