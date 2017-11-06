package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Teacher;
import com.wu.service.TeacherService;
import com.wu.service.impl.TeacherServiceImpl;

public class UpdateTeacher extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private TeacherService teaServ = new TeacherServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Tno = req.getParameter("tno");
		String Tname = req.getParameter("tname");
		String Deptname = req.getParameter("deptname");
		String Tsex = req.getParameter("tsex");

		String Titleno = req.getParameter("titleno");
		String Titlename = req.getParameter("titlename");
		
		if(teaServ.updateTeacher(Tname, Deptname, Tsex, Titleno, Titlename, Tno)){
			resp.getWriter().write("更新成功");
			resp.sendRedirect("admin.jsp");
		}else {
			resp.getWriter().write("更新失败");
			resp.sendRedirect("admin.jsp");
		}
	}


}
