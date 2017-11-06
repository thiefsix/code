package com.wu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.dao.CourseDao;
import com.wu.dao.impl.CourseDaoImpl;
import com.wu.model.Course;

public class QueryAllCourse extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CourseDao couDao = new CourseDaoImpl();
		List list = couDao.queryAllCourse();
		String mainPage = "showAllCourse.jsp";
		req.setAttribute("list", list);
		req.setAttribute("mainPage", mainPage);
//		resp.sendRedirect("admin.jsp");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("admin.jsp");
//		dispatcher.forward(req, resp);
		req.getRequestDispatcher("showAllCourse.jsp").forward(req, resp);
		
	}
}
