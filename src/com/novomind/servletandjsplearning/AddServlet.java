package com.novomind.servletandjsplearning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		// String result = String.valueOf(firstNum + secondNum);

		//request.setAttribute("result", result);
		//RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		//rd.forward(request, response);
		
		
		int result = firstNum + secondNum;
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("sq");
		rd.forward(request, response);

	}
}
