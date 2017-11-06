<%@page import="com.wu.model.Course"%>
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
<title>产品中心</title>
<link rel="stylesheet" href="/StudentManageSystem/css/style.css" >
<link rel="stylesheet" href="/StudentManageSystem/css/jquery.bxslider.css" >
<link rel="stylesheet" href="/StudentManageSystem/css/reset.css">
<script type="text/javascript" src="/StudentManageSystem/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/StudentManageSystem/js/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="/StudentManageSystem/js/jquery.kkPages.js"></script>
<SCRIPT type="text/javascript" src="/StudentManageSystem/js/base.js"></SCRIPT>
<SCRIPT type="text/javascript" src="/StudentManageSystem/js/lib.js"></SCRIPT>
<SCRIPT type="text/javascript" src="/StudentManageSystem/js/163css.js"></SCRIPT>
</head>
<body>
<% Course cou = (Course) request.getAttribute("cou");
String[] arr = cou.getCurl().split("System\\\\");
	String str = arr[arr.length-1];
	str = "upload/"+str; %>
<!--头部-->
<!--<include file="Public:top.html"/>-->
      
<div class="big_logo">
			<ul>
            	<!--<li><span class="logo"></span></li>-->
                <li>
                	<span class="lgfw">
                			<ul>
                            	<ol class="fw_jt"></ol>
                                <ol class="fw_kefu"><a href="">用户登录</a></ol>
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
        	<li class="top_dh"><a href="/StudentManageSystem/index.jsp">首页</a></li>
            <li class="top_dh"><a >关于我们</a>
            <ul>
                	<li><a href="#">学校简介</a></li>
                    <li><a href="#">学校文化</a></li>
                    <li><a href="#">校长致辞</a></li>
                    <li><a href="#">荣誉资质</a></li>
                    <li><a href="#">学校架构</a></li>
               </ul> 
            </li>	
            <li class="top_dh"><a href="../News/News.html">新闻中心</a>
            <ul>
                	<li><a href="#">学校新闻</a></li>
                    <li><a href="#">学院新闻</a></li>
                    <li><a href="#">班级趣事</a></li>
                    <li><a href="#">学校通知</a></li>
               </ul> 
            </li>
            <li class="top_dh" ><a >全部课程</a>
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
           <!-- <li class="top_dh"><a href="../About/rlzy.html">人力资源</a>
            <ul>
                	<li><a href="#">人才理念</a></li>
                    <li><a href="#">社会招聘</a></li>
                    <li><a href="#">校园招聘</a></li>
               </ul> 
            </li>-->
             <li class="top_dh"><a href="../About/lxwm.html">联系我们</a></li>
           
            <li class="top_fx">
            	<span class="fx_xl"></span>
                <span class="fx_wx"></span>
            </li>
        </ul>
	  </div>      
      
      
      
<div id="big_wrapper">
	
    <!--轮换图-->
