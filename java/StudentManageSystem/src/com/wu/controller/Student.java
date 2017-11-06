package com.wu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.wu.model.S_C;
import com.wu.service.S_CService;
import com.wu.service.StudentService;
import com.wu.service.impl.S_CServiceImpl;
import com.wu.service.impl.StudentServiceImpl;
import com.wu.util.Base64;

public class Student extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private S_CService scServ = new S_CServiceImpl();
	private StudentService stuServ = new StudentServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		String type = req.getParameter("type");
		String sno = (String) session.getAttribute("username");
		String cno = req.getParameter("cno");
		String cname = req.getParameter("cname");
		
		//选课
		if("add".equals(type)){
			
			int grade = 0;
			int generalGrade = 0;
			int terminalGrade = 0;
			
			S_C sc = new S_C(sno, cno, cname, grade, generalGrade, terminalGrade);
			
			if(scServ.addSC(sc)){
				resp.getWriter().write("选课成功");
				
			}else{
				resp.getWriter().write("选课失败");
				
			}
			req.getRequestDispatcher("/manage?mainPage=showSC").forward(req, resp);
		}
		
		//退课
		if("delete".equals(type)){
			if(scServ.deleteSC(sno, cno)){
				resp.getWriter().write("<script language=\'JavaScript\'type=\"text/JavaScript\'> 'alert(\"提示信息\");return true;}</script>");  
				//resp.getWriter().write("退课成功");
			}else {
				resp.getWriter().write("退课失败");
			}
			req.getRequestDispatcher("/manage?mainPage=showSCStu").forward(req, resp);
		}
		
		//更新学生信息
		if("update".equals(type)){
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
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}else{
				resp.getWriter().write("修改失败");
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}
		}
		
		//修改密码
		if("updatePassword".equals(type)){
			String nowPassword = req.getParameter("oldPwd");
			String newPassword = req.getParameter("newPwd");
			String againPassword = req.getParameter("againPwd");
			stuServ.updatePassword(newPassword, sno);
			req.getRequestDispatcher("/student.jsp").forward(req, resp);
			/*com.wu.model.Student student = stuServ.queryStudentById(sno);
			if(student.getSpassword()!=Base64.Encode(nowPassword)){
				resp.getWriter().write("旧密码错误");
				resp.sendRedirect("/student.jsp");
			}else if(newPassword.equals(againPassword)){
				stuServ.updatePassword(newPassword);
				resp.getWriter().write("修改成功");
			}else {
				resp.getWriter().write("两次密码不一致");
			}*/
		}
		
		//查询选课信息
		if("querySC".equals(type)){
			List<S_C> scList = scServ.querySC(sno);
			req.setAttribute("scList", scList);
			req.getRequestDispatcher("/showSC.jsp").forward(req, resp);
			
		}
		
		//删除学生（管理员操作）
		if ("deletecourse".equals(type)) {
			String Sno = req.getParameter("sno");
			if (stuServ.deleteStudent(Sno)) {
				resp.getWriter().write("删除成功");
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("删除失败");
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}

}
