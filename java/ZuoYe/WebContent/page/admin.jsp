﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="main.css" rel="stylesheet" type="text/css"/>
<style>
body{margin:0;padding:0;}
#warp{width:880px;margin:0 auto;}

#hearder{
	width:100%;
	border:4px solid #0CF;
    background:url(Image/0fa815af977624c5-e4e166f8ed6cf4d9-a0a14355ee2d203ecf10285acf675800.jpg);}
#mainbody{width:100%;overflow:hidden;}

.left{
    line-height:30px;
    background-color:#DADADA;
    width:100px;
    float:left;
    padding:5px;}
.right{
	 line-height:30px;
    background-color:#FDFDFD;
    
    width:350px;
    float:left;
    padding:5px;
       }
	   #footer {
    background:
	url(../../Pictures/0fa815af977624c5-e4e166f8ed6cf4d9-a0a14355ee2d203ecf10285acf675800.jpg);
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
a.hover{
color:blue;
}
#test{
	text-align:center;
	/*background:url(Image/0fa815af977624c5-e4e166f8ed6cf4d9-a0a14355ee2d203ecf10285acf675800.jpg);*/
}
</style>

	
  </head>
  
  <body>
<p>
 <% 
 String admin_username = (String)session.getAttribute("username"); 
if(admin_username==null){response.sendRedirect("adminlogin.jsp");}
String mainPage=(String)request.getAttribute("mainPage");
if(mainPage==null || mainPage.equals("")){
		mainPage="default.jsp";}         
%>
</p>
<div id="wrap"> 
<div id="hearder" >
<h3  style="padding:30px 50px;"> 欢迎：${user.nickname}  登录系统后台</h3>
</div>

<div id="mainbody">

    <div  class="left" > 
    <div class="box1" >操作选项</div>
      <p><a href="main.jsp" class="box2" style="text-decoration:none"><span>系统首页</span></a></p>
      <p> 
        <a href="ShowAllCourseServlet" class="box3" style="text-decoration:none"><span>课程管理</span></a></p>
      <p>
        <a  class="box3" style="text-decoration:none"><span>学生管理</span></a></p>
      <p>
        <a  class="box3" style="text-decoration:none"><span>教师管理</span></a></p>
      <p>      <a  class="box3" style="text-decoration:none"><span>个人信息</span></a></p>
      <p> 
        <a  class="box3" style="text-decoration:none" onclick="checkout()">退出系统
        </a>
        </p>
    </div>
    
    <div id="test"><jsp:include page="<%=mainPage %>"></jsp:include></div>
</div>
   
  </body>
  <script type="text/javascript">
	      function checkout() {
	      if(confirm("您确定要退出吗?")){
		        window.location.href = "logout.jsp"
	           }
	           }
         </script>
		<script type="text/javascript">
</html>
