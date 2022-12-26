package com.modeln.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //respons etype in browser
		PrintWriter out=response.getWriter();  //io class for display in browser
	    String id=request.getParameter("id");
	    String pwd=request.getParameter("pwd");
	    out.println(" Login details are "+id +"  "+ pwd);
	    request.setAttribute("id", id);
	    request.setAttribute("pwd", pwd);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("/Validate");
		    
	//    RequestDispatcher rd=request.getRequestDispatcher("valid.html");
	    rd.include(request, response);
		
	}

}
