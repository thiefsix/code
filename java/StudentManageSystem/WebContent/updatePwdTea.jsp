<%@page import="com.wu.model.Teacher"%>
<%@page import="com.wu.service.impl.TeacherServiceImpl"%>
<%@page import="com.wu.service.TeacherService"%>
<%@page import="com.wu.model.Student"%>
<%@page import="com.wu.service.impl.StudentServiceImpl"%>
<%@page import="com.wu.service.StudentService"%>
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
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新学生</title>
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
	String Tno = (String) session.getAttribute("username");
	Teacher teacher = teaServ.queryTeacherById(Tno);
	String pwd = teacher.getTpassword();
	%>
	<form action="teacher?type=updatePassword" method="post">
		<table class="customers" align="center">
		<tr class="alt">
			<td align="center">
				旧密码：<input type="text" name="oldPwd" id="oldPwd">
			</td>
		</tr>
		<tr class="alt">
			<td align="center">
				新密码：<input type="password" name="newPwd" id="newPwd" >
			</td>
		</tr>
		
		<tr class="alt">
			<td align="center">
				确认密码：<input type="password" name="againPwd" id="againPwd" >
			</td>
		</tr>
		
		</div>
		
		<tr class="alt">
			<td align="center">
			<input type="reset" value="取消">
	    	<input type="submit" value="确定" onclick="check(<%= pwd %>)">
	     	</td>
		</tr>
	
		</table>
	</form>
	
<script type="text/javascript">
function check(pwd){
	//alert(pwd);
	var oldPwd = document.getElementById("oldPwd").value();
	//alert(oldPwd);
	var newPwd = document.getElementById("newPwd").value();
	var againPwd = document.getElementById("againPwd").value();
	if(oldPwd!=pwd){
		alert("旧密码错误");
		return;
	}else if (newPwd!=againPwd) {
		alert("两次输入密码不同");
		return;
	}else{return;}
	
}
	
	


</script>


</body>
</html>