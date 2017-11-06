<%@page import="com.wu.model.Teacher"%>
<%@page import="com.wu.service.impl.TeacherServiceImpl"%>
<%@page import="com.wu.service.TeacherService"%>
<%@page import="com.wu.model.Title"%>
<%@page import="com.wu.service.impl.TitleServiceImpl"%>
<%@page import="com.wu.service.TitleService"%>
<%@page import="com.wu.model.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.impl.DeptServiceImpl"%>
<%@page import="com.wu.service.DeptService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新教师信息</title>
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
	
	<% 
	TeacherService teaServ = new TeacherServiceImpl();
	
	String Tno = (String) request.getParameter("tno");
	if(Tno==null){
		Tno = (String) session.getAttribute("username");
	}
	Teacher tea = teaServ.queryTeacherById(Tno);
	%>
	
	<form action="updateteacher" method="post">
	
		<table class="customers" align="center"> 
				<tr class="alt">
					<td><strong>教师编号</strong></td>
					<td>
						<input name="tno" value="<%= tea.getTno() %>" readonly="true">
					</td>
				</tr>
				<tr class="alt">
					<td><strong>教师名字</strong></td>
					<td>
						<input name="tname" placeholder="<%= tea.getTname() %>">
					</td>
				</tr>
				
				
				<tr class="alt">
					<td><strong>所属学院</strong></td>
					<td>
								
					<select name="deptname">
					<%  DeptService deptServ = new DeptServiceImpl();
						List list = deptServ.queryDept();
						if(list.isEmpty()){
							out.println("没有数据显示");
						}
						for(int i=0;i<list.size();i++){
							Department dept = (Department) list.get(i);%>
							
						<option><%= dept.getDeptname() %></option>
						<%}
					%>
			  		</select>
			  	<tr class="alt">
					<td><strong>性别</strong></td>
					<td>
						<input name="tsex" type="radio" value="男">男
						<input name="tsex" type="radio" value="女">女
					</td>
				</tr>
				
			    <tr class="alt">
					<td><strong>职称编号</strong></td>
					<td>
						<select name="titleno">
							<option>--请选择--</option>
							<% TitleService titleServ = new TitleServiceImpl();
							List titleList = titleServ.queryTitle();
							if(titleList.isEmpty()){
								out.println("没有数据显示");
							}
							for(int i = 0; i<titleList.size();i++){
								Title title = (Title) titleList.get(i);%>
								<option><%= title.getTitleno() %></option>
							<%}
							%>
						</select>
					</td>
				</tr>
				<tr class="alt">
					<td><strong>职称名字</strong></td>
					<td>
						<select name="titlename">
							<option>--请选择--</option>
						<% if(titleList.isEmpty()){
							out.println("没有数据显示");
						}
						for(int i = 0;i<titleList.size();i++){
							Title title = (Title) titleList.get(i);%>
							<option><%= title.getTitlename() %></option>
						<%}
						%>
						</select>
					</td>
				</tr>
					</td>
				</tr>
				
				<tr class="alt">
				<td></td><td>
					<input type="reset" value="取消">
	     			<input type="submit" value="提交">
				</tr>
				</table>
		
	</form>

</body>
</html>