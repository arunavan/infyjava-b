<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix = "gr" uri = "/WEB-INF/tlds/greeting.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Custom Tags</title>
	</head>
	<body>
		<gr:greeting></gr:greeting>
		<gr:greet fname="Raj"></gr:greet>
		<gr:greet fname="Raj" lname="Aseel"></gr:greet>
	</body>
</html>
