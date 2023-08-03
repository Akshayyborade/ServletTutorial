package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>in http servlet Form tutorial</h1>");
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_eamil");
		String pass = req.getParameter("user_pass");
		String gender = req.getParameter("user_gender");
		out.println("<ul>\r\n"
				+ "	<li>Name: "+name+"</li>\r\n"
				+ "	<li>Email: "+email+"</li>\r\n"
				+ "	<li>Password: "+pass+"</li>\r\n"
				+ "	<li>Gender: "+gender+"</li>\r\n"
				+ "	\r\n"
				+ "	</ul>");
		
		
	}
	

}
