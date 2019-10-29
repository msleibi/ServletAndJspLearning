package com.novomind.servletandjsplearning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// *** send the info using Cookies and sendRedirect ***
		
		int res = 0;
		Cookie cookie[] = request.getCookies();
		
		for(Cookie c:cookie) {
			
			if(c.getName().equals("result")) {
				res = Integer.parseInt(c.getValue());
			}
		}
		res = res * res;
		
    	PrintWriter out= response.getWriter();
		out.println("The result is: " + res);
		
		
		// *** receive the info using Request Dispatcher example ***

//		int res = (int)request.getAttribute("result");
//		res = res * res;

//		PrintWriter out= response.getWriter();
//		out.println("The result is: " + res)
		

		// *** receive the info using sendRedirect example ***

//		int res = Integer.parseInt(request.getParameter("result"));
//		res = res * res;
//		
//    	PrintWriter out= response.getWriter();
//		out.println("The result is: " + res);
		

		// *** receive the info using Sessions (got Null Pointer Exception) ***

		//HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(10*60);
		
//		int res = (int) session.getAttribute("result");
//		res = res * res;
//
//		PrintWriter out = response.getWriter();
//		out.println("The result is: " + res);
		

	}
}
