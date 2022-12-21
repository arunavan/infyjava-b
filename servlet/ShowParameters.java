//Reading all parameters from the HTML form - ShowParametersPostForm.html
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class ShowParameters extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String title = "Reading All Request Parameters";
out.println("<html>\n"+
                "<head><title>" + title + "</title></head>\n"+
                "<body bgcolor=pink>\n"+
                "<h1 align=center>" + title + "</h1>\n"+
                "<table border=1 align=center>\n"+
                "<tr bgcolor=cyan>\n"+
                "<th>Parameter Name<th>Parameter Values(s)");
Enumeration paramNames = req.getParameterNames();
while(paramNames.hasMoreElements())
{
String paramName = (String)paramNames.nextElement();
out.print("<tr><td>" + paramName + "\n<td>");
String[] paramValues = req.getParameterValues(paramName);
if(paramValues.length == 1)
{
String paramValue = paramValues[0];
if (paramValue.length() == 0)
out.println("<i>No Value</i>");
else
out.println(paramValue);
}
else
{
out.println("<ul>");
for(int i=0;i<paramValues.length;i++)
{
out.println("<li>" + paramValues[i]);
}
out.println("</ul>");
}
}
out.println("</table>\n</body></html>");
}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
doGet(req,res);
}
}
