package com.wu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wu.model.Major;
import com.wu.service.MajorService;
import com.wu.service.impl.MajorServiceImpl;

public class Select extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/xml");
		resp.setHeader("Cache-Control","no-Cache" );
		req.setCharacterEncoding("GBK");
		resp.setCharacterEncoding("UTF-8");
		
		String targetId = req.getParameter("id");
		System.out.println("targetId="+targetId);
//		resp.getWriter().write("ok");
		
		MajorService majServ = new MajorServiceImpl();
		List<Major> majList = majServ.queryMajorByDeptname(targetId);
		//获得请求中参数为id的值
		String xml_start = "<selects>";
		String xml_end = "</selects>";
		String xml = "";
		
		 if (targetId.equalsIgnoreCase("0")) 
         {
             xml = "<select><value>0</value><text>&gt;&gt;请选择--</text></select>"; 
         } 
         if (targetId.equalsIgnoreCase(targetId)) 
         {
        	 for (int j = 0; j < majList.size(); j++) { 
        		 Major major =  majList.get(j); 
        		 xml += "<select><value>"+major.getMno()+"</value><text>"+major.getMname()+"</text></select>"; 
        	 }
         }
         String last_xml = xml_start + xml + xml_end;
         resp.getWriter().write(last_xml);

		
//		String aaa=req.getParameter("id");
//		System.out.println("id="+aaa);
         
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
}
