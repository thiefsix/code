package com.wu.jee.servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String name = req.getParameter("name");
//		String age = req.getParameter("age");
//		String file = req.getParameter("file");
//		
//		resp.setContentType("text/html;charset=UTF-8");
//		resp.getWriter().write("name:"+name+"<br/>age:"+age+"<br/>file:"+file);
		process(req,resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html;charset=UTF-8");
//		ServletInputStream sis = req.getInputStream();
//		byte[] buf = new byte[1024];
//		int flag = 0;
//		while((flag=sis.readLine(buf, 0, 1024))!=-1){
//			String line = new String(buf,0,flag);
//			resp.getWriter().write(line+"<br/>");
//		}
//		
//		sis.close();	
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		resp.getWriter().write("<strong>name:"+name+"<br/>age:"+age+"<br/></strong>");
		
		Part part = req.getPart("file");
//		String FileName = getFileName(part);
//		resp.getWriter().write("filename:"+FileName+"<br/>");  //打印上传文件名
//		//打印上传文件内容：
//		InputStream is = part.getInputStream();
//		byte[] buf = new byte[1024];
//		int flag = 0;
//		while((flag=is.read(buf, 0, 1024))!=-1){
//			String line = new String(buf,0,flag);
//			resp.getWriter().write(line+"<br/>");
//		}
//		
//		is.close();
		saveUpload(part);
		resp.getWriter().write("<h3>文件上传成功</h3>");
	}

	private void saveUpload(Part part) {
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
	}

	private String getFileName(Part part) {
		String header = part.getHeader("content-disposition");
		String[] arr = header.split("filename=");
//		System.out.println(arr[arr.length-1].replace("\"", ""));
		return arr[arr.length-1].replace("\"", "");
	}

}
