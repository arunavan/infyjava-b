//Session Tracking using URL Rewriting
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class URLSecondWorld extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
     String username = req.getParameter("uname");
     res.setContentType("text/html");
     PrintWriter out = res.getWriter();
     out.println("Hello! "+username);	
 }// end of doPost() method
}// end of URLSecondWorld class
