<%@page import="com.wu.model.Student"%>
<%@page import="com.wu.service.impl.StudentServiceImpl"%>
<%@page import="com.wu.service.StudentService"%>
<%@page import="com.wu.model.Teacher"%>
<%@page import="com.wu.service.impl.TeacherServiceImpl"%>
<%@page import="com.wu.service.TeacherService"%>


<%@ page language="java" import="java.util.*,com.wu.model.Teacher"
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
		<title>显示学生信息</title>

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
		
        	<form action="queryCourseByName" method="post" class="navbar-form navbar-left" role="search">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             
                          <div align="center"><a href="manage?mainPage=addStudent">添加学生</a></div>    &nbsp;&nbsp;&nbsp;&nbsp;
                         <!--    课程名称：<input type="text" name="couname" placeholder="课程名称..."> -->
           
         <!-- 	<i class="icon-search"></i>&nbsp;<button type="submit" class="btn btn-inverse"> 查找</button> -->
       		</form>
        
        
       <%--  <%
			List list = (List) request.getAttribute("list");
			out.println(list.size()); 
		%> --%>
		<table  class="customers">
		    <tr>
				<td align="center">
					<strong>学生编号</strong>
				</td>
				<td align="center">
					<strong>学生名称</strong>
				</td>
				<td align="center">
					<strong>性　　别</strong>
				</td>
				
				<td align="center">
					<strong>出生日期</strong>
				</td>
				
				<td align="center">
					<strong>入学时间</strong>
				</td>
				<td align="center">
					<strong>学　　院</strong>
				</td>
				
				<td align="center">
					<strong>专　　业</strong>
				</td>
				
				<td align="center" >
					<strong>执行操作</strong>
				</td>
			</tr>
		 	
		 	<%
		 		StudentService stuServ = new StudentServiceImpl();
		 		List stuList = stuServ.queryStudent();
		 		if(stuList.isEmpty()){
					out.println("没有数据显示");
				}
		 		for(int i=0;i<stuList.size();i++){
		 			Student student = (Student) stuList.get(i);%>
		 			
		 			
		 			<tr>
		 			<td>
		 			<% out.print(student.getSno()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getSname()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getSsex()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getSbirthday()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getSenttime()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getDeptname()); %>
		 			</td>
		 			<td>
		 			<% out.print(student.getMname()); %>
		 			</td>
		 			
		 			<td>
		 			<a href="student?type=deletecourse&sno=<% out.print(student.getSno()); %>" class="btn btn-danger">删除</a>
		 			<a href="updateStudent.jsp?sno=<% out.print(student.getSno()); %>" class="btn btn-primary"  target=_blank>更新</a>
		 			<%-- <a href="student?type=update&sno=<% out.print(student.getSno()); %>" class="btn btn-primary"  target=_blank>更新</a> --%>
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