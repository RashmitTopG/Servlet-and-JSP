package com.rashmitTopG;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/add")
public class IdFilter extends HttpFilter implements Filter {
       
    
   
	public void destroy() {
		 
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		if(id > 1) {
			chain.doFilter(request, response);
		}else {
			out.println("Invalid Id");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
