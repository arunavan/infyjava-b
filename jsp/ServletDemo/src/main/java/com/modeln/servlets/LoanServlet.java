package com.modeln.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoanServlet extends GenericServlet {
	
     public void init()throws ServletException {
    	 
     }
	
     public void destroy() {
    	 
     }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //respons etype in browser
		PrintWriter out=response.getWriter();  //io class for display in browser
		out.println("welcome to Generic Servlet");
		
	}

	

}
