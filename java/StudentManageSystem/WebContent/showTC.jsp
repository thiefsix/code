<%@page import="com.wu.model.T_C"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.impl.T_CServiceImpl"%>
<%@page import="com.wu.service.T_CService"%>
<%@page import="com.wu.service.impl.TeacherServiceImpl"%>
<%@page import="com.wu.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师授课</title>

	 <style type="text/css">

.customers   { 
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
                 width:80%; 
 
                 border-collapse:collapse;   }  

.customers td,.customers th    { 
  font-size:1em; 
 
                                    border:1px solid #98bf21; 
                                    padding:3px 7px 2px 7px;   }
  
.customers th    { 
  font-size:1.1em; 
                       text-align:left;  
                       padding-top:5px;   
                       padding-bottom:4px; 
 
                       background-color:#A7C942; 
                       color:#ffffff;   } 
 
.customers tr.alt td    { 
  color:#000000; 

                             background-color:#EAF2D3; 


</style>
</head>
<body>

	<table  class="customers">
		    <tr>
		    <td align="center">
					<strong>教师编号</strong>
				</td>
				<td align="center">
					<strong>教师名称</strong>
				</td>
				<td align="center">
					<strong>课程编号</strong>
				</td>
				<td align="center">
					<strong>课程名称</strong>
				</td>
				
				<td align="center">
					<strong>上课地点</strong>
				</td>
				<td align="center">
					<strong>上课时间</strong>
				</td>
			
			</tr>
		 
		 	<%
		 		String tno = (String) session.getAttribute("username");
		 	
		 		T_CService tcServ = new T_CServiceImpl();
		 		
		 		List tcList = tcServ.queryTCByTno(tno);
		 		
		 		if(tcList.isEmpty()){
					out.println("没有数据显示");
				}
		 		for(int i=0;i<tcList.size();i++){
		 			T_C tc = (T_C) tcList.get(i);%>
		 			<tr>
		 			<td>
		 			<% out.print(tc.getTno()); %>
		 			</td>
		 			<td>
		 			<% out.print(tc.getTname()); %>
		 			</td>
		 			<td>
		 			<% out.print(tc.getCno()); %>
		 			</td>
		 			<td>
		 			<% out.print(tc.getCname()); %>
		 			</td>
		 			<td>
		 			<% out.print(tc.getTCplace()); %>
		 			</td>
		 			<td>
		 			<% out.print(tc.getTCtime()); %>
		 			</td>
		 		
		 			</tr>
		 		<%}
		 	%>
				
		</table>
</body>
</html>