<!--<include file="Public:luenhuan.html"/>-->
	
    <!--轮换图-->
    <div class="top_luhuan">
		<div id="banner">
		  <ul class="bxslider1">
			<li><img  src="/StudentManageSystem/images/1.png" alt=""  /></li>
			<li><img  src="/StudentManageSystem/images/2.png" alt=""  /></li>
			<li><img  src="/StudentManageSystem/images/3.png" alt=""  /></li>
			<li><img  src="/StudentManageSystem/images/4.png" alt=""  /></li>
			<li><img  src="/StudentManageSystem/images/5.png" alt=""  /></li>
		  </ul>
		</div>
    </div>

  <div class="top_gywm">
   			<ul>
            	<li class="cpzx_left">
                	<div class="gywm_liebiao">
                    	<ul>
                        	<li class="gywm_lbname"><span class="spa">全部课程</span><span class="spb">adout us</span></li>
                            <li class="gywm_lb">
                            	<div>
                                <ul>
            <% DeptService deptServ1 = new DeptServiceImpl();
            List deptList1 = deptServ1.queryDept();
            for(int i = 0;i<deptList1.size();i++){
            Department dept1 = (Department) deptList1.get(i); %>
            	<li><a href="pageController?type=<%= dept1.getDeptname() %>"><%= dept1.getDeptname() %></a></li>
            <% }
            	%>     	
               </ul> 
                                </div>
                            </li>
                        </ul>
                    </div>
                    
                </li>

               <li class="cpzx_right">
               		<div class="gywm_xp"></div>
						<div class="gywm_rightName">
							<ul>
								<li class="gyName">课程展示<span>company profil</span></li>
								<li class="gyyou"></li>
							</ul>
						</div>
               		<div class="product_rightCP">
                        <ul>
                          	<li class="product_images">
													<div id=preview>
                                                        <div class=jqzoom id=spec-n1 onClick="window.open('http://down.liehuo.net/')"><IMG height=320
                                                        src="<%= str %>" jqimg="<%= str %>" width=350>
                                                        </div>
                                                        <div id=spec-n5>
                                                           <!-- <div class=control id=spec-left>
                                                                <img src="../images/left.gif" />
                                                            </div>
           -->                                                 <!--<div id=spec-list>
                                                                <ul class=list-h>
                                                                    <li><img src="../images/20100820.jpg"> </li>
                                                                    <li><img src="../images/20100820105654736.jpg"> </li>
                                                                    <li><img src="../images/20100712094639942.jpg"> </li>
                                                                    <li><img src="../images/20100820104417799.jpg"> </li>
                                                                    <li><img src="../images/20100820144401230.jpg"> </li>
                                                                    <li><img src="../images/20100820104640206.jpg"> </li>
                                                                    <li><img src="../images/20100712094639942.jpg"> </li>
                                                                    
                                                                </ul>
                                                            </div>-->
                                                            <!--<div class=control id=spec-right>
                                                                <img src="../images/right.gif" />
                                                            </div>-->
                                                            
                                                        </div>
                                                    </div>
                            
                            </li>
                            <li class="product_chanshu">
                            		<div class="cpchanshu">
                                    	<ul>
                                        	<li>课程名称：<span><%= cou.getCname() %></span></li>
                                            <li>学分：<span><%= cou.getCcredit() %></span></li>
                                            <li>课时：<span><%= cou.getCtime() %></span></li>
                                            <li>学院：<span><%= cou.getDeptname() %></span></li>
                                        </ul>
                                    </div>                            
                            </li>
                            <li class="product_jiesao">
                            	<div>
                                	<ul>
                                    	<li class="cp_bt"><span>课程描述</span></li>
                                        <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= cou.getCdescription() %></li>
                                    </ul>
                                </div>
                           </li> 
                        </ul>
                    </div>	
               </li> 
           </ul>
   </div> 
       <div class="Under">
    		<ul>
            	<li class="Ur_dizhi"> 版权所有©湖北大学 信息安全第3组 地址：武汉市武昌区友谊大道368号 </li>
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
<SCRIPT type=text/javascript>
	$(function(){			
	   $(".jqzoom").jqueryzoom({
			xzoom:320,
			yzoom:320,
			offset:10,
			position:"right",
			preload:1,
			lens:1
		});
		$("#spec-list").jdMarquee({
			deriction:"left",
			width:350,
			height:56,
			step:2,
			speed:4,
			delay:10,
			control:true,
			_front:"#spec-right",
			_back:"#spec-left"
		});
		$("#spec-list img").bind("mouseover",function(){
			var src=$(this).attr("src");
			$("#spec-n1 img").eq(0).attr({
				src:src.replace("\/n5\/","\/n1\/"),
				jqimg:src.replace("\/n5\/","\/n0\/")
			});
			$(this).css({
				"border":"2px solid #ff6600",
				"padding":"1px"
			});
		}).bind("mouseout",function(){
			$(this).css({
				"border":"1px solid #ccc",
				"padding":"2px"
			});
		});				
	})
	</SCRIPT>
<SCRIPT src="../js/jquery.bxslider.min.js" type=text/javascript></SCRIPT>
<script type="text/javascript">
$('.bxslider1').bxSlider({
  auto:true,
  infiniteLoop: true,
  hideControlOnEnd: true
});
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>