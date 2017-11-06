package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.service.TeacherService;
import com.wu.service.impl.TeacherServiceImpl;

public class DeleteTeacher extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TeacherService teaServ = new TeacherServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Tno = req.getParameter("tno");
		if(teaServ.deleteTeacher(Tno)){
			resp.getWriter().write("É¾³ý³É¹¦");
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}else {
			resp.getWriter().write("É¾³ýÊ§°Ü");
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
	}

}
