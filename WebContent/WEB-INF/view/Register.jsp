<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
<center>
<br><br><br><br><br><br>
<div style="color: teal;font-size: 30px">Being Java Guys | Registration Form</div>
<br><br>
<c:url var="userRegistration" value="saveUser.html"/>
<!--
 var userRegistration and its value is utilized in defining action of form  
-->
<spring:form id="registerForm" modelAttribute="user" method="post" action="${userRegistration}">
<table width="400px" height="150px">
<tr>
<td><spring:label path="firstName">First Name</spring:label></td>
<td><spring:input  path="firstName"/></td>
</tr>
<tr>
<td><spring:label path="lastName">Last Name</spring:label></td>
<td><spring:input  path="lastName"/></td>
</tr>
<tr>
<td><spring:label path="gender">Gender</spring:label></td>
<td><spring:radiobuttons path="gender" items="${model.gender}"/></td>
</tr>
<tr>
<td><spring:label path="city">City</spring:label></td>
<td><spring:select path="city" items="${model.city}"></spring:select></td>
</tr>
<tr><td></td><td>
<input type="submit" value="Register" />
</td></tr>
</table>
</spring:form>
<br>
<a href="userList.html" >Click Here to see User List</a>
</center>
</body>
</html>