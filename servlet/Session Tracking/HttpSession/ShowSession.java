//ShowSession - to display the session details
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class ShowSession extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
HttpSession session = req.getSession();
String heading;
Integer accessCount = (Integer)session.getAttribute("accessCount");
if(accessCount == null)
{
accessCount = new Integer(0);
heading = "Welcome, NewComer";
}
else
{
heading = "Welcome Back";
accessCount = new Integer(accessCount.intValue() + 1);
}
session.setAttribute("accessCount",accessCount);
PrintWriter out = res.getWriter();
String title = "Session Tracking Example";
out.println("<html>\n"+
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=pink>\n"+
            "<center>\n"+
            "<h1>" + heading + "</h1>\n" +
            "<h2>Information on your Session:</h2>\n" +
            "<table border=1>\n" +
            "<tr bgcolor=yellow>\n" +
            "<th> Info Type <th>Value\n" +
            "<tr>\n" +
            "<td>ID\n" +
            "<td>" + session.getId() + "\n" +
            "<tr>\n" +
            "<td>Creation Time\n" +
            "<td>" + new Date(session.getCreationTime()) + "\n" +
            "<tr>\n" +
            "<td>Time of Last Access\n" +
            "<td>" + new Date(session.getLastAccessedTime()) + "\n" +
            "<tr>\n" +
            "<td>Number of Previous Accesses\n" +
            "<td>" + accessCount + "\n" +
            "</table>\n" +
            "</center></body></html>");
}
}