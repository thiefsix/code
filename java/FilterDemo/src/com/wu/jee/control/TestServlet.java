package com.wu.jee.control;

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
		HttpSession httpSession = req.getSession(false);
		String name = (String) httpSession.getAttribute("user_name");
		resp.getWriter().write("��ӭ<strong>"+name+"</strong>����ϵͳ<br /><a href='../index.html'>������ҳ</a>");
	}
}
