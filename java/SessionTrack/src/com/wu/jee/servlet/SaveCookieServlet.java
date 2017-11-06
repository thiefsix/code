package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("test1", "test1 cookie");
		resp.addCookie(cookie1);
		
		Cookie cookie2 = new Cookie("test2", "test2 cookie");
		cookie2.setPath("/");
		resp.addCookie(cookie2);
		
		Cookie cookie3 = new Cookie("test3","test3 cookie");
		cookie3.setPath("/SessionTrack/temp/");
		resp.addCookie(cookie3);
		
		resp.sendRedirect("index.html");
	}
}
