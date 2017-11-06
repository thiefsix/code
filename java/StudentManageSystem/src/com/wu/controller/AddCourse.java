package com.wu.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.jstl.core.Config;

import com.jspsmart.upload.*;
import com.wu.model.Course;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class AddCourse extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
//		SmartUpload su = new SmartUpload();
//		
//		 JspFactory _jspxFactory = null;
//		 PageContext pageContext = null;
//		 _jspxFactory = JspFactory.getDefaultFactory();
//		 pageContext = _jspxFactory.getPageContext(this,req,resp,"",true,8192,true);
//		 
//		 su.initialize(pageContext);//初始化上传操作
		
		String Cno = req.getParameter("Cno");
		String Cname = req.getParameter("Cname");
		int Ctime = Integer.parseInt(req.getParameter("Ctime"));
		
		
		float Ccredit = Float.parseFloat(req.getParameter("Ccredit"));
		
		Part part = req.getPart("Curl");
		String Curl = saveUpload(part);
		
		String Deptno = req.getParameter("Deptno");
		String Deptname = req.getParameter("Deptname");
		String Cdescription = req.getParameter("Cdescription");
		
		Course cou = new Course(Cno, Cname, Ctime, Ccredit, Curl, Deptno, Deptname, Cdescription);
		CourseService couServ = new CourseServiceImpl();
		boolean flag = couServ.addCourse(cou);
		
		if(flag){
			req.setAttribute("msg", "添加成功");
			String mainPage="showAllCourse.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
		}else{
			String mainPage="showAllCourse.jsp";
			req.setAttribute("mainPage", mainPage);
			req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			System.out.println("添加失败");
		}
		
	}
	
	private String  saveUpload(Part part) {
		String fileName = getFileName(part);
		fileName = System.nanoTime()+"_"+fileName;
		
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("/");
		File file = new File(realPath+"upload");
		if(!file.exists()){
			file.mkdirs();
		}
		File upFile = new File(file,fileName);
		FileOutputStream fileOutputStream = null;
		InputStream inputStream = null;
		byte[] buf = new byte[1024];
		int flag = -1;
		try {
			fileOutputStream = new FileOutputStream(upFile);
			inputStream = part.getInputStream();
			while((flag=inputStream.read(buf,0,1024))!=-1){
				fileOutputStream.write(buf, 0, flag);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fileOutputStream!=null){
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(inputStream!=null){
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return realPath+fileName;
	}

	private String getFileName(Part part) {
		String header = part.getHeader("content-disposition");
		String[] arr = header.split("filename=");
//		System.out.println(arr[arr.length-1].replace("\"", ""));
		return arr[arr.length-1].replace("\"", "");
	}


}
