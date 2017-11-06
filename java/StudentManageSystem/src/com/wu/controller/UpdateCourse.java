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

import com.wu.model.Course;
import com.wu.service.CourseService;
import com.wu.service.impl.CourseServiceImpl;

public class UpdateCourse extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String Cno = req.getParameter("Cno");
		String Cname = req.getParameter("Cname");
		int  Ctime = Integer.parseInt(req.getParameter("Ctime"));
		float Ccredit = Float.parseFloat(req.getParameter("Ccredit"));
		
		Part part = req.getPart("Curl");
		String Curl = saveUpload(part);
		
		String Deptno = req.getParameter("Deptno");
		String Deptname = req.getParameter("Deptname");
		String Cdescription = req.getParameter("Cdescription");
		
		Course cou = new Course(Cno, Cname, Ctime, Ccredit, Curl, Deptno, Deptname, Cdescription);
		CourseService couServ = new CourseServiceImpl();
		
		boolean flag = couServ.updateCourse(cou);
		if(flag){
			resp.sendRedirect("showAllCourse.jsp");
		}else{
			resp.sendRedirect("admin.jsp");
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
		return realPath;
	}

	private String getFileName(Part part) {
		String header = part.getHeader("content-disposition");
		String[] arr = header.split("filename=");
//		System.out.println(arr[arr.length-1].replace("\"", ""));
		return arr[arr.length-1].replace("\"", "");
	}

}
