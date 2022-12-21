//Connects to the users table and inserts login details
package com.nexwave.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
PrintWriter pw=res.getWriter();
String uname=req.getParameter("uname");
String pwd = req.getParameter("pwd");
Connection con;
PreparedStatement st;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/ts_database","root","root");
st=con.prepareStatement("insert into users values('"+uname+"','"+pwd+"')");
int i=0;i=st.executeUpdate();
if(i!=0) 
	pw.println("Registered Successfully");
else
pw.println("Not Registered");
}catch(Exception e){pw.println(e);}
}
}
