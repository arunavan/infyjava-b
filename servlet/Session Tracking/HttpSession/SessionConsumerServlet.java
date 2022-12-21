//Session Consumer 
package com.nexwave.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SessionConsumerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SessionConsumerServlet() {
        super();
        }


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String str1 = (String)session.getAttribute("firstname");
		String str2 = (String)session.getAttribute("lastname");
		out.println("First Name:"+str1);
		out.println("Last Name:"+str2);
		
		out.println("<form action=\"/WebProj1/LogoutServlet\">");
		out.println("<input type=Submit value=Logout>");
		out.println("</form>");
		
		
	}

	

}

