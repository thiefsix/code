<%@page import="com.wu.model.Course"%>
<%@page import="com.wu.service.impl.CourseServiceImpl"%>
<%@page import="com.wu.service.CourseService"%>
<%@page import="com.wu.model.Department"%>
<%@page import="com.wu.service.impl.DeptServiceImpl"%>
<%@page import="com.wu.service.DeptService"%>
<%@page import="com.sun.swing.internal.plaf.metal.resources.metal"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

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

	<% String cno = request.getParameter("cno");
	CourseService couServ = new CourseServiceImpl();
	Course cou = new Course();
	cou = couServ.queryCourseById(cno);
	%>
	<form action="updatecourse" enctype="multipart/form-data">
	     <table class="customers"> 
				<tr class="alt">
					<td><strong>课程号</strong></td>
					<td>
						<input name="Cno" value="<%= cou.getCno() %>" readonly="true">
					</td>
				</tr>
				<tr class="alt">
					<td><strong>课程名</strong></td>
					<td>
						<input name="Cname" placeholder="<%= cou.getCname() %>">
					</td>
				</tr>
				<tr class="alt">
					<td><strong>课　时</strong></td>
					<td>
						<input name="Ctime" placeholder="<%= cou.getCtime() %>">
					</td>
				</tr>
				<tr class="alt">
					<td><strong>学分</strong></td>
					<td>
						<input name="Ccredit" placeholder="<%= cou.getCcredit() %>">
					</td>	
				</tr>
				<tr class="alt">
					<td><strong>图　片</strong></td>
					<td>
						<input type="file" name="Curl">
					</td>
				</tr>
				<tr class="alt">
					<td><strong>院系名称</strong></td>
					<td>
								
								<select name="Deptname">
					<%  DeptService deptServ = new DeptServiceImpl();
						List deptList = deptServ.queryDept();
						if(deptList.isEmpty()){
							out.println("没有数据显示");
						}
						for(int i=0;i<deptList.size();i++){
							Department dept = (Department) deptList.get(i);%>
							
						<option><%= dept.getDeptname() %></option>
						<%}
					%>
			  </select>
			  
					</td>
				</tr>
				<tr class="alt">
					<td><strong>院系编号</strong></td>
					<td>
										<select name="Deptno">
						<%  DeptService deptServNo = new DeptServiceImpl();
							List list2 = deptServNo.queryDept();
							if(list2.isEmpty()){
								out.println("没有数据显示");
							}
							for(int i=0;i<list2.size();i++){
								Department dept = (Department) list2.get(i);%>
								
							<option><%= dept.getDeptno() %></option>
							<%}
						
						%>
							  </select>
					</td>
				</tr>
				<tr class="alt">
				<td>	<strong>描述</strong></td>
					<td>
						<input name="Cdescription"  placeholder="<%= cou.getCdescription() %>">
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