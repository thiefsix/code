<%@page import="com.wu.service.impl.CourseServiceImpl"%>
<%@page import="com.wu.service.CourseService"%>
<%@ page language="java" import="java.util.*,com.wu.model.Course"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="com.wu.dao.impl.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<%-- <base href="<%=basePath%>"> --%>
		<title>显示课程信息</title>

     <style type="text/css">
       input[type="text"]{
              height: auto;
	          margin-bottom: 15px;
	          padding: 3px 9px;
            }
     </style>
     <script type="text/javascript" src="js/index.js"></script>
	</head>

	<body>
		
        	<!-- <form action="queryCourseByName" method="post" class="navbar-form navbar-left" role="search">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             
                                课程名称：<input type="text" name="couname" placeholder="课程名称...">
           
         	<i class="icon-search"></i>&nbsp;<button type="submit" class="btn btn-inverse"> 查找</button>
       		</form> -->
        
        <% ArrayList<Course> couList = (ArrayList<Course>) request.getAttribute("couList");
        int pageNow = (Integer)request.getAttribute("pagenow");
        int pageCount = (Integer) request.getAttribute("pagecount");
        
        int navCount = 10;	//分页用的页码超链接数量
		int begin = 0;
		int end = 0;
		
		if (navCount % 2 == 0) {	//导航用的页码超链接数量为偶数

			begin = pageNow <= navCount / 2 + 1 ? 1 : pageNow - navCount / 2;
			end = pageNow + navCount / 2 - 1 > navCount ? pageNow + navCount / 2 - 1 : navCount;
			if (end > pageCount) {
				begin = pageCount - navCount + 1 > 0 ? pageCount - navCount + 1	: 1;
				end = pageCount;
			}
		} else {	//导航用的页码超链接数量为奇数
			begin = pageNow <= navCount / 2 + 1 ? 1 : pageNow - navCount / 2;
			end = pageNow + navCount / 2 > navCount ? pageNow + navCount / 2 : navCount;
			if (end > pageCount) {
				begin = pageCount - navCount + 1 > 0 ? pageCount - navCount + 1	: 1;
				end = pageCount;
			}
		} 
        %>
      
        
		<table  class="table table-hover table-condensed">
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
					<strong>图片</strong>
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
			</tr>
		 	
		 	<%
		 		CourseService couServ = new CourseServiceImpl();
		 		List list = couServ.queryPageCourse(pageNow, 10);			//pageSize=10
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
		 			
		 			<img src="<% out.print(str); %>" height="50" width="70" >
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
		 			</tr>
		 		<%}
		 	%>
		</table>
		
		<div id='nav'>
			<a href='#' onclick="getUrl(<%=pageNow-1%>)">上一页</a>
			<%for (int i = begin; i <= end; i++) { %>
			<a href='#' onclick="getUrl(<%= i %>)"><%= i %></a>
			<% } %>
			<a href='#' onclick="getUrl(<%=pageNow+1%>)">下一页</a>
		</div>

		<hr>
		<a href="admin.jsp" class="btn btn-success">返回主菜单</a>
		<hr>


	</body>
</html>