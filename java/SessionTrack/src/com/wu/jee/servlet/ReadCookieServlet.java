package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		Cookie[] cookies = req.getCookies();
		StringBuilder stringBuilder = new StringBuilder("<h3>cookie–≈œ¢:</h3>");
		for(Cookie c : cookies){
			stringBuilder.append("<li>").append(c.getName()).append("-->").append(c.getValue()).append("</li>");
		}
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().write(stringBuilder.toString());
	}
}
