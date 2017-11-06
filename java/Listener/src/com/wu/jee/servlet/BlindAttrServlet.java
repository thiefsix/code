package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BlindAttrServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("------------------------------------------------");
		ServletContext context = getServletContext();
		System.out.println("ServletContext add");
		context.setAttribute("context", "test....");
		System.out.println("ServletContext added ");
		
		System.out.println("ServletContext replace");
		context.setAttribute("context", "test replace");   //这里没有replace方法，setattribute的属性值一样就实现了替换
		System.out.println("ServletContext replaced");
		
		System.out.println("ServletContext remove");
		context.removeAttribute("context");
		System.out.println("ServletContext removed");
		System.out.println("------------------------------------------------");
		HttpSession session = req.getSession();
		System.out.println("HttpSession add");
		session.setAttribute("session", "session......");
		System.out.println("HttpSession added");
		
		System.out.println("HttpSession replace");
		session.setAttribute("session", "session replace");
		System.out.println("HttpSession replaced");
		
		System.out.println("HttpSession remove");
		session.removeAttribute("session");
		System.out.println("HttpSession removed");
		System.out.println("------------------------------------------------");
		System.out.println("Request add");
		req.setAttribute("request", "request......");
		System.out.println("Request added");
		
		System.out.println("Request replace");
		req.setAttribute("request", "request replace");
		System.out.println("Request replaced");
		
		System.out.println("Request remove");
		req.removeAttribute("request");
		System.out.println("Request removed");
	}
}
