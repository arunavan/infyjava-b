package com.modeln.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/bank",initParams = { 
		   @WebInitParam(name = "city", value = "Hyderabad "), 
		   @WebInitParam(name = "state", value = " Telangana") 
		}
)
public class BankServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<br> Served at: ").append(request.getContextPath());
		ServletConfig sc=getServletConfig();
		response.setContentType("text/html"); //respons etype in browser
		PrintWriter out=response.getWriter();  //io class for display in browser
		
	//	out.println("ServletConfig : static - by container"+sc.getInitParameter("oname"));
		out.println("<br> ServletConfig : static - by container"+sc.getInitParameter("city"));
		out.println("<br> ServletConfig : static - by container"+sc.getInitParameter("state"));
		
		ServletContext sc1=sc.getServletContext();
		out.println("<br> ServletContext: gobal static by container"+sc1.getInitParameter("country"));
	
	}

}
