package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Course;
import com.wu.model.PageBean;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class pageController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String type = null;
		type=req.getParameter("type");
//		String cno = null;
//		cno=req.getParameter("cno");
		int pageNum = 1;
		
		String _pageNum = req.getParameter("pageNum");
		if(_pageNum!=null){
			pageNum=Integer.parseInt(_pageNum);
		}
		
		int currentPage=3;
		String _currentPage =req.getParameter("currentPage");
		if(_currentPage!=null){
			currentPage=Integer.parseInt(_currentPage);
		}
		CourseService service = new CourseServiceImpl();
		
		if(type.equals("all")){
			
			PageBean pb = service.findByPage(pageNum,currentPage);
			
			req.setAttribute("pb", pb);
			req.setAttribute("type", type);
			req.getRequestDispatcher("/Product/product.jsp").forward(req, resp);
//			resp.sendRedirect("Product/product.jsp");
			
		}
		if(!type.equals("all")&!"".equals(type)){
			PageBean pb = service.findByTypePage(pageNum,currentPage,type);
			req.setAttribute("pb", pb);
			req.setAttribute("type", type);
			req.getRequestDispatcher("/Product/product.jsp").forward(req, resp);
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
