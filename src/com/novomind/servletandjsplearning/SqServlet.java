package com.novomind.servletandjsplearning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		// Request Dispatcher example
//		int result;
//		result = (int)request.getAttribute("result");
//		result = result * result;
		
//		PrintWriter out= response.getWriter();
//		out.println(result);
		
		
		// sendRedirect example
		int result;
		result = Integer.parseInt(request.getParameter("result"));
		result = result * result;
		
		PrintWriter out= response.getWriter();
		out.println(result);
		
	}

}
