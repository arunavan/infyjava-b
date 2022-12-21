//Reading Cookies - created by CreateCookieServlet
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadingCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadingCookieServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Cookie[] c = request.getCookies();
		for(int i = 0;i<c.length;i++)
		{
			out.println(c[i].getName()+" "+c[i].getValue());
			
		}
	}

	

}
