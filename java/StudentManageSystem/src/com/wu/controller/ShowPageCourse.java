package com.wu.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Course;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class ShowPageCourse extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private CourseService couServ = new CourseServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pageSize = req.getParameter("pageSize");
		int pagesize = 5;   //默认一页显示多少条数据
		if(pageSize != null){
			pagesize = Integer.parseInt(pageSize);
		}
		
		String pageNow = req.getParameter("pageNow");
		int pagenow = 1;    //默认当前页
		if(pageNow != null){
			pagenow = Integer.parseInt(pageNow);
		}
		
		int recordCount = couServ.queryRecordCount();
		int pagecount = recordCount/pagesize+1;
		
		ArrayList<Course> couList = (ArrayList<Course>) couServ.queryPageCourse(pagenow, pagesize);
		req.setAttribute("couList", couList);
		req.setAttribute("pagecount", pagecount);
		req.setAttribute("pagenow", pagenow);
		
		req.getRequestDispatcher("/showPageCourse.jsp").forward(req, resp);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}

}
