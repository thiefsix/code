<%@page import="com.wu.model.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.impl.DeptServiceImpl"%>
<%@page import="com.wu.dao.impl.DeptDaoImpl"%>
<%@page import="com.wu.service.DeptService"%>
<%@page import="com.wu.model.Course"%>
<%@page import="com.wu.service.impl.CourseServiceImpl"%>
<%@page import="com.wu.service.CourseService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>学生管理系统</title>
<link rel="stylesheet" href="css/style.css" >
<link rel="stylesheet" href="css/jquery.bxslider.css" >
<link rel="stylesheet" href="css/reset.css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>

</head>
<body>

<!--头部调用--><!--导航调用-->
<!--<include file="Public:top"/>-->

<!--头部-->
	<div class="big_logo">
			<ul>
            	<li><span class="logo"></span></li>
                <li>
                	<span class="lgfw">
                			<ul>
                            	<ol class="fw_jt"></ol>
                                <ol class="fw_kefu"><a href="login.jsp">用户登录</a></ol>
                                <ol class="fw_kefu"><a href="">用户注册</a></ol>
                                <ol class="fw_kefu"><a href="">联系我们</a></ol>
                                <ol class="fw_kefu"><a href="">服务热线</a></ol>
                            </ul>
                	</span>
                </li>
            </ul>
    </div>
   	<!--导航-->
    <div class="top_daohang" >
		<ul id="jsddm">
        	<li class="top_dh"><a href="#">首页</a></li>
            <li class="top_dh"><a >关于我们</a>
           		 <ul>
                	<li><a href="#">学校简介</a></li>
                    <li><a href="#">学校文化</a></li>
                    <li><a href="#">校长致辞</a></li>
                    <li><a href="#">荣誉资质</a></li>
                    <li><a href="#">学校架构</a></li>
               </ul> 
            </li>	
            <li class="top_dh"><a href="News/News.html">新闻中心</a>
            <ul>
                	<li><a href="#">学校新闻</a></li>
                    <li><a href="#">学院新闻</a></li>
                    <li><a href="#">班级趣事</a></li>
                    <li><a href="#">学校通知</a></li>
               </ul> 
            </li>
            <li class="top_dh"><a href="pageController?type=all">全部课程</a>
            <ul>
            <% DeptService deptServ = new DeptServiceImpl();
            List deptList = deptServ.queryDept();
            for(int i = 0;i<deptList.size();i++){
            Department dept = (Department) deptList.get(i); %>
            	<li><a href="pageController?type=<%= dept.getDeptname() %>"><%= dept.getDeptname() %></a></li>
            <% }
            	%>     	
               </ul> 
            </li>
           <!-- <li class="top_dh"><a href="About/rlzy.html">人力资源</a>
            <ul>
                	<li><a href="#">人才理念</a></li>
                    <li><a href="#">社会招聘</a></li>
                    <li><a href="#">校园招聘</a></li>
               </ul> 
            </li>-->
             <li class="top_dh"><a href="About/lxwm.html">联系我们</a></li>
            
           
            <li class="top_fx">
            	<span class="fx_xl"></span>
                <span class="fx_wx"></span>
            </li>
        </ul>
	  </div>
      
      
      
      
<div id="big_wrapper">
	
