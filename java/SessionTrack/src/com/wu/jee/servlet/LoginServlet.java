package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if("admin".equals(username)&&"123456".equals(password)){
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("user", username);
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().write("<strong>»¶Ó­"+username+"!µÇÂ¼</strong><br/><a href='index.html'>·µ»ØÊ×Ò³</a>");
		}
		else{
			resp.sendRedirect("pages/login.html");
		}
	}

}
