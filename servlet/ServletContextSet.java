//ServletContext to set an attribute
package com.nexwave.servlets;
import javax.servlet.*;  
import javax.servlet.http.*;
import java.io.*;
public class ServletContextSet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws 
   ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter( );
		ServletConfig config = getServletConfig( );
		ServletContext ctx = config.getServletContext( );  
 ctx.setAttribute("goldrate","5850.50");
		pw.println(ctx.getAttribute("goldrate"));
		
		pw.println("<br>The Server Information: "+ctx.getServerInfo( ));
		
	}
}
