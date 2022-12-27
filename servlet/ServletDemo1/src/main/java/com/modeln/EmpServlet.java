package com.modeln;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/emp" ,initParams = { @WebInitParam(name="city", value="Hyderabad" ) ,
		@WebInitParam(name="state", value="TElangana" ),
		@WebInitParam(name="country", value="India" )})
public class EmpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.getWriter().append("<br> Served at: ").append(request.getContextPath());
		ServletConfig sc=getServletConfig();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html"); //respons etype in browser
		System.out.println(" Web Servlet using annotations");
		out.println("Config:"+sc.getInitParameter("city"));
			Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements()) {
			String pname=(String)e.nextElement();
			String pvalue=sc.getInitParameter(pname);
			out.println(pname+"  "+pvalue);
		}
  }
}
