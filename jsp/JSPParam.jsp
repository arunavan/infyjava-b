<html>
<head>
	<title>Use JSP Forward</title>
</head>
<body>
<% if(request.getParameter(“companyID”).equals(“1”)){
		%>
		<jsp:forward page=“NewPage.jsp”>
			<jsp:param name=“employee” value=“Joe” />
			<jsp:param name=“title” value=“Engineer” />
		</jsp:forward>
<%}%>
</body>
</html>
