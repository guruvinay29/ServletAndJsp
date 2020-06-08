package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet

{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		res.sendRedirect("sq?k="+k);
		
		//PrintWriter out = res.getWriter();
		//out.println("Result is " +k);
		//System.out.println("Result is " +k);
		
		//RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
		//dispatcher.forward(req, res);
		
	}
}
