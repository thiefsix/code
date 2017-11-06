package com.wu.jee;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		print("init");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		print("service");
	}
	
	@Override
	public void destroy() {
		print("destroy");
	}
	
	void print(String content){
		System.out.println(getClass().getSimpleName()+"method name:"+content+"Thread name:"+Thread.currentThread().getName());
	}
}
