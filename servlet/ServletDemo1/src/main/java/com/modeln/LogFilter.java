package com.modeln;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/*")
public class LogFilter  implements Filter{
	
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Filter intialize");
		
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws ServletException,IOException {
		System.out.println("Login time:"+new Date().toString());
		chain.doFilter(request, response);
		System.out.println("Logout time:"+new Date().toString());
		
		
	}
	public void destroy() {
		
	}

}
