package com.novomind.servletandjsplearning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException {
	 * 
	 * int firstNum = Integer.parseInt(req.getParameter("num1")); int secondNum =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int result = firstNum + secondNum;
	 * 
	 * req.setAttribute("result", result);
	 * 
	 * 
	 * PrintWriter out=res.getWriter(); out.println("result is: "+ result); }
	 */

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int firstNum = Integer.parseInt(request.getParameter("num1"));
		int secondNum = Integer.parseInt(request.getParameter("num2"));

		int result = firstNum + secondNum;
		
		// *** send the info using Cookies and sendRedirect ***
		
		Cookie cookie =new Cookie("result",result +"");
		response.addCookie(cookie);
				
		response.sendRedirect("sq");
		
		
		// *** send the info using Sessions and sendRedirect (got Null Pointer Exception) ***
		
		//HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(10*60);
		//request.getSession(true).setAttribute("result", result);
		//response.sendRedirect("sq");

		// *** send the info using RequestDispatcher to a Jsp file ***
		//request.setAttribute("result", result);
		//RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		
		// *** send the info using RequestDispatcher to another Servlet ***
		//RequestDispatcher rd = request.getRequestDispatcher("sq");
		//rd.forward(request, response);
		
		
		// send the info using sendRedirect and getParameter
		//response.sendRedirect("sq?result=" + result);
		
		
		
		

	}
}
