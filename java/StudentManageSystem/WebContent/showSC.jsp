<%@page import="com.wu.service.impl.CourseServiceImpl"%>
<%@page import="com.wu.service.CourseService"%>
<%@ page language="java" import="java.util.*,com.wu.model.Course"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ page import="com.wu.dao.impl.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>选修课程</title>

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
					<strong>课程编号</strong>
				</td>
				<td align="center">
					<strong>课程名称</strong>
				</td>
				<td align="center">
					<strong>课时</strong>
				</td>
				<td align="center">
					<strong>学分</strong>
				</td>

				<td align="center">
					<strong>所属学院编号</strong>
				</td>
				<td align="center">
					<strong>所属学院名称</strong>
				</td>
				<td align="center">
					<strong>描述</strong>
				</td>
				<td align="center" >
					<strong>执行操作</strong>
				</td>
			</tr>
		 
		 	<%
		 		CourseService couServ = new CourseServiceImpl();
		 		List list = couServ.queryAllCourse();
		 		if(list.isEmpty()){
					out.println("没有数据显示");
				}
		 		for(int i=0;i<list.size();i++){
		 			Course cou = (Course) list.get(i);
		 			String[] arr = cou.getCurl().split("System\\\\");
		 			String str = arr[arr.length-1];
		 			str = "upload/"+str;%>
		 			<tr>
		 			<td>
		 			<% out.print(cou.getCno()); %>
		 			</td>
		 			<td>
		 			<% out.print(cou.getCname()); %>
		 			</td>
		 			<td>
		 			<% out.print(cou.getCtime()); %>
		 			</td>
		 			<td>
		 			<% out.print(cou.getCcredit()); %>
		 			</td>
		 		
		 			<td>
		 			<% out.print(cou.getDeptno()); %>
		 			</td>
		 			<td>
		 			<% out.print(cou.getDeptname()); %>
		 			</td>
		 			<td>
		 			<% out.print(cou.getCdescription()); %>
		 			</td>
		 			<td>
		 			<a href="student?type=add&cno=<% out.print(cou.getCno()); %>&cname=<% out.print(cou.getCname()); %>" class="btn btn-danger">选课</a>
		 			<%-- <a href="student?type=delete&cno=<%= cou.getCno() %>" class="btn btn-primary">退课</a> --%>
		 			</td>
		 			</tr>
		 		<%}
		 	%>
				
		</table>

		<hr>
		<a href="admin.jsp" class="btn btn-success">返回主菜单</a>
		<hr>


	</body>
</html>