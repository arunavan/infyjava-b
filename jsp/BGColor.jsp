<html>
<head>
<title>Color Testing</title>
</head>
<%
String bgColor = request.getParameter("bgColor");
if((bgColor == null) || (bgColor.trim().equals("")))
{
bgColor = "white";
}
%>
<body bgcolor="<%= bgColor %>">
<h2 align="center">Testing a Background of "<%= bgColor %>"</h2>
</body></html>
