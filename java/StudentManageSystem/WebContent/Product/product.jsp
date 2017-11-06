<%@page import="com.wu.model.Course"%>
<%@page import="com.wu.model.PageBean"%>
<%@page import="com.wu.service.impl.DeptServiceImpl"%>
<%@page import="com.wu.model.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.wu.service.DeptService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
     <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>课程展示</title>
<link rel="stylesheet" href="/StudentManageSystem/css/style.css" >
<link rel="stylesheet" href="/StudentManageSystem/css/jquery.bxslider.css" >
<link rel="stylesheet" href="/StudentManageSystem/css/reset.css">
<script type="text/javascript" src="/StudentManageSystem/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/StudentManageSystemjs/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="/StudentManageSystem/js/jquery.kkPages.js"></script>
</head>
<body>
<% PageBean pb =(PageBean) request.getAttribute("pb"); %>
<!--头部-->
	<div class="big_logo">
			<ul>
            	<li><span class="logo"></span></li>
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
            <li class="top_dh"><a href="/StudentManageSystem/News/News.html">新闻中心</a>
            <ul>
                	<li><a href="#">学校新闻</a></li>
                    <li><a href="#">学院新闻</a></li>
                    <li><a href="#">班级趣事</a></li>
                    <li><a href="#">学校通知</a></li>
               </ul> 
            </li>
            <li class="top_dh" ><a href="pageController?type=all">全部课程</a>
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
             <li class="top_dh"><a href="/StudentManageSystem/About/lxwm.html">联系我们</a></li>
           
            <li class="top_fx">
            	<span class="fx_xl"></span>
                <span class="fx_wx"></span>
            </li>
        </ul>
	  </div>
      
<div id="big_wrapper">
	
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
            <%  
            for(int i = 0;i<deptList.size();i++){
            Department dept = (Department) deptList.get(i); %>
            	<li><a href="pageController?type=<%= dept.getDeptname() %>"><%= dept.getDeptname() %></a></li>
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
               		<div class="cpzx_rightCP">
                    	<% String type= (String)request.getAttribute("type"); %>
                        <ul class="qikan_list">
                        <% for(int i = 0;i<pb.getCourse().size();i++){
                        	Course cou = pb.getCourse().get(i);
                        	String[] arr = cou.getCurl().split("System\\\\");
        		 			String str = arr[arr.length-1];
        		 			str = "upload/"+str; %>
                          <li class="imghover"><a href="infoController?cno=<%= cou.getCno() %>"  ><img src="<%= str %>" alt=""三一集团"报"/></a>
                            <div class="fix intro">
                              <div class="l t"><%= cou.getDeptname() %></div>
                              <p class="p"><%= cou.getCdescription() %></p>
                            </div>
                            <div class="info">更多...</div>
                          </li>
                        <% }
                        	%>
                        
              <div >

			<a href="pageController?type=<%= type %>&pageNum=1&currentPage=${pb.currentPage}">首页</a>&nbsp;&nbsp;&nbsp;

			<c:if test="${pb.pageNum==1}">
					上一页&nbsp;&nbsp;&nbsp;
			</c:if> <c:if test="${pb.pageNum!=1}">
			<a href="pageController?type=<%= type %>&pageNum=${pb.pageNum-1}&currentPage=${pb.currentPage}">上一页</a>&nbsp;&nbsp;&nbsp;
			</c:if> <c:if test="${pb.pageNum==pb.totalPage}">
			下一页&nbsp;&nbsp;&nbsp;
			</c:if> <c:if test="${pb.pageNum!=pb.totalPage}">
			<a href="pageController?type=<%= type %>&pageNum=${pb.pageNum+1 }&currentPage=${pb.currentPage}">下一页</a>&nbsp;&nbsp;&nbsp;
			</c:if> 
			<a href="pageController?type=<%= type %>&pageNum=${pb.totalPage }&currentPage=${pb.currentPage}">尾页</a>&nbsp;&nbsp;&nbsp;

					<select name="currentPage"
					onchange="changeCurrentPage(<%=type  %>，this.value);">
						<option>--请选择每页条数--</option>
						<option value="3">3</option>
						<option value="6">6</option>
						<option value="9">9</option>
				</select>
			</div>
                          
                          <!-- <li class="imghover"><a href="product_info.html" target="_blank" title="SANY GROUP NEWSPAPER"><img src="../images/20100712094639942.jpg" alt="SANY GROUP NEWSPAPER"/></a>
                            <div class="fix intro">
                              <div class="l t">产品二</div>
                              <p class="p">逆势变奏曲 企业的创新驱动和转型发展...</p>
                            </div>
                            <div class="info">更多...</div>
                          </li>
                          <li class="imghover"><a href="product_info.html" target="_blank" title="三一杂志"><img src="../images/20100820104417799.jpg" alt="三一杂志"/></a>
                            <div class="fix intro">
                              <div class="l t">产品三</div>
                              <p class="p">逆势变奏曲 企业的创新驱动和转型发展...</p>
                            </div>
                            <div class="info"> 更多...</div>
                          </li>
                          
                          <li class="imghover"><a href="product_info.html" target="_blank" title="三一杂志"><img src="../images/20100820104417799.jpg" alt="三一杂志"/></a>
                            <div class="fix intro">
                              <div class="l t">产品四</div>
                              <p class="p">逆势变奏曲 企业的创新驱动和转型发展...</p>
                            </div>
                            <div class="info"> 更多...</div>
                          </li>
                          
                          
                          <li class="imghover"><a href="product_info.html" target="_blank" title="三一杂志"><img src="../images/20100820104640206.jpg" alt="三一杂志"/></a>
                            <div class="fix intro">
                              <div class="l t">产品五</div>
                              <p class="p">逆势变奏曲 企业的创新驱动和转型发展...</p>
                            </div>
                            <div class="info"> 更多...</div>
                          </li>
                          
                          
                          <li class="imghover"><a href="product_info.html" target="_blank" title="三一杂志"><img src="../images/20100820144401230.jpg" alt="三一杂志"/></a>
                            <div class="fix intro">
                              <div class="l t">产品六</div>
                              <p class="p">逆势变奏曲 企业的创新驱动和转型发展...</p>
                            </div>
                            <div class="info"> 更多...</div>
                          </li> -->
                          
                        </ul>
                    </div>	
               </li> 
           </ul>
   </div> 
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
<script type="text/javascript">
	function changeCurrentPage(type,value) {

		location.href = "pageController?type="+type+"&currentPage=" + value;
	};
</script>
</html>