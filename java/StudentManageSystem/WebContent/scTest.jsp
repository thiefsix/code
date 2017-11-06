<%@page import="com.wu.model.S_C"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.impl.S_CServiceImpl"%>
<%@page import="com.wu.service.S_CService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table  class="customers" >
		    <tr>
				<td align="center">
					<strong>课程编号</strong>
				</td>
				
				<td align="center">
					<strong>课程名称</strong>
				</td>
				
				<td align="center">
					<strong>学生编号</strong>
				</td>
				
				<td align="center">
					<strong>平时成绩</strong>
				</td>
				<td align="center" >
					<strong>期末成绩</strong>
				</td>
				<td align="center" >
					<strong>最终成绩</strong>
				</td>
				<td align="center" >
					<strong>执行操作</strong>
				</td>
			</tr>
				<% 
				S_CService scServ = new S_CServiceImpl();
				List<S_C> scList = scServ.queryAllSC();
				for(int i = 0;i < scList.size();i++){
					S_C sc = scList.get(i);%>
			<tr>
		 		<td>
		 			<%= sc.getSno() %>
		 		</td>
		 		<td>
		 			<%= sc.getCno() %>
		 		</td>
		 	</tr>
					
				<% }
				%>
		 	
		 			
		 	
				
		</table>

</body>
</html>