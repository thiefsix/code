package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Teacher;
import com.wu.service.TeacherService;
import com.wu.service.impl.TeacherServiceImpl;

public class AddTeacher extends HttpServlet {

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
		String Tpassword = req.getParameter("tpassword");
		String Titleno = req.getParameter("titleno");
		String Titlename = req.getParameter("titlename");
		
		Teacher tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
		if(teaServ.addTeacher(tea)){
			resp.getWriter().write("添加成功");
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}else {
			resp.getWriter().write("添加失败");
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
	}

}
