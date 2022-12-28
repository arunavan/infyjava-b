<%@page language="java" import="java.util.*,java.sql.* ,com.pms.model.*,com.pms.service.*,com.pms.dao.*" contentType="text/html"%>



<%
List<Product> plist=new ArrayList<>();

ProductService ps=new ProductServiceImpl();
out.println("<table align='center' border='2'>  ");

	plist=ps.listAllProducts();
	
	//plist.stream().forEach(System.out::println);
	for( Product p: plist) {
	out.println("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td></tr>");
	}


out.println("</table>");




%>