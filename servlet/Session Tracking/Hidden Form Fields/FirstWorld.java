//Session Tracking using Hidden Form Fields
//Use HiddenForm.html
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstWorld extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
     String username = req.getParameter("user");
     PrintWriter out = res.getWriter();
     out.println("Welcome! Click To Proceed….");
     out.println("<form name=login action=http://localhost:8080/WebProj/SecondWorld>");
    out.println("<input type=hidden name=user value="+username+">");
    out.println("<input type=submit value=submit></form>");
 }// end of doPost() method
}// end of FirstWorld class
