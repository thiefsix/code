<%@page import="com.wu.model.S_C"%>
<%@page import="com.wu.service.impl.S_CServiceImpl"%>
<%@page import="com.wu.service.S_CService"%>
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
<title>查询课表</title>

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
					<strong>学生编号</strong>
				</td>
				<!-- <td align="center">
					<strong>学生名称</strong>
				</td> -->
				<td align="center">
					<strong>课程编号</strong>
				</td>
				<td align="center">
					<strong>课程名称</strong>
				</td>
				<td align="center">
					<strong>退选课程</strong>
				</td>
				
				<!-- <td align="center">
					<strong>上课地点</strong>
				</td>
				<td align="center">
					<strong>上课时间</strong>
				</td> -->
			
			</tr>
		 
		 	<%
		 		String sno = (String) session.getAttribute("username");
		 	
		 		S_CService scServ = new S_CServiceImpl();
		 		
		 		List scList = scServ.querySC(sno);
		 		
		 		if(scList.isEmpty()){
					out.println("没有数据显示");
				}
		 		for(int i=0;i<scList.size();i++){
		 			S_C sc = (S_C) scList.get(i);%>
		 			<tr>
		 			<td align="center">
		 			<% out.print(sc.getSno()); %>
		 			</td>
		 			<%-- <td>
		 			<% out.print(sc.); %>
		 			</td> --%>
		 			<td align="center">
		 			<% out.print(sc.getCno()); %>
		 			</td>
		 			<td align="center">
		 			<% out.print(sc.getCname()); %>
		 			</td>
		 			<td>
		 			<a href="student?type=delete&cno=<%= sc.getCno() %>" class="btn btn-primary">退课</a>
		 			</td>
		 			<%-- <td>
		 			<% out.print(tc.getTCtime()); %>
		 			</td> --%>
		 		
		 			</tr>
		 		<%}
		 	%>
				
		</table>
</body>
</html>