package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession(false);
		if(httpSession == null || httpSession.getAttribute("user") == null){
			resp.sendRedirect("../pages/login.html");
		}
		else{
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().write("<strong>»¶Ó­"+httpSession.getAttribute("user")+"!µÇÂ¼</strong><br/><a href='../index.html'>·µ»ØÊ×Ò³</a>");
		}
	}

}
