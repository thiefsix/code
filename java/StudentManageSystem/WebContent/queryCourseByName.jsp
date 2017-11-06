<%@page import="com.wu.model.Course"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	Course course = (Course) request.getAttribute("course");
	String[] arr = course.getCurl().split("System\\\\");
		String str = arr[arr.length-1];
		str = "upload/"+str;%>
	<div style="margin-left:300px;height:300px">
	<div style="float:left">
	<img alt="" src="<% out.print(str); %>" style="width:200px;height:300px">
	</div>
	<div style="float:left;height:300px">
	<div>
	<ul>
	<li>课程名：<% out.print(course.getCname()); %></li>
	<li>课时：<% out.print(course.getCtime()); %></li>
	<li>课程介绍：<% out.print(course.getCdescription()); %></li>
	<li>学分：<% out.print(course.getCcredit()); %></li>
	<li>所属学院：<% out.print(course.getDeptname()); %></li>
	</ul></div>
	</div>
	</div>
	
	

</body>
</html>