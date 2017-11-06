package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.dao.CourseDao;
import com.wu.dao.impl.CourseDaoImpl;

public class DeleteCourse extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CourseDao couDao = new CourseDaoImpl();
		
		String Cno = req.getParameter("cno");
//		int no = Integer.parseInt(Cno);
		
		boolean flag = couDao.deleteCourse(Cno);
		if(flag){
			resp.sendRedirect("showAllCourse.jsp");
		}else{
			System.out.println("É¾³ýÊ§°Ü");
		}
	}
	
}
