//A Servlet that generates HTML
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
out.println("<HTML>\n"+
                "<HEAD><TITLE>Hello</TITLE></HEAD>\n"+
                "<BODY BGCOLOR=BLUE>\n"+
                "<H1>Welcome</H1>\n"+
                "</BODY></HTML>");
}
}