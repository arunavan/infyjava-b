<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.modeln.Employee" scope="session"/>
<html>
<body>
Name:<%= user.getUsername() %><br>
Desig:<%= user.getDesig() %><br>
Salary: <%= user.getSal() %><br>
</body>
</html>