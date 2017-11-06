package com.wu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class manage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		String username = (String) session.getAttribute("username");
		if(session!=null&username!=null){
			String manage = req.getParameter("mainPage");
			String cno = req.getParameter("cno");
			
			if (manage.equals("showAllCourse")) {
				String mainPage="showAllCourse.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("updatecourse")) {
				String mainPage="updatecourse.jsp";
				req.setAttribute("mainPage", mainPage);
				req.setAttribute("cno", cno);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("addcourse")) {
				String mainPage="addcourse.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("showTC")) {
				String mainPage="showTC.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			if (manage.equals("showSC")) {
				String mainPage="showSC.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}
			if (manage.equals("updateTeacher")) {
				String tno = req.getParameter("tno");
				req.setAttribute("tno",tno);
				String mainPage="updateTeacher.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			if (manage.equals("updateTeacherAdmin")) {
				String tno = req.getParameter("tno");
				req.setAttribute("tno",tno);
				String mainPage="updateTeacher.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("updateTeacherTea")) {
				String mainPage="updateTeacherTea.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			if (manage.equals("grade")) {
				String mainPage="grade.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			if (manage.equals("operateTeacher")) {
				String mainPage="operateTeacher.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("addteacher")) {
				String mainPage="addTeacher.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("operateStudent")) {
				String mainPage="operateStudent.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("addStudent")) {
				String mainPage="addStudent.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}
			if (manage.equals("updateStudentStu")) {
				String mainPage="updateStudentStu.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}
			if (manage.equals("updatePwdTea")) {
				String mainPage="updatePwdTea.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
			}
			if (manage.equals("updatePwdStu")) {
				String mainPage="updatePwdStu.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}
			if (manage.equals("showSCStu")) {
				String mainPage="showSCStu.jsp";
				req.setAttribute("mainPage", mainPage);
				req.getRequestDispatcher("/student.jsp").forward(req, resp);
			}
		}else {
			resp.sendRedirect("login.jsp");
		}
		/*String manage = req.getParameter("mainPage");
		String cno = req.getParameter("cno");
		
		if (manage.equals("showAllCourse")) {
			String mainPage="showAllCourse.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("updatecourse")) {
			String mainPage="updatecourse.jsp";
			req.setAttribute("mainPage", mainPage);
			req.setAttribute("cno", cno);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("addcourse")) {
			String mainPage="addcourse.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("showTC")) {
			String mainPage="showTC.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
		}
		if (manage.equals("showSC")) {
			String mainPage="showSC.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/student.jsp").forward(req, resp);
		}
		if (manage.equals("updateTeacher")) {
			String tno = req.getParameter("tno");
			req.setAttribute("tno",tno);
			String mainPage="updateTeacher.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
		}
		if (manage.equals("updateTeacherAdmin")) {
			String tno = req.getParameter("tno");
			req.setAttribute("tno",tno);
			String mainPage="updateTeacher.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("updateTeacherTea")) {
			String mainPage="updateTeacherTea.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
		}
		if (manage.equals("grade")) {
			String mainPage="grade.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
		}
		if (manage.equals("operateTeacher")) {
			String mainPage="operateTeacher.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("addteacher")) {
			String mainPage="addTeacher.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("operateStudent")) {
			String mainPage="operateStudent.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("addStudent")) {
			String mainPage="addStudent.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}
		if (manage.equals("updateStudentStu")) {
			String mainPage="updateStudentStu.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/student.jsp").forward(req, resp);
		}
		if (manage.equals("updatePwdTea")) {
			String mainPage="updatePwdTea.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/teacher.jsp").forward(req, resp);
		}
		if (manage.equals("updatePwdStu")) {
			String mainPage="updatePwdStu.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/student.jsp").forward(req, resp);
		}
		if (manage.equals("showSCStu")) {
			String mainPage="showSCStu.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/student.jsp").forward(req, resp);
		}*/
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
}
