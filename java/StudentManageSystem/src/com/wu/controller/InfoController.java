package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Course;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class InfoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cno = req.getParameter("cno");
		if(cno!=null){
			CourseService couServ = new CourseServiceImpl();
			Course cou = couServ.queryCourseById(cno);
			req.setAttribute("cou", cou);
			req.getRequestDispatcher("/Product/product_info.jsp").forward(req, resp);
			
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
