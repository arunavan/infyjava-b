package com.modeln.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //respons etype in browser
		PrintWriter out=response.getWriter();  //io class for display in browser
	 
		String id=(String)request.getAttribute("id");
		String pwd=(String)request.getAttribute("pwd");
		if(id.equals("modeln") && pwd.equals("modeln"))
			out.println("VALID");
		else
			out.println("Invalid");
	}

	

}
