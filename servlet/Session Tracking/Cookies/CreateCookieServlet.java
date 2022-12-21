//To create a cookie by reading data from Item.html
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateCookieServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie1 = new Cookie("itemno",request.getParameter("ino"));
		Cookie cookie2 = new Cookie("itemname",request.getParameter("iname"));
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		cookie1.setMaxAge(60*60*24);
		cookie2.setMaxAge(60*60*24);
		PrintWriter out = response.getWriter();
		out.println("Cookies Example");
		out.println("Item Number:"+request.getParameter("ino"));
		out.println("Item Name:"+request.getParameter("iname"));
		
	}

	
}
