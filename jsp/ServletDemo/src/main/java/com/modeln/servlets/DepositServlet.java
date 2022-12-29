package com.modeln.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DepositServlet extends HttpServlet {
	/*
	 * ServletConfig sc; public void init(ServletConfig sc) throws ServletException
	 * { this.sc=sc;
	 * }
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //respons etype in browser
		PrintWriter out=response.getWriter();  //io class for display in browser
		out.println("welcome to Http Servlet/Axis bank application");
		out.println(request.getContextPath());
		String cname=request.getParameter("cname");
		Double balance=Double.parseDouble(request.getParameter("balance"));
		Double interest=balance*0.10;
		out.println("Customer name :"+cname.toUpperCase());
		out.println("Balance"+balance);
		out.println("Interest paid by bank"+interest);
		ServletConfig sc=getServletConfig();
		out.println("ServletConfig : static - by container"+sc.getInitParameter("oname"));
	    ServletContext sc1=sc.getServletContext();
		out.println("ServletContext: gobal static by container"+sc1.getInitParameter("country"));
		  
	}
}
/*
<form action="http://localhost:8080/ServletDemo/axis">
Customer NAme : <input type="text"  name="cname"/> <br>
BAlance : <input type="text" name="balance"/> <br>
Http : <input type="submit" value="Invoke HttpServlet"/>
</form>
*/







