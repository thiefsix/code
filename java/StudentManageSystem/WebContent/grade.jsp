<%@page import="com.wu.model.S_C"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.impl.S_CServiceImpl"%>
<%@page import="com.wu.service.S_CService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>教师评分</title>

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
		 		if(scList.isEmpty()){
					out.println("没有数据显示");
				}
		 		for(int i=0;i<scList.size();i++){
		 			S_C sc = (S_C) scList.get(i);%>
		 		
		 			<tr>
		 			<td align="center" >
		 			<%-- <% out.print(sc.getCname()); %> --%>
		 			<input type="text" name="cno" value="<%= sc.getCno() %>" readonly>
		 			</td>
		 			
		 			<td align="center" >
		 			<%-- <% out.print(sc.getCname()); %> --%>
		 			<input type="text" name="cname" value="<%= sc.getCname() %>" readonly>
		 			</td>
		 			<td align="center" >
		 			<%-- <% out.print(sc.getSno()); %> --%>
		 			<input type="text" name="sno" value="<%= sc.getSno() %>" readonly>
		 			</td>
		 			
		 			<td align="center" >
		 			<input type="text" name="generalgrade" id="genegrade<%= i %>" placeholder="<%= sc.getGeneralGrade() %>" onkeyup="sum(this,<%= i %>);">
		 			</td>
		 		
		 			<td align="center" >
		 			<input type="text" name="terminalgrade" id="termgrade<%=i %>" placeholder="<%= sc.getTerminalGrade() %>" onkeyup="sum(this,<%= i %>);">
		 			</td>
		 			<td align="center" >
		 			<input type="text" name="grade" id="grade<%= i %>" placeholder="<%= sc.getGrade() %>" readonly>
		 			</td>
		 			
		 			<td align="center" >
		 			<% String url = "teacher?type=grade&sno="+sc.getSno()+"&cno="+sc.getCno()+"&cname="+sc.getCname()+""; %>
		 			<%-- <a href="teacher?teacher %>"&generalgrade="#"&terminalgrade="#"&grade="#" class="btn btn-danger" onclick="submit(<%= url %>,<%= i %>)">提交</a> --%>
		 			<a href="#" class="btn btn-danger"  onclick="submit('<%=url%>','<%= i %>')">提交</a>
		 			
		 			</td>
		 			</tr>
		 			
		 		<%}
		 	%>
				
		</table>
		<!-- <input type="text" name="test"> -->
	
</body>

 <script type="text/javascript">
        function submit(url,i)
        {
        	/* alert(url);
        	alert(i); */
        	var genegrade = document.getElementById("genegrade" + i).value;
            var termgrade = document.getElementById("termgrade" + i).value;
        	var grade = document.getElementById("grade" + i).value; 
        	url = url + "&genegrade="+genegrade+"&termgrade="+termgrade+"&grade="+grade;
        	//alert(url);
        	location.href = url;
        }
        function sum(obj,i) {
            var a = document.getElementById("genegrade"+i).value;
            var b = document.getElementById("termgrade"+i).value;
            var s = document.getElementById("grade"+i);
			if(a=="" || b==""){
				s.value=0;
				}
			else
				s.value = (parseInt)(parseInt(a)*0.4 + parseInt(b)*0.6).toFixed(0);
        }
        function sum1(obj,i) {
            var a = document.getElementById("genegrade"+i);
            alert(a);
            var b = document.getElementById("termgrade"+i);
            var s = document.getElementById("grade"+i);
			if(a=="" || b==""){
				return;
				}
			else
           	 s.value = (parseInt)(parseInt(a.value)*0.4 + parseInt(b.value)*0.6).toFixed(2);
        }
        </script>
</html>