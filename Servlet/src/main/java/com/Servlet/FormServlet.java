package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
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
		out.println("Register Sucessfully");
		RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
		rd.include(req, resp);
		
		
	}
	

}
