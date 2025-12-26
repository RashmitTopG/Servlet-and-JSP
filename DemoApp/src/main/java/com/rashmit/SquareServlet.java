package com.rashmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;


@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
//		PrintWriter out = res.getWriter();
////		out.println("The Square is " + req.getAttribute("square"));
		
		
//		This will be null because Attribute not parameter
//		int result1 = (int)req.getAttribute("square");
		
//		int result2 = Integer.parseInt(req.getParameter("square"));
		
//		HttpSession session = req.getSession();
//		int result3 = (int)(session.getAttribute("square"));
		
		int result3 = 0;
		javax.servlet.http.Cookie[] cookies = req.getCookies();
		for(javax.servlet.http.Cookie x : cookies) {
			if(x.getName().equals("square")) {
				result3 = Integer.parseInt(x.getValue());
			}
		}

		PrintWriter out = res.getWriter();
		out.println("Redirected to sq");
		out.println("The Square is " + result3);
		
//		You can also remove the value
//		session.removeAttribute(square);
		
	
	}
}
