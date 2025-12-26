package com.rashmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class MyServlet extends HttpServlet{

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hello");
		
		
//		This is SERVLET CONTEXT
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Name");
		
		
//		THIS is SERVLET CONFIG
//		ServletConfig cfg = getServletConfig();
//		String x = cfg.getInitParameter("Name");
		
		out.println("My Name is " + str);
		
		
		
	}
}
