package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet extends javax.servlet.GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in Generic Servlet...");
		res.setContentType("text/html");
		PrintWriter outPrintWriter = res.getWriter();
		outPrintWriter.println("<h1>Welcome to generic Servlet....</h1>");
		
	}
	

}
