import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetParameterValues extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String[] whisky = request.getParameterValues("whisky");
		for(int i=0; i<whisky.length; i++){
			pw.println("<br>whisky : " + whisky[i]);
		}
	}
}

/*

**************Index.html**************

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "/GetParameterServlet/GetParameterValues">
<p>Which of the whisky you like most</p>
<input type = "checkbox" name ="whisky" value = "RoyalChallenge">
  RoyalChallenge.<br>
<input type = "checkbox" name ="whisky" value = "RoyalStag">RoyalStag.<br>
<input type = "checkbox" name ="whisky" value = "Bagpiper">Bagpiper.<br>
<input type ="submit" name= "submit">
</form>
</body>
</html>
*/

/*
**************web.xml**************

<?xml version="1.0" encoding="ISO-8859-1"?>
<!--<!DOCTYPE web-app
 PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd"> -->

<web-app>
 <servlet>
  <servlet-name>Hello</servlet-name>
  <servlet-class>GetParameterValues</servlet-class>
 </servlet>
 <servlet-mapping>
 <servlet-name>Hello</servlet-name>
 <url-pattern>/GetParameterValues</url-pattern>
 </servlet-mapping>
</web-app>
*/