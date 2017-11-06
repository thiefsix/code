package com.wu.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.service.StudentService;
import com.wu.service.impl.StudentServiceImpl;

public class UpdateStudent extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StudentService stuServ = new StudentServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sno = req.getParameter("sno");
		String sname = req.getParameter("sname");
		String ssex = req.getParameter("ssex");
		Date sbirthday = null;
		Date senttime = null;
		try {
			sbirthday=new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("sbirthday")).getTime());
			senttime = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("senttime")).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String deptname = req.getParameter("deptname");
		String mname = req.getParameter("major");
		String spassword = "";
		String deptno = req.getParameter("deptno");
		String mno = req.getParameter("mno");
		com.wu.model.Student student = new com.wu.model.Student(sno, sname, ssex, sbirthday, senttime, mno, deptno, spassword, deptname, mname);
		if(stuServ.updateStudent(student)){
			resp.getWriter().write("修改成功");
			resp.sendRedirect("admin.jsp");
		}else{
			resp.getWriter().write("修改失败");
			resp.sendRedirect("admin.jsp");
		}
	}

}
