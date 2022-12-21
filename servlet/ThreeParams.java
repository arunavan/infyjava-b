//Reading Three parameters from an HTML form - ThreeParamsForm.html
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ThreeParams extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String title = "Reading three Request Parameters";
out.println("<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor=\"blue\">\n"+
                "<h1 align=\"center\">"+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>param1</b>: "
                + req.getParameter("param1") + "\n" +
                "<li><b>param2</b>: "
                +req.getParameter("param2") + "\n" +
                "<li><b>param3</b>: "
                +req.getParameter("param3") + "\n" +
                "</ul>\n" +
                "</body></html>");
}
}