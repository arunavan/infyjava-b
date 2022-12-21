<body>  
Standard user name and password are taken from the application level.<hr>
<%
	String str1 = (String) application.getAttribute("stduser");
	String str2 = (String) application.getAttribute("stdpass");

	if( str1.equals("snrao") && str2.equals("java") )  
		out.println("User name and password are VALID");
	else
		out.println("User name and password are INVALID");
%>   </body>
