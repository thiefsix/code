package com.wu.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.wu.model.T_C;
import com.wu.model.Teacher;
import com.wu.service.S_CService;
import com.wu.service.T_CService;
import com.wu.service.TeacherService;
import com.wu.service.impl.S_CServiceImpl;
import com.wu.service.impl.T_CServiceImpl;
import com.wu.service.impl.TeacherServiceImpl;
import com.wu.util.Base64;

public class TeacherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private TeacherService teaServ = new TeacherServiceImpl();
	private T_CService tcServ = new T_CServiceImpl();
	private S_CService scServ = new S_CServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		String Tno = req.getParameter("tno");
		String type = req.getParameter("type");
//		String teString=req.getParameter("generalgrade");
//		String test=req.getParameter("test");
//		System.out.println("test="+test);
		//查询教师授课表
		if("queryTC".equals(type)){
			List<T_C> tcList = tcServ.queryTCByTno(Tno);
			req.setAttribute("tcList", tcList);
			req.getRequestDispatcher("/showTC.jsp").forward(req, resp);
			
		}
		
		//修改密码
		if("updatePassword".equals(type)){
			String tno = (String) session.getAttribute("username");
			String nowPassword = req.getParameter("oldPwd");
			String newPassword = req.getParameter("newPwd");
			String againPassword = req.getParameter("againPwd");
//			Teacher teacher = teaServ.queryTeacherById(Tno);
			teaServ.updatePassword(newPassword, tno);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			/*if(teacher.getTpassword()!=Base64.Encode(nowPassword)){
				resp.getWriter().write("旧密码错误");
				resp.sendRedirect("/teacher.jsp");
			}else if(newPassword.equals(againPassword)){
				teaServ.updatePassword(newPassword, Tno);
				resp.getWriter().write("修改成功");
			}else {
				resp.getWriter().write("两次密码不一致");
			}*/
		}
		
		//打分
		if("grade".equals(type)){
			String Sno = req.getParameter("sno");
			String Cno = req.getParameter("cno");
//			System.out.println(teString);
			int generalGrade = Integer.parseInt(req.getParameter("genegrade"));
			int terminalGrade = Integer.parseInt(req.getParameter("termgrade"));
			int grade = Integer.parseInt(req.getParameter("grade"));
			
			if(scServ.updateSC(Sno, Cno, generalGrade, terminalGrade, grade)){
				resp.getWriter().write("评分成功");
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("评分失败");
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			
		}
		
		//更新教师信息
		if("updateTeacher".equals(type)){
//			String Tno = req.getParameter("tno");
			String Tname = req.getParameter("tname");
			String Deptname = req.getParameter("deptname");
			String Sex = req.getParameter("sex");
			String Titleno = req.getParameter("titleno");
			String Titlename = req.getParameter("titlename");
			if(teaServ.updateTeacher(Tname, Deptname, Sex, Titleno, Titlename, Tno)){
				resp.getWriter().write("修改成功");
				req.getRequestDispatcher("teacher.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("修改失败");
				req.getRequestDispatcher("teacher.jsp").forward(req, resp);
			}
			
		}
		//删除教师信息
		if("delete".equals("type")){
			if(teaServ.deleteTeacher(Tno)){
				resp.getWriter().write("删除成功");
				req.getRequestDispatcher("admin.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("删除失败");
				req.getRequestDispatcher("admin.jsp").forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}

}
