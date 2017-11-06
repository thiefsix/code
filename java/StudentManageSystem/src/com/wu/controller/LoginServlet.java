package com.wu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wu.model.Admin;
import com.wu.model.Student;
import com.wu.model.Teacher;
import com.wu.service.AdminService;
import com.wu.service.StudentService;
import com.wu.service.TeacherService;
import com.wu.service.impl.AdminServiceImpl;
import com.wu.service.impl.StudentServiceImpl;
import com.wu.service.impl.TeacherServiceImpl;

public class LoginServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	AdminService adminService = new AdminServiceImpl();
	TeacherService teaServ = new TeacherServiceImpl();
	StudentService stuServ = new StudentServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
		
		if("管理员登录".equals(role)){
			Admin admin = adminService.queryAdmin(username);
			if(admin != null&&admin.getApassword().equals(password)){
				//登录成功
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				session.setAttribute("admin",admin);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}else{
				//登录失败
				String info = "用户名或密码错误";
				req.setAttribute("error", info);
				resp.sendRedirect("login.jsp");
				
			}
		}else if("教师登录".equals(role)){
			Teacher tea = teaServ.queryTeacherById(username);
			if(tea !=null&&tea.getTpassword().equals(password)){
				//登录成功
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				session.setAttribute("teacher",tea);
				req.getRequestDispatcher("teacher.jsp").forward(req, resp);
			}else{
				//登录失败
				String info = "用户名或密码错误";
				req.setAttribute("error", info);
				resp.sendRedirect("login.jsp");
			}
		}else{//学生登录
			Student stu = stuServ.queryStudentById(username);
			if(stu !=null&&stu.getSpassword().equals(password)){
				//登录成功
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				session.setAttribute("student",stu);
				req.getRequestDispatcher("student.jsp").forward(req, resp);
			}else{
				//登录失败
				String info = "用户名或密码错误";
				req.setAttribute("error", info);
				resp.sendRedirect("login.jsp");
				}
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doGet(req, resp);
	}

}
