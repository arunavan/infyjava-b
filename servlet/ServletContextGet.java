//ServletContext - to get an attribute
package com.nexwave.servlets;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.*;

public class ServletContextGet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws 
   ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter( );
		ServletConfig config = getServletConfig( );
		ServletContext ctx = config.getServletContext( );

		pw.println(ctx.getAttribute("goldrate"));   // prints 5850.50
	}
}
