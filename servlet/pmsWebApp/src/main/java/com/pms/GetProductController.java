package com.pms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.model.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;


public class GetProductController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
		List<Product> plist=new ArrayList<>();
		
		ProductService ps=new ProductServiceImpl();
		out.println("<table align='center' border='2'>  ");
		try {
			plist=ps.listAllProducts();
			
			//plist.stream().forEach(System.out::println);
			for( Product p: plist) {
			out.println("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td></tr>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println("</table>");
	}

}
