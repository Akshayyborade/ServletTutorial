package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.swing.text.html.HTML;

public class FirstServlet implements Servlet {
	ServletConfig config;
//	overriding lifecycle and non lifecycle  method
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("intializing servlet....");
		
	}

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("resposing to request...");
		//setting content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>hii welcome to servlet</h1>"+"<h2> Current time and date:"+new Date().toString()+"</h2>");
		
		
		
	}

	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroying ....");
		
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
