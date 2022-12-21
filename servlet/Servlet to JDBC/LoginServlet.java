//LoginServlet - to validate the login details in users table
//Login.html form to input the login details
//If login successful redirects to  Login.html using sendRedirect()
//If login not successful connects to RegisterServlet using RequestDispatcher
package com.nexwave.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
PrintWriter pw=res.getWriter();
RequestDispatcher rd;
Connection con;
PreparedStatement st;
ResultSet rs;
res.setContentType("text/html");
try{ 
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/ts_database","root","root");
String uname=req.getParameter("uname");
String pwd=req.getParameter("pwd");
st=con.prepareStatement("select * from users where uname='"+uname+"' and password='"+pwd+"'");
rs=st.executeQuery();
if(rs.next())
{
	pw.println("<html>");
	pw.println("<body>");
	pw.println("<script type=\"text/javascript\">");
	pw.println("alert(\"Login Successful\")");
	pw.println("</script>");
	pw.println("</body>");
	pw.println("</html>");
    res.sendRedirect("/WebProj1/Login.html");
}
else
{
pw.println("<html>");
pw.println("<head>");
pw.println("<script type=\"text/javascript\">");
pw.println("alert(\"Login Not Successful\")");
pw.println("</script>");
pw.println("</head>");
pw.println("</html>");
rd=req.getRequestDispatcher("/RegisterServlet");
rd.forward(req,res);}
}catch(Exception e){pw.println(e);}
}
}
