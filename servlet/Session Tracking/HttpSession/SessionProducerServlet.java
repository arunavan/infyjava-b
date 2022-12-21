//To Produce a Session
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SessionProducerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SessionProducerServlet() {
        super();
        }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("firstname","Raj");
		session.setAttribute("lastname","Aseel");
		out.println("session values are ready to use");
		
	}

	

}
