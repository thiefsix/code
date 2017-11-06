package com.wu.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
//		name = new String(name.getBytes("ISO-8859"),"UTF-8");  //若服务端出现中文乱码就打开这句代码
		String age =req.getParameter("age");
//		System.out.println("name:"+name);
//		System.out.println("age:"+age);
		resp.setHeader("Content-Type", "text/html;charset=UTF-8"); //浏览器出现中文乱码解决办法
		resp.getWriter().write("name:"+name+"age:"+age);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");   //通过请求对象对字符编码进行设置对dopost是有效的，对doget无效
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		resp.getWriter().write("name:"+name+" age:"+age);
	}

}
