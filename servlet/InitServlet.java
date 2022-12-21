import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class InitServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("Init Parameters are : ");
		Enumeration enumeration = getServletConfig().getInitParameterNames();
		while(enumeration.hasMoreElements()){
			pw.print(enumeration.nextElement() + " ");
			}
		pw.println("\nThe email address is " + getServletConfig().getInitParameter("AdminEmail"));
		pw.println("The address is " + getServletConfig().getInitParameter("Address"));
		pw.println("The phone no is " + getServletConfig().getInitParameter("PhoneNo"));
	}
}


/*
web.xml should look like below

<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE web-app
 PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd">

<web-app>
 <servlet>
 <init-param>
 <param-name>AdminEmail</param-name>
 <param-value>zulfiqar_mca@yahoo.co.in</param-value>
 </init-param>
 <init-param>
 <param-name>Address</param-name>
 <param-value>Okhla</param-value>
 </init-param>
 <init-param>
 <param-name>PhoneNo</param-name>
 <param-value>9911217074</param-value>
 </init-param>
  <servlet-name>Zulfiqar</servlet-name>
  <servlet-class>InitServlet</servlet-class>
 </servlet>
 <servlet-mapping>
 <servlet-name>Zulfiqar</servlet-name>
 <url-pattern>/InitServlet</url-pattern>
 </servlet-mapping>
</web-app>
*/