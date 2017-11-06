<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.wu.model.Major"%>
<%@page import="com.wu.service.impl.MajorServiceImpl"%>
<%@page import="com.wu.service.MajorService"%>
<%@page import="com.wu.model.Department"%>
<%@page import="com.wu.service.impl.DeptServiceImpl"%>
<%@page import="com.wu.service.DeptService"%>
<%@page import="com.sun.swing.internal.plaf.metal.resources.metal"%>
<%@page import="java.util.List"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
<style>
body{margin:0;padding:0;}
.customers{ 
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
                 width:40%; 
 
                 border-collapse:collapse;   }  

.customers td, .customers th { 
  font-size:1em; 
 
                                    border:1px solid #98bf21; 
                                    padding:3px 7px 2px 7px;   }
  
.customers th { 
  font-size:1.1em; 
                       text-align:left;  
                       padding-top:5px;   
                       padding-bottom:4px; 
 
                       background-color:#A7C942; 
                       color:#ffffff;   } 
 
.customers tr.alt td{ 
  color:#000000; 

                             background-color:#EAF2D3; 



</style>
</head>
<body>

	
	<form action="addstudent" method="post">
		<table class="customers" align="center">
		<tr class="alt">
			<td>
				学号：<input type="text" name="sno">
			</td>
		</tr>
		<tr class="alt">
			<td>
				姓名：<input type="text" name="sname">
			</td>
		</tr>
		<tr class="alt">
			<td>
				性别：<input type="radio" name="ssex" value="男">男
					 <input type="radio" name="ssex" value="女">女
			</td>
		</tr>
		<tr class="alt">
			<td>
				出生日期：<input type="text" name="sbirthday">
			</td>
		</tr>
		<tr class="alt">
			<td>
				入学时间：<input type="text" name="senttime">
			</td>
		</tr>
		<div>
		<tr class="alt">
			<td>
				学院：<select name="deptname" id="deptname" onchange="Change_Select()">
				<option value="0" selected>&gt;&gt;请选择</option> 
				<%  DeptService deptServ = new DeptServiceImpl();
			List deptList = deptServ.queryDept();
			if(deptList.isEmpty()){
				out.println("没有数据显示");
			}
			Department dept = null;
			for(int i=0;i<deptList.size();i++){
				dept = (Department) deptList.get(i);%>
				
			<option value=<%= dept.getDeptname() %>><%= dept.getDeptname() %></option>
			<%}
		
		%>
			  </select>
			</td>
		</tr>
		<tr class="alt">
			<td>
				专业：<select name="major" id="major">
					<option value="0">--请选择--</option>
					<% MajorService majServ = new MajorServiceImpl();
					List majList = majServ.queryMajor();
					if(majList.isEmpty()){
						out.println("没有数据显示");
					}
					Major major = null;
					for(int i = 0;i<majList.size();i++){
						major = (Major) majList.get(i);%>
						<option value=<%= major.getMname() %>><%= major.getMname() %></option>
					<% }
					%>
				
				</select>
			</td>
		</tr>
		</div>
		<tr class="alt">
			<td>
				密码：<input type="password" name="spassword"><br />
			</td>
		</tr>
		<tr class="alt">
			<td>
			<input type="reset" value="取消">
	     	<input type="submit" value="提交">
	     	</td>
		</tr>
	
		</table>
	</form>
	
	<!-- <div id="test">###</div> -->


</body>
</html>