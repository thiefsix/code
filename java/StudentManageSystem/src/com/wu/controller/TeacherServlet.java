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
		//��ѯ��ʦ�ڿα�
		if("queryTC".equals(type)){
			List<T_C> tcList = tcServ.queryTCByTno(Tno);
			req.setAttribute("tcList", tcList);
			req.getRequestDispatcher("/showTC.jsp").forward(req, resp);
			
		}
		
		//�޸�����
		if("updatePassword".equals(type)){
			String tno = (String) session.getAttribute("username");
			String nowPassword = req.getParameter("oldPwd");
			String newPassword = req.getParameter("newPwd");
			String againPassword = req.getParameter("againPwd");
//			Teacher teacher = teaServ.queryTeacherById(Tno);
			teaServ.updatePassword(newPassword, tno);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			/*if(teacher.getTpassword()!=Base64.Encode(nowPassword)){
				resp.getWriter().write("���������");
				resp.sendRedirect("/teacher.jsp");
			}else if(newPassword.equals(againPassword)){
				teaServ.updatePassword(newPassword, Tno);
				resp.getWriter().write("�޸ĳɹ�");
			}else {
				resp.getWriter().write("�������벻һ��");
			}*/
		}
		
		//���
		if("grade".equals(type)){
			String Sno = req.getParameter("sno");
			String Cno = req.getParameter("cno");
//			System.out.println(teString);
			int generalGrade = Integer.parseInt(req.getParameter("genegrade"));
			int terminalGrade = Integer.parseInt(req.getParameter("termgrade"));
			int grade = Integer.parseInt(req.getParameter("grade"));
			
			if(scServ.updateSC(Sno, Cno, generalGrade, terminalGrade, grade)){
				resp.getWriter().write("���ֳɹ�");
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("����ʧ��");
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			
		}
		
		//���½�ʦ��Ϣ
		if("updateTeacher".equals(type)){
//			String Tno = req.getParameter("tno");
			String Tname = req.getParameter("tname");
			String Deptname = req.getParameter("deptname");
			String Sex = req.getParameter("sex");
			String Titleno = req.getParameter("titleno");
			String Titlename = req.getParameter("titlename");
			if(teaServ.updateTeacher(Tname, Deptname, Sex, Titleno, Titlename, Tno)){
				resp.getWriter().write("�޸ĳɹ�");
				req.getRequestDispatcher("teacher.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("�޸�ʧ��");
				req.getRequestDispatcher("teacher.jsp").forward(req, resp);
			}
			
		}
		//ɾ����ʦ��Ϣ
		if("delete".equals("type")){
			if(teaServ.deleteTeacher(Tno)){
				resp.getWriter().write("ɾ���ɹ�");
				req.getRequestDispatcher("admin.jsp").forward(req, resp);
			}else {
				resp.getWriter().write("ɾ��ʧ��");
				req.getRequestDispatcher("admin.jsp").forward(req, resp);
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}

}
