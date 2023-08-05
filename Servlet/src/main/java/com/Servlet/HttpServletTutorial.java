package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.*;
public class HttpServletTutorial extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Http Servlet ...");
		resp.setContentType("text/html");
		PrintWriter outPrintWriter = resp.getWriter();
		outPrintWriter.println("<h1> welcome to http Servlet tutorial</h1>");
		outPrintWriter.println("<h2>"+ new Date().toLocaleString()+"</h2>");
	}
	

}