<!--轮换图调用-->
<!--<include file="Public:luenhuan"/>-->    
    <div class="top_luhuan">
		<div id="banner">
		  <ul class="bxslider1">
			<li><img  src="images/1.png" alt=""  /></li>
			<li><img  src="images/2.png" alt=""  /></li>
			<li><img  src="images/3.png" alt=""  /></li>
			<li><img  src="images/4.png" alt=""  /></li>
			<li><img  src="images/5.png" alt=""  /></li>
		  </ul>
		</div>
       
    </div>
    <!--新闻动态-->
    <div class="top_xinwen">
    	<div class="xw_xinwen">
        	<div class="xw_xw1">
            	<ul>
                	<li class="xw_Name">新闻动态<span class="xw_gd">Learn More >></span></li>   	
                         
                    <li class="xw_liebiao" onmouseover="javascript:blurtitle(this)" id="title0"><a href="">学校召开工作：慕课建设</a><span>2016.06.02</span></li>
                            <li class="xw_images" id="content0" style="display:block">
                                    <span class="xw_span"><img src="images/xinwen.png" /></span>
                                    <span class="xw_neirong">
                                        <div class="xw_no1">
                                            <ul>
                                                <li class="cw_abcName">学校召开本学期慕课建设工作第二次推进会<</li>
                                                <li class="cw_abcnoct">学校召开“一流本科教育”研究推进会</li>
                                                <li class="cw_gengduo">Learn More >></li>  
                                            </ul>
                                        </div>       	
                                    </span>
                            </li>
                    <li class="xw_liebiao" onmouseover="javascript:blurtitle(this)" id="title1"><a href="">学校召开“一流本科教育”研究推进会</a><span>2016.04.21</span></li>
                  			  <li class="xw_images" id="content1" style="display:none">
                                    <span class="xw_span"><img src="images/xw.png" /></span>
                                    <span class="xw_neirong">
                                        <div class="xw_no1">
                                            <ul>
                                                <li class="cw_abcName"></li>
                                                <li class="cw_abcnoct">年工程机械行业是我国装备制造业的重要的组成部分...</li>
                                                <li class="cw_gengduo">Learn More >></li>  
                                            </ul>
                                        </div>       	
                                    </span>
                            </li>
                    <li class="xw_liebiao" onmouseover="javascript:blurtitle(this)" id="title2"><a href="">蒋涛副校长观摩《电工学》课程</a><span>2016.04.06</span></li>
								<li class="xw_images" id="content2" style="display:none">
                                    <span class="xw_span"><img src="images/EE9B45F3196B1EAD0BC9820D947_417689DC_5593.png" /></span>
                                    <span class="xw_neirong">
                                        <div class="xw_no1">
                                            <ul>
                                                <li class="cw_abcName"></li>
                                                <li class="cw_abcnoct">年工程机械行业是我国装备制造业的重要的组成部分...</li>
                                                <li class="cw_gengduo">Learn More >></li>  
                                            </ul>
                                        </div>       	
                                    </span>
                            </li>
                	<li class="xw_liebiao" onmouseover="javascript:blurtitle(this)" id="title3"><a href="">党委书记尚钢调研本科教学工作</a><span>2015.10.24</span></li>
                   			<li class="xw_images" id="content3" style="display:none">
                                    <span class="xw_span"><img src="images/1A9944F5864EA66294F167A5820_1AEE4FD2_D88D.png" /></span>
                                    <span class="xw_neirong">
                                        <div class="xw_no1">
                                            <ul>
                                                <li class="cw_abcName">长征80周年讲话</li>
                                                <li class="cw_abcnoct">年工程机械行业是我国装备制造业的重要的组成部分...</li>
                                                <li class="cw_gengduo">Learn More >></li>  
                                            </ul>
                                        </div>       	
                                    </span>
                            </li>
					<li class="xw_liebiao" onmouseover="javascript:blurtitle(this)" id="title4"><a href="">新学期第一天：全体校领导深入教室听课</a><span>2016.02.25</span></li>
                    		  <li class="xw_images" id="content4" style="display:none">
                                    <span class="xw_span"><img src="images/0C08875480E3A0975F7FF4040B2_069E6474_31858.png" /></span>
                                    <span class="xw_neirong">
                                        <div class="xw_no1">
                                            <ul>
                                                <li class="cw_abcName"></li>
                                                <li class="cw_abcnoct">年工程机械行业是我国装备制造业的重要的组成部分...</li>
                                                <li class="cw_gengduo">Learn More >></li>  
                                            </ul>
                                        </div>       	
                                    </span>
                            </li>
                </ul>
            </div>
        </div>
		<div class="xw_chanpin">
        	<div class="xw_xw1">
            	<ul>
                	<li class="xw_Name">课程展示<span class="xw_gd">Learn More >></span></li>
                	<% CourseService couServ = new CourseServiceImpl();
                	Course cou1 = couServ.queryCourseById("001");
                	String[] arr1 = cou1.getCurl().split("System\\\\");
		 			String str1 = arr1[arr1.length-1];
		 			str1 = "upload/"+str1; %>
                    <div class="cp_abc" id="div1" style="display:block">
                    	<a href="infoController?cno=<%= cou1.getCno() %>"><ul>
                        	<li><span class="cp_abcimag"><img src="<%= str1 %>" /></span></li>
                            <li>
								<div class="cp_name">
                                	<ul>
                                    	<li class="cp_abcName"><%= cou1.getCname() %></li>
                             
                                    	
                                        <li class="cp_abcnoct"><%= cou1.getCdescription() %></li>
                                        <li class="cp_gengduo">Learn More ></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                        </a>
                    </div>
                    
                     <div class="cp_abc" id="div2" style="display:none">
                    
                    	<ul>
                    	<% Course cou2 = couServ.queryCourseById("002");
                            String[] arr2 = cou2.getCurl().split("System\\\\");
        		 			String str2 = arr2[arr2.length-1];
        		 			str2 = "upload/"+str2; %>
        		 			<a href="infoController?cno=<%= cou2.getCno() %>">
                        	<li><span class="cp_abcimag"><img src="<%= str2 %>" /></span></li>
                        	 
                            <li>
                            
								<div class="cp_name">
                                	<ul>
                                    	<li class="cp_abcName"><%= cou2.getCname() %></li>
                                        <li class="cp_abcnoct"><%= cou2.getCdescription() %></li>
                                        <li class="cp_gengduo">Learn More >></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </a>
                    </div>
                    
                     <div class="cp_abc" id="div3" style="display:none">
                     
                    	<ul>
                    	<% Course cou3 = couServ.queryCourseById("003");
                            String[] arr3 = cou3.getCurl().split("System\\\\");
        		 			String str3 = arr3[arr3.length-1];
        		 			str3 = "upload/"+str3; %>
        		 			<a href="infoController?cno=<%= cou3.getCno() %>">
                        	<li><span class="cp_abcimag"><img src="<%= str3 %>"/></span></li>
                            <li>
								<div class="cp_name">
                                	<ul>
                                    	<li class="cp_abcName"><%= cou3.getCname() %></li>
                                        <li class="cp_abcnoct"><%= cou3.getCdescription() %></li>
                                        <li class="cp_gengduo">Learn More >></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </a>    
                    </div>
                    
                    <li class="cp_lrixin">
                    	<div class="cp_neixin">
                        	<ul>
                            	<li><a href="/" onMouseMove="toggle('1')">热门课程</a></li>
                                <li><a href="/" onMouseMove="toggle('2')">特色课程</a></li>
                                <li><a href="/" onMouseMove="toggle('3')">精品课程</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
        <div class="xw_lianxi">
        	<img src="images/4556.gif" />
        </div>
		<div class="xw_lxTel">
        	<div class="xw_lxName">
            		<ul>
                    	<li class="lx_nameA">咨询热线</li>
                        <li class="lx_nameB">
                        	<font color="#333333" size="2">热线 ：</font><font  size="2">0592 123456</font><p>
                            <font color="#333333" size="2">传真 ：</font><font  size="2">0592 123456</font><p>
                            <font color="#333333" size="2">邮件 ：</font><font  size="2">0592@163.com</font><p>
                        </li>
                    </ul>
            </div>
        </div>
    </div>
    
