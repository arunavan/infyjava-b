<%@ page language="java" import="java.sql.* ,com.pms.model.*,com.pms.service.*,com.pms.dao.*"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

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

	
%>