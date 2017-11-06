package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Course;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class QueryCourseByName extends HttpServlet {
	
	CourseService couServ = new CourseServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String Cname = req.getParameter("couname");
		
		Course course = couServ.queryCourseByname(Cname);
		req.setAttribute("course", course);
		String mainPage = "queryCourseByName.jsp";
		req.setAttribute("mainPage", mainPage);
		req.getRequestDispatcher("admin.jsp").forward(req, resp);
		
		
		
		
		
	}

}