<!--底部-->   

<!--<include file="Public:footer"/> -->   
    
    
    <div class="Under">
    		<ul>
            	<li class="Ur_dizhi"> 版权所有©湖北大学 信息安全第3组 地址：湖北省武汉市武昌区友谊大道368号 </li>
                <li class="Ur_caidan">
                		<div class="Ur_cd">
                        	<ul>
                        		
                               
                                <li class="Ur_cdA"><a href="">友情链接</a></li>
                                <li class="Ur_cdA"><a href="">会员登录</a></li>
                                <li class="Ur_cdA"><a href="">联系我们</a></li>
                            </ul>
                        </div>
                </li>
            </ul>
    </div>
    <div class="Under_B">
    		<ul>
            	<li class="BACDE"> 鄂ICP备05003305&nbsp;&nbsp;&nbsp;&nbsp;鄂公网安备 42010602000204号</li>
                
                </li>
            </ul>
    		
    </div>
</div>
<script language="JavaScript" type="text/JavaScript">
 function toggle(targetid){
 	document.getElementById("div"+targetid).style.display="block";        
 	for(var i =1;i<=4;i++){
		if(targetid != i){
			document.getElementById("div"+i).style.display="none";
		}
	}
 }
 </script>	
<script type="text/javascript">
var timeout         = 500;
var closetimer		= 0;
var ddmenuitem      = 0;

function jsddm_open()
{	jsddm_canceltimer();
	jsddm_close();
	ddmenuitem = $(this).find('ul').eq(0).css('visibility', 'visible');
	
	}

function jsddm_close()
{	if(ddmenuitem) ddmenuitem.css('visibility', 'hidden');
}

function jsddm_timer()
{	closetimer = window.setTimeout(jsddm_close, timeout);
   
}

function jsddm_canceltimer()
{	if(closetimer)
	{	window.clearTimeout(closetimer);
		closetimer = null;}}

$(document).ready(function()
{	$('#jsddm > li').bind('mouseover', jsddm_open);
	$('#jsddm > li').bind('mouseout',  jsddm_timer);});

document.onclick = jsddm_close;
  </script>
<script type="text/javascript"> 
	function blurtitle(v){ //鼠标滑过显示内容方法
		for(var i=0;i<5;i++){ //以3个标题举例
			if("title"+i == v.id){ //当前循环的i如果是正确的标题，将内容的display设为block，即显示
				document.getElementById("content"+i).style.display = "block";
			}else{ //当前循环的i是其他标题，将内容设为none，即隐藏
				document.getElementById("content"+i).style.display = "none"; 
			}
		}
	}
	
	
</script>
<SCRIPT src="js/jquery.bxslider.min.js" type=text/javascript></SCRIPT>
<script type="text/javascript">
$('.bxslider1').bxSlider({
  auto:true,
  infiniteLoop: true,
  hideControlOnEnd: true
});
</script>

</body>
</html>