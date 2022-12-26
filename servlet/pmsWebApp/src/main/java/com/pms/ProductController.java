package com.pms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.model.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;

public class ProductController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	Integer id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	Double qty=Double.parseDouble(request.getParameter("qty"));
	Double price=Double.parseDouble(request.getParameter("price"));
	
	
	Product p=new Product();
	p.setId(id);
	p.setName(name);
	p.setPrice(price);
	p.setQty(qty);
	
	try {
		ProductService ps=new ProductServiceImpl();
		String result=ps.addProduct(p);
		if(result.equals("success"))
		out.println("Product added successfully...");
		else
			out.println("Product not added ..");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	
	}

}
