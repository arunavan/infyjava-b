package com.modeln.servlets;
import java.io.IOException; 
import javax.servlet.annotation.WebFilter; 
import javax.servlet.*; 
import java.util.*;  


@WebFilter(urlPatterns = {"/*"}) 
//@WebFilter(servletNames="Login")
//@WebFilter(servletNames = {"LoanServlet", "BankServlet"})
public class DemoFilter implements Filter {
   
   public void init(FilterConfig config) throws ServletException { 
      
      System.out.println("Filter initialize " );  
   } 

   public void doFilter(ServletRequest request, ServletResponse response,
      FilterChain chain) throws IOException, ServletException { 
	    System.out.println("before Time " + new Date().toString());  
       chain.doFilter(request,response); 
      System.out.println("after  Time " + new Date().toString());  
      
      
   }

   public void destroy( ) {
     
   } 
}

/*
 * 
 <filter>
  	<filter-name>LoggingFilter</filter-name> <!-- mandatory -->
  		<filter-class>com.modelN.servlet.LogFilter
  		</filter-class> <!-- mandatory -->
 </filter>


<filter-mapping>
  <filter-name>LoggingFilter</filter-name> <!-- mandatory -->
  <url-pattern>/*</url-pattern> <!-- either url-pattern or servlet-name is mandatory -->
  <servlet-name>LoginServlet</servlet-name>
</filter-mapping>


filterorder
 * 
 * <filter-mapping>
    <filter-name>F1</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
<filter-mapping>
    <filter-name>F2</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
<filter-mapping>
    <filter-name>F3</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
 */



