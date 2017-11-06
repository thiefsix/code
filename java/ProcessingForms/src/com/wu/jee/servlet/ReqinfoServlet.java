package com.wu.jee.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqinfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<h3>Request中的信息：</h3><br/>");
		stringBuilder.append("Request URI:").append(req.getRequestURI()).append("<br/>");
		stringBuilder.append("contentlength:").append(req.getContentLength()).append("<br/>");
		stringBuilder.append("method:").append(req.getMethod()).append("<br/>");
		Enumeration<String> enumeration = req.getHeaderNames();
		stringBuilder.append("<hr>-----------------Header------------------<hr>");
		while(enumeration.hasMoreElements()){
			String name = enumeration.nextElement();
			stringBuilder.append(name).append("-->").append(req.getHeader(name)).append("<br/>");
			
		}
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().write(stringBuilder.toString());
	}

}
