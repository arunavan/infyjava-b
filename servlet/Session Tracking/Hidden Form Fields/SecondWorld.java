//Session Tracking - using Hidden Form Fields
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondWorld extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
     String username = req.getParameter("user");
     PrintWriter out = res.getWriter();
     out.println("Hello! "+username);	
 }// end of doPost() method
}// end of SecondWorld class
