package com.wjl.wu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
		res.getWriter().write("hello Servlet by IDE");
		
	}

}
