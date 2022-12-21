//ServletConfig Demo
package com.nexwave.servlets;
import javax.servlet.*;
import javax.servlet.http.* ;
import java.io.* ;		
import java.util.*;
public class ConfigDemo extends HttpServlet   
{
	public void service(HttpServletRequest req, HttpServletResponse res ) throws 
  ServletException, IOException  
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter( );


		ServletConfig config = getServletConfig( ); 
					// getServletConfig( ) is from GenericServlet

		pw.println("Servlet Name: " + config.getServletName( ) + "<BR>");  

 // prints <servlet-name> of web.xml file. In this case yourConfigDemo1
		String str1 = config.getInitParameter("Eno");
		pw.println("Employee No is " + str1 + "<BR>");

// to print all init-param names at a time
		java.util.Enumeration e = getInitParameterNames( );
		while(e.hasMoreElements( ) )
		{
	             String name = (String) e.nextElement( );  // returns the <param-name> 
	          String value = config.getInitParameter(name);  // returns <param-value> 
                                pw.println("<br>" + name + " : " + value ); 
		}
		pw.close( );
	}
}
/* web.xml

<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.4" xmlns="http://java.sun.com/xml/ns/j2ee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
    <servlet>
        <servlet-name>ConfigDemo</servlet-name>
        <servlet-class>ConfigDemo</servlet-class>
        <init-param>
            <param-name>Eno</param-name>
            <param-value>111</param-value>
        </init-param>
        <init-param>
            <param-name>Ename</param-name>
            <param-value>xxx</param-value>
        </init-param>
        <init-param>
            <param-name>sal</param-name>
            <param-value>5000</param-value>
        </init-param>
            
    </servlet>
    <servlet-mapping>
        <servlet-name>ConfigDemo</servlet-name>
        <url-pattern>/ConfigDemo</url-pattern>
    </servlet-mapping>
    <session-config>
        <session-timeout>
            30
        </session-timeout>
    </session-config>
    <welcome-file-list>
	<welcome-file>
            index.jsp
        </welcome-file>
    </welcome-file-list>
</web-app>
*/