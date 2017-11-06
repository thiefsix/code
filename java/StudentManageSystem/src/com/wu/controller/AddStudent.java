package com.wu.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Student;
import com.wu.service.StudentService;
import com.wu.service.impl.StudentServiceImpl;

public class AddStudent extends HttpServlet {

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
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String Sno = req.getParameter("sno");
		String Sname = req.getParameter("sname");
		String Ssex = req.getParameter("ssex");
		Date Sbirthday = null;
		Date Senttime = null;
		try {
			Sbirthday=new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("sbirthday")).getTime());
			Senttime = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("senttime")).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Deptname = req.getParameter("deptname");
		String Mname = req.getParameter("major");
		String Spassword = req.getParameter("spassword");
		String Deptno = req.getParameter("deptno");
		String Mno = req.getParameter("mno");
		
		Student stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
		StudentService stuServ = new StudentServiceImpl();
		boolean flag = stuServ.addStudent(stu);
		if(flag){
			String mainPage = "operateStudent";
			req.setAttribute("mainPage", mainPage);
			req.setAttribute("msg", "添加成功");
			resp.sendRedirect("admin.jsp");
		}else{
			
			System.out.println("添加失败");
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		
	}

}
