//Session Tracking using URL Rewriting 
//Use URL.html
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class URLFirstWorld extends HttpServlet
{
  public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
     String username = req.getParameter("user");
     res.setContentType("text/html");
     PrintWriter out = res.getWriter();
     out.println("Hello! <a href=http://localhost:8080/WebProj/URLSecondWorld?uname="+username+"> Click Here </a> to proceed");	
 }// end of doPost() method
}// end of URLFirstWorld class
