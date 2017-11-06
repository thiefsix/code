#coding=utf-8

import re

html = '''

<!DOCTYPE html>
<html>
<head>
	<title>网络安全知识|网络安全知识培训|网络安全知识学习|网络安全知识平台-i春秋</title>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="i春秋网络安全知识学院是一个专业提供网络安全知识学习、网络安全知识培训的网络安全知识平台。网络安全知识学习、培训，尽在i春秋。">
	<meta name="keywords" content="网络安全知识,计算机安全知识,企业安全,系统安全,安全管理,邮件安全,服务器安全,系统漏洞,安全漏洞">
<!-- icon -->
<link rel="shortcut icon" href="https://static2.ichunqiu.com/icq/resources/images/favicon.ico">
<link rel="stylesheet" href="https://static2.ichunqiu.com/icq/resources/css/courses/courses.css" type="text/css" media="screen">
</head>
<body>
	<!-- 插件css -->
<link rel="stylesheet" type="text/css" href="https://static2.ichunqiu.com/icq/resources/css/plugin/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://static2.ichunqiu.com/icq/resources/css/plugin/jquery.mCustomScrollbar.min.css" />
<!-- 公共css -->
<link rel="stylesheet" type="text/css" href="https://static2.ichunqiu.com/icq/resources/css/common/component.css"/>
<!-- 头部css -->
<link rel="stylesheet" type="text/css" href="https://static2.ichunqiu.com/icq/resources/css/common/header.css"/>
<!--企安殿4.0新用户登陆css-->
<link rel="stylesheet" type="text/css" href="https://static2.ichunqiu.com/icq/resources/css/company/qad/qadfyd.css"/>
<!--[if IE 8]>
<style>
/*ie8可圆角*/
	.css3PIE{
		position: relative;
		z-index: 2;
		behavior: url('https://static2.ichunqiu.com/icq/resources/css/plugin/css3PIE.htc');
	}
</style>
<![endif]-->
<style>
@font-face {
  font-family: 'Glyphicons Halflings';
  src: url('https://www.ichunqiu.com/resources/fonts/glyphicons-halflings-regular.eot');
  src: url('https://www.ichunqiu.com/resources/fonts/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('https://www.ichunqiu.com/resources/fonts/glyphicons-halflings-regular.woff') format('woff'), url('https://www.ichunqiu.com/resources/fonts/glyphicons-halflings-regular.ttf') format('truetype'), url('https://www.ichunqiu.com/resources/fonts/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}
</style>
<!--企安殿4.0新入口引导-->		
<div class="new_rktk"></div>
<div class="new_rk">
	<div class="sd"></div>
	<div class="new_text">
		<span></span>
		<button>我知道了</button>
	</div>
</div>	
<!-- 头部html -->
<div class="header">
 	<img id="wx_global_pic" src="https://static2.ichunqiu.com/icq/resources/images/common/logo400slogan.jpg" style="position:absolute;z-index:0;left: -10000px;">
	<div class="login">
		<div class="colororange">
			<a class="logo" href="https://www.ichunqiu.com/"></a>
			<div class="mainSrh">
				<input id="searchVal" type="text" placeholder="搜索课程、竞赛或讲师">
				<a id="searchIcon" target="_blank" href="javascript:void(0)">
					<i class="ficon search"></i>
				</a>
			</div>
			<div class="hotsear"></div>
			<div class="loginright">
				<div class="apppys pxzhujiao"></div>
				<div class="apppys qiandian"></div>
				<div class="apppys">
					<i class="ficon phone"></i>
					<a href="https://www.ichunqiu.com/default/apppys">下载App</a>
					<img class="android" src="https://static2.ichunqiu.com/icq/resources/images/common/androidapp.png" alt="Android">
				</div>

				<!-- 登陆后 -->
									<div class="loginafter" style="display:inline-block;">
						<!-- 大学生vip需要判断是否有 -->
												<a class="username" title="yijiyouyu" href="https://www.ichunqiu.com/personal/myStudying">yijiyouyu</a>
						<span class="msg css3PIE" style="display: none;">0</span>
																				<!-- 正常用户 -->
							<div class="personmsgs personuser">
								<dl class="clearfix">
									<dt class="css3PIE">
										<a href="https://www.ichunqiu.com/personal/myStudying">
											<img src="https://static2.ichunqiu.com/icq/resources/upload/images/DefaultUserIcon.png" alt="" onerror="javascript:this.onerror=null;this.src='https://static2.ichunqiu.com/icq/resources/upload/images/DefaultUserIcon.png';">
										</a>
									</dt>
									<dd>
										<a href="https://www.ichunqiu.com/personal/myStudying">yijiyouyu</a>
										<span id="userrank"></span>
										<span class="studytime"></span>
									</dd>
			                        <a href="https://www.ichunqiu.com/personal/index"><i class="ficon set"></i></a>
								</dl>
								<div class="news">
									<a href="https://www.ichunqiu.com/personal/message"><i class="ficon message"></i>官方消息：<span></span></a>
									<a href="https://bbs.ichunqiu.com/home.php?mod=space&do=pm"><i class="ficon forum"></i>论坛消息：<span></span></a>
								</div>
								<ul id="courcecome">
									<li><i class="time"></i>暂无</li>
								</ul>
								<div class="getout">
									<a href="javascript:quit()">退出</a>
								</div>
							</div>
												</div>
							</div>
		</div>
	</div>
	<div id="hidiv" style="display: none;"></div>
	<div class="headernav">
		<ul>
			<li data-val="0"><a style="padding-left: 0px;" href="https://www.ichunqiu.com/">首页</a></li>
			<li data-val="1"><a href="https://www.ichunqiu.com/courses">知识体系</a></li>
			<li data-val="2"><a href="https://www.ichunqiu.com/#profession">职业成长</a></li>
			<li data-val="3"><a href="https://www.ichunqiu.com/racing">竞赛训练</a></li>
			<li data-val="9"><a class="newnav" href="https://www.ichunqiu.com/train">培训认证</a></li>
			<li data-val="4"><a href="https://www.ichunqiu.com/default/qiand">企安殿</a></li>
			<li data-val="8"><a class="newnav listHot" href="https://www.ichunqiu.com/src">SRC部落</a></li>
			<!--<li data-val="5"><a href="https://www.ichunqiu.com/opencourse">公开课</a></li>
			<li data-val="6"><a href="https://www.ichunqiu.com/recruit">讲师招募</a></li>-->
			<li data-val="7"><a target="_blank" href="https://bbs.ichunqiu.com/?from=xueyuan" id="bd_bbs_tj">社区</a></li>
		</ul>
	</div>
	<div class="right-nav-box">
		<!--双11新增浮框-->
		<div class="right-nav double11" style="display: none;" onclick="window.location.href='https://www.ichunqiu.com/double?From=double11_2'">
			<div class="kfpic"><img src="https://static2.ichunqiu.com/icq/resources/images/double11/hovershow11.png"></div>
		</div>

		<div class="right-nav kf">
			<div class="kfpic"></div>
		</div>
		<div class="right-nav qq">
			<a href="tencent://message/?uin=2097706690&Site=i春秋&Menu=yes"></a>
		</div>
		<div class="right-nav app">
			<div class="apppic"></div>
		</div>

		<div class="right-nav wx">
			<div class="wxpic"></div>
		</div>
		<div class="right-nav wb">
			<div class="wbpic"></div>
		</div>
		<div class="right-nav totop"></div>
	</div>
</div>
			<!--双11新增小banner-->
					
		<div class="coursesMain">
			<div class="coursesType">
				<div class="typeTitle">
					<h1>知识体系</h1>
				</div>
				<div class="direction orientation">
					<div class="leftPart">
						<span class="tag">方向：</span>
						<span class="lab all active">
							<a href="https://www.ichunqiu.com/courses/all-all-0-0-0-2-1">全部</a>
						</span>
					</div>
					<div class="typeList">
																														<span class="lab">
										<a href="https://www.ichunqiu.com/courses/enterprise-all-0-0-0-2-1">名企谈安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/company-all-0-0-0-2-1">企业安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/website-all-0-0-0-2-1">网站安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/client-all-0-0-0-2-1">客户端安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/communication-all-0-0-0-2-1">通信安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/mobile-all-0-0-0-2-1">移动安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/hardware-all-0-0-0-2-1">智能硬件安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/factory-all-0-0-0-2-1">工控安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/safety-all-0-0-0-2-1">安全理论</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/ctf-all-0-0-0-2-1">CTF学习</a>
									</span>
																										</div>
				</div>
				<div class="classify">
					<div class="leftPart">
						<span class="tag">分类：</span>
						<span class="lab all ">
							<a href="https://www.ichunqiu.com/courses/all-all-0-0-0-2-1">全部</a>
						</span>
					</div>
					<div class="typeList add_type">
																														<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-venus-0-0-0-2-1">启明星辰</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-knownsec-0-0-0-2-1">知道创宇 </a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-360-0-0-0-2-1">奇虎360 </a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-tass-0-0-0-2-1">江南天安</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-secwk-0-0-0-2-1">威客安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-baidu-0-0-0-2-1">百度安全应急响应中心</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-theory-0-0-0-2-1">安全理论</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-operation-0-0-0-2-1">安全运维</a>
									</span>
																																<span class="lab active">
										<a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-1">Web安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-data-0-0-0-2-1">数据安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-server-0-0-0-2-1">服务器安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-software-0-0-0-2-1">软件安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-system-0-0-0-2-1">系统安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-operate-0-0-0-2-1">安全运营</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-intelligence-0-0-0-2-1">安全智能</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-cloud-0-0-0-2-1">云安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-wifi-0-0-0-2-1">无线安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-ios-0-0-0-2-1">iOS安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-android-0-0-0-2-1">Android安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-car-0-0-0-2-1">智能汽车</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-home-0-0-0-2-1">智能家居</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-other-0-0-0-2-1">其他智能硬件</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-threaten-0-0-0-2-1">安全威胁</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-protect-0-0-0-2-1">安全防护</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-manage-0-0-0-2-1">安全管理</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-popular-0-0-0-2-1">安全普及</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-information-0-0-0-2-1">信安理论</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-teenagers-0-0-0-2-1">青少年安全</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-misc-0-0-0-2-1">Misc</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-pwn-0-0-0-2-1">Pwn</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-web-0-0-0-2-1">Web</a>
									</span>
																																<span class="lab">
										<a href="https://www.ichunqiu.com/courses/all-reverse-0-0-0-2-1">Reverse</a>
									</span>
																										</div>
				</div>
				<div class="direction difficulty" data-label="">
					<div class="leftPart">
						<span class="tag">难度：</span>
						<span class="lab all active">
							<a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-1">全部</a>
						</span>
					</div>
					<div class="typeList">
																			<span class="lab ">
								<a href="https://www.ichunqiu.com/courses/all-websecurity-1-0-0-2-1">初级</a>
							</span>
													<span class="lab ">
								<a href="https://www.ichunqiu.com/courses/all-websecurity-2-0-0-2-1">中级</a>
							</span>
													<span class="lab ">
								<a href="https://www.ichunqiu.com/courses/all-websecurity-3-0-0-2-1">高级</a>
							</span>
											</div>
				</div>
				<div class="direction test" data-label="">
					<div class="leftPart">
						<span class="tag">实验：</span>
						<span class="lab all active">
							<a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-1">全部</a>
						</span>
					</div>
					<div class="typeList">
																			<span class="lab ">
								<a href="https://www.ichunqiu.com/courses/all-websecurity-0-1-0-2-1">是</a>
							</span>
													<span class="lab ">
								<a href="https://www.ichunqiu.com/courses/all-websecurity-0-2-0-2-1">否</a>
							</span>
											</div>
				</div>
				
				<div class="controlMenu">
					<ul>
																						<li class="menutitle ">
														<span><a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-1-2-1">最新</a></span>
													</li>
																	<li class="menutitle ">
														<span><a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-2-2-1">最热</a></span>
													</li>
																	<li class="menutitle ">
														<span><a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-3-2-1">好评</a></span>
													</li>
																	<li class="menutitle ">
														<span><a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-4-2-1">价格</a></span>
													</li>
										</ul>
					<div class="pageTop">
						<a href="javascript:;"><span class="pageTopleft"></span></a>
						<span class="pageNumber">1</span>&nbsp;/&nbsp;<span class="total">3</span>
						<a href="https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-2"><span class="pageTopright"></span></a>
					</div>
				</div>
			</div>
			<!--模块-->
			<div class="coursesdiv">
				<ul class="course-box">
																										<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/59001" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1505808538920.jpg" alt="ThinkPHP框架审计 ">
												</a>
																									<div class='follow' data-cid="59001" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="ThinkPHP框架审计 " onclick="javascript:window.open('https://www.ichunqiu.com/course/59001')">ThinkPHP框架审计 </div>
																											<div class="favorate" course-data="59001" cou-data="ThinkPHP框架审计 " data-favo="0" style="cursor: pointer;">62泉</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第6节">更新到第6节</span></div>
																										<div class="comment">22999人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58593" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1500348309863.jpg" alt="Kali-Linux 稳中求进">
												</a>
																									<div class='follow' data-cid="58593" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Kali-Linux 稳中求进" onclick="javascript:window.open('https://www.ichunqiu.com/course/58593')">Kali-Linux 稳中求进</div>
																											<div class="favorate" course-data="58593" cou-data="Kali-Linux 稳中求进" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第17节">更新到第17节</span></div>
																										<div class="comment">105367人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/57945" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1492738476127.jpg" alt="Cobalt Strike高级渗透">
												</a>
																									<div class='follow' data-cid="57945" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Cobalt Strike高级渗透" onclick="javascript:window.open('https://www.ichunqiu.com/course/57945')">Cobalt Strike高级渗透</div>
																											<div class="favorate" course-data="57945" cou-data="Cobalt Strike高级渗透" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第25节">更新到第25节</span></div>
																										<div class="comment">88342人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd none">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/59281" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1507683850062.jpg" alt="教你玩转XSS漏洞">
												</a>
																									<div class='follow' data-cid="59281" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="教你玩转XSS漏洞" onclick="javascript:window.open('https://www.ichunqiu.com/course/59281')">教你玩转XSS漏洞</div>
																											<div class="favorate" course-data="59281" cou-data="教你玩转XSS漏洞" data-favo="0" style="cursor: pointer;">10泉</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第1节">更新到第1节</span></div>
																										<div class="comment">16876人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/59089" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1505438267280.jpg" alt="【S2-053】Struts2远程命令执行漏洞（CVE-2017-12611）">
												</a>
																									<div class='follow' data-cid="59089" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="【S2-053】Struts2远程命令执行漏洞（CVE-2017-12611）" onclick="javascript:window.open('https://www.ichunqiu.com/course/59089')">【S2-053】Struts2远程命令执行漏洞（CVE-2017-12611）</div>
																											<div class="favorate" course-data="59089" cou-data="【S2-053】Struts2远程命令执行漏洞（CVE-2017-12611）" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时2分钟">1课时2分钟</span></div>
																										<div class="comment">11011人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/59007" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1504833744014.jpg" alt="FineCMS 5.0.10漏洞集合">
												</a>
																									<div class='follow' data-cid="59007" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="FineCMS 5.0.10漏洞集合" onclick="javascript:window.open('https://www.ichunqiu.com/course/59007')">FineCMS 5.0.10漏洞集合</div>
																											<div class="favorate" course-data="59007" cou-data="FineCMS 5.0.10漏洞集合" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时4分钟">1课时4分钟</span></div>
																										<div class="comment">12291人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58947" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1503624035929.jpg" alt="MetInfo5.3.17 SQL前台注入">
												</a>
																									<div class='follow' data-cid="58947" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="MetInfo5.3.17 SQL前台注入" onclick="javascript:window.open('https://www.ichunqiu.com/course/58947')">MetInfo5.3.17 SQL前台注入</div>
																											<div class="favorate" course-data="58947" cou-data="MetInfo5.3.17 SQL前台注入" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时6分钟">1课时6分钟</span></div>
																										<div class="comment">15892人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd none">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58895" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1502414624596.jpg" alt=" Supervisord 远程代码执行漏洞（CVE-2017-11610）">
												</a>
																									<div class='follow' data-cid="58895" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title=" Supervisord 远程代码执行漏洞（CVE-2017-11610）" onclick="javascript:window.open('https://www.ichunqiu.com/course/58895')"> Supervisord 远程代码执行漏洞（CVE-2017-11610）</div>
																											<div class="favorate" course-data="58895" cou-data=" Supervisord 远程代码执行漏洞（CVE-2017-11610）" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时6分钟">1课时6分钟</span></div>
																										<div class="comment">11963人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58845" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1501810297031.jpg" alt="FengCms1.32 重装漏洞">
												</a>
																									<div class='follow' data-cid="58845" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="FengCms1.32 重装漏洞" onclick="javascript:window.open('https://www.ichunqiu.com/course/58845')">FengCms1.32 重装漏洞</div>
																											<div class="favorate" course-data="58845" cou-data="FengCms1.32 重装漏洞" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时4分钟">1课时4分钟</span></div>
																										<div class="comment">9187人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/53437" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/002/53437.jpg" alt="Python安全工具开发应用">
												</a>
																									<div class='follow' data-cid="53437" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Python安全工具开发应用" onclick="javascript:window.open('https://www.ichunqiu.com/course/53437')">Python安全工具开发应用</div>
																											<div class="favorate" course-data="53437" cou-data="Python安全工具开发应用" data-favo="0" style="cursor: pointer;">189泉</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第27节">更新到第27节</span></div>
																										<div class="comment">311116人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58771" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1500543385793.png" alt="Petya病毒二进制分析——利用永恒之蓝的新一波勒索软件">
												</a>
																									<div class='follow' data-cid="58771" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Petya病毒二进制分析——利用永恒之蓝的新一波勒索软件" onclick="javascript:window.open('https://www.ichunqiu.com/course/58771')">Petya病毒二进制分析——利用永恒之蓝的新一波勒索软件</div>
																											<div class="favorate" course-data="58771" cou-data="Petya病毒二进制分析——利用永恒之蓝的新一波勒索软件" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时20分钟">1课时20分钟</span></div>
																										<div class="comment">12108人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd none">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58723" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1499847760099.jpg" alt="Drupal远程代码执行漏洞(CVE-2017-6920)">
												</a>
																									<div class='follow' data-cid="58723" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Drupal远程代码执行漏洞(CVE-2017-6920)" onclick="javascript:window.open('https://www.ichunqiu.com/course/58723')">Drupal远程代码执行漏洞(CVE-2017-6920)</div>
																											<div class="favorate" course-data="58723" cou-data="Drupal远程代码执行漏洞(CVE-2017-6920)" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时3分钟">1课时3分钟</span></div>
																										<div class="comment">10443人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58459" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1498126021384.jpg" alt=" Windows COM组件提权漏洞 （CVE-2017-0213）">
												</a>
																									<div class='follow' data-cid="58459" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title=" Windows COM组件提权漏洞 （CVE-2017-0213）" onclick="javascript:window.open('https://www.ichunqiu.com/course/58459')"> Windows COM组件提权漏洞 （CVE-2017-0213）</div>
																											<div class="favorate" course-data="58459" cou-data=" Windows COM组件提权漏洞 （CVE-2017-0213）" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时4分钟">1课时4分钟</span></div>
																										<div class="comment">14812人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58577" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1498096214980.jpg" alt="LNK文件远程代码执行漏洞(CVE-2017-8464)">
												</a>
																									<div class='follow' data-cid="58577" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="LNK文件远程代码执行漏洞(CVE-2017-8464)" onclick="javascript:window.open('https://www.ichunqiu.com/course/58577')">LNK文件远程代码执行漏洞(CVE-2017-8464)</div>
																											<div class="favorate" course-data="58577" cou-data="LNK文件远程代码执行漏洞(CVE-2017-8464)" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时7分钟">1课时7分钟</span></div>
																										<div class="comment">14825人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58291" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1497926459460.jpg" alt="【"百度杯"沙龙】小漏洞也有大梦想 ">
												</a>
																									<div class='follow' data-cid="58291" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="【"百度杯"沙龙】小漏洞也有大梦想 " onclick="javascript:window.open('https://www.ichunqiu.com/course/58291')">【"百度杯"沙龙】小漏洞也有大梦想 </div>
																											<div class="favorate" course-data="58291" cou-data="【"百度杯"沙龙】小漏洞也有大梦想 " data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时15分钟">1课时15分钟</span></div>
																										<div class="comment">12053人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd none">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/53239" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/002/53239.jpg" alt="企业级信息安全工程师实战">
												</a>
																									<div class='follow' data-cid="53239" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="企业级信息安全工程师实战" onclick="javascript:window.open('https://www.ichunqiu.com/course/53239')">企业级信息安全工程师实战</div>
																											<div class="favorate" course-data="53239" cou-data="企业级信息安全工程师实战" data-favo="0" style="cursor: pointer;">86泉</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="13课时417分钟">13课时417分钟</span></div>
																										<div class="comment">29464人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/54093" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/002/54093.jpg" alt="暴走Python">
												</a>
																									<div class='follow' data-cid="54093" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="暴走Python" onclick="javascript:window.open('https://www.ichunqiu.com/course/54093')">暴走Python</div>
																											<div class="favorate" course-data="54093" cou-data="暴走Python" data-favo="0" style="cursor: pointer;">62泉</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus"></span><span title="更新到第16节">更新到第16节</span></div>
																										<div class="comment">81764人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58309" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1495701670800.jpg" alt="The Guardians进化史：白帽子如何修炼漏洞挖掘技能">
												</a>
																									<div class='follow' data-cid="58309" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="The Guardians进化史：白帽子如何修炼漏洞挖掘技能" onclick="javascript:window.open('https://www.ichunqiu.com/course/58309')">The Guardians进化史：白帽子如何修炼漏洞挖掘技能</div>
																											<div class="favorate" course-data="58309" cou-data="The Guardians进化史：白帽子如何修炼漏洞挖掘技能" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="7课时98分钟">7课时98分钟</span></div>
																										<div class="comment">39865人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58303" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1495713860931.jpg" alt="Roundcube邮件正文存储型XSS(CVE-2017-6820)">
												</a>
																									<div class='follow' data-cid="58303" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Roundcube邮件正文存储型XSS(CVE-2017-6820)" onclick="javascript:window.open('https://www.ichunqiu.com/course/58303')">Roundcube邮件正文存储型XSS(CVE-2017-6820)</div>
																											<div class="favorate" course-data="58303" cou-data="Roundcube邮件正文存储型XSS(CVE-2017-6820)" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时4分钟">1课时4分钟</span></div>
																										<div class="comment">13029人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
																					<li class="courseonetd none">
																<div class="coursediv" align="center">	
										<div class="courseone" align="left">
											<div align="center" class="bgimg">
												<a class="courseImg" href="https://www.ichunqiu.com/course/58241" target="_blank">
													<img src="https://static2.ichunqiu.com/icq/resources/fileupload/course/1495102998647.jpg" alt="Django URL跳转漏洞(CVE-2017-7233)">
												</a>
																									<div class='follow' data-cid="58241" data-fav="0"></div>
																							</div>
											<div class="coursedesc" align="left">
												<div class="one">
													<div class="coursename" title="Django URL跳转漏洞(CVE-2017-7233)" onclick="javascript:window.open('https://www.ichunqiu.com/course/58241')">Django URL跳转漏洞(CVE-2017-7233)</div>
																											<div class="favorate" course-data="58241" cou-data="Django URL跳转漏洞(CVE-2017-7233)" data-favo="0" style="cursor: pointer;">免费</div>
																									</div>
												<div class="two">
																											<div class="producer"><span class="prostatus active"></span><span title="1课时5分钟">1课时5分钟</span></div>
																										<div class="comment">12561人学习</div>
												</div>
											</div>
										</div>
									</div>
								</li>
															</ul>
				<input type="hidden" value="all" id="direction">
				<input type="hidden" value="websecurity" id="classname">
				<input type="hidden" value="0" id="difficulty">
				<input type="hidden" value="0" id="isexp">
				<input type="hidden" value="0" id="orderby">
				<input type="hidden" value="2" id="sort">
				<input type="hidden" value="58" class="dataTotal">
				<div id="page" style="text-align:center;margin-bottom:30px;">
					<ul class='paginorange' style='margin: 10px 0px;'><li><a href='javascript:;'>首页</a></li><li class='active'><a href='javascript:;'>1</a></li><li><a href='https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-2'>2</a></li><li><a href='https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-3'>3</a></li><li><a href='https://www.ichunqiu.com/courses/all-websecurity-0-0-0-2-3'>末页</a></li><div class='paginmsg'>共<span>3</span>页，到第<input class='skipnum' type='text'>页<button class='pageskip'>确定</button></div></ul>				</div>
			</div>
		</div>
		<input type="hidden" class="mark" value="0">
		<input type="hidden" id="headeract" value="1">
	<link rel="stylesheet" href="https://static2.ichunqiu.com/icq/resources/css/common/footer.css?v=4a8452ef0301d6e60f6287df9f8bc711" type="text/css">
<link rel="stylesheet" href="https://static2.ichunqiu.com/icq/resources/css/common/loginReg.css" type="text/css">
<div class="footer">
    <div class="footerTop">
        <a href="javascript:;" class="weibo">
            <div class="weibo_box"></div>
        </a>
        <a href="javascript:;" class="weixin">
            <div class="weixin_box"></div>
        </a>
    </div>
    <div class="footercenWrap">
        <div class="footercen">
            <a href="https://www.ichunqiu.com/default/introduce" target="_blank">了解i春秋</a>
            <a href="https://www.ichunqiu.com/default/joinus" target="_blank">加入i春秋</a>
            <a href="https://www.ichunqiu.com/recruit" target="_blank">讲师招募</a>
            <a href="https://www.ichunqiu.com/src" target="_blank">有信众测</a>
            <a href="https://www.ichunqiu.com/xietongyuren" target="_blank">协同育人</a>
            <a href="https://www.ichunqiu.com/default/help" target="_blank">帮助中心</a>
            <a href="https://www.ichunqiu.com/default/disclaimer" target="_blank">免责声明</a>
            <a href="mailto:">邮箱：kefu@ichunqiu.com</a>
            <span>QQ群：129821314、451217067、262108018</span>
        </div>
    </div>
    <p style="line-height: normal;padding-top: 20px;padding-bottom: 5px;">
        <span>版权所有</span>
        <span>北京五一嘉峪科技有限公司</span>
    </p>
    <p style="line-height: normal; border: none;padding-bottom: 5px;">
        <span style="margin: 0;">地址:</span>
        <span>海淀区中关村软件广场C座</span>
    </p>
    <p style="border: none;line-height: normal;">
        <span>京ICP证150695号</span>
        <span>京ICP备15029557号</span>
        <span>京公网安备11010802017937号</span>
    </p>
</div>
<div id="loginReg"></div>
<div style="display: none;">
    <!--友盟统计代码-->
    <script src="https://s13.cnzz.com/z_stat.php?id=1262179648&web_id=1262179648" language="JavaScript"></script>
</div>
<script>
    var base_url = 'https://www.ichunqiu.com/';
    var resource_url = 'https://static2.ichunqiu.com/icq/';
    var exam_url = 'https://www.ichunqiu.com/';
    var user_site_url = 'https://user.ichunqiu.com/';
    var bbs_site_url = 'https://bbs.ichunqiu.com/';
    var qad_url = "https://www.ichunqiu.com/qad/";
    var uid = '517339';
    var special = '&,%,>,<';
    var ut = '1';
    var yzmShow = '';
</script>
<!-- 插件js -->
<script language="JavaScript" type="text/javascript"
        src="https://static2.ichunqiu.com/icq/resources/js/plugin/jquery1.8.3.min.js"></script>
<script language="JavaScript" type="text/javascript"
        src="https://static2.ichunqiu.com/icq/resources/js/plugin/jQuery.ajax.js"></script>
<script type="text/javascript" src="https://static2.ichunqiu.com/icq/resources/js/plugin/bootstrap.min.js"></script>

<script src="https://static2.ichunqiu.com/icq/resources/js/plugin/jquery.validate.min.js"></script>
<script type="text/javascript"
        src="https://static2.ichunqiu.com/icq/resources/js/plugin/jquery.mCustomScrollbar.concat.min.js"></script>

<!-- 公共js -->
<script type="text/javascript"
        src="https://static2.ichunqiu.com/icq/resources/js/common/component.js?v=20170725"></script>
<!-- 加密js -->
<script type="text/javascript" src="https://static2.ichunqiu.com/icq/resources/js/plugin/mix.js"></script>
<!-- 注册登录 -->
<script src="https://static2.ichunqiu.com/icq/resources/js/common/loginReg.js?v=20170927"></script>

<!-- 头部js -->
<script src="https://static2.ichunqiu.com/icq/resources/js/common/header.js"></script>

<!--企安殿4.0新用户登陆js-->
<script src="https://static2.ichunqiu.com/icq/resources/js/company/qad/qadfyd.js"></script>
<!--腾讯统计-->
<script type="text/javascript" src="https://tajs.qq.com/stats?sId=62520791" charset="UTF-8"></script>
<!--百度统计-->
<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?2d0601bd28de7d49818249cf35d95943";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
<!--百度自动推送代码-->
<script>

(function(){
	if(window.location.host == "www.ichunqiu.com"){
		var bp = document.createElement('script');

	    var curProtocol = window.location.protocol.split(':')[0];
	
	    if (curProtocol === 'https') {
	
	        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';        
	
	    }
	
	    else {
	
	        bp.src = 'http://push.zhanzhang.baidu.com/push.js';
	
	    }
	
	    var s = document.getElementsByTagName("script")[0];
	
	    s.parentNode.insertBefore(bp, s);

	}
})();

</script>
<script type="text/javascript">
<!--
	$(function(){
		//判断企安殿用户接口
		$('.qiandian').empty();
		$.post(base_url+'company/qad/iscompany', {}, function(user){
			if(user){
				if(user.status != 2 && user.status != 3 && user.status != 5){
					$('.qiandian').append('<i class="ficon qads"></i><a href="javascript:;" onclick="enterqiandian()" class="enterqadfont">进入企安殿</a>');
				}
			}
		}, 'json');		
		//判断培训机构助教接口
		$('.pxzhujiao').empty();
		$.post(base_url+'train/Common/ajaxTrainUser', {}, function(data){
			if(data.status == 1){
				if(data.data.UserType == 1){
					$('.pxzhujiao').append('<i class="ficon zjs"></i><a href='+data.data.Url+'>进入助教后台</a>');
				}
			}else{
				
			}
		}, 'json');		
	});

    function enterqiandian() {
        $.post(base_url + 'company/qad/iscompany', {}, function (user) {
            if (user) {
                if (user.status == 2) {
                    ShowLoginDialog();
                } else if (user.status == 4 || user.status == 5) {
                    FailureDialog(user.msg);
                } else {
                    window.location.href = user.url;
                }
            }
        }, 'json');
    }
    //-->
</script>
</body>
<script type="text/javascript" src="https://static2.ichunqiu.com/icq/resources/js/courses/index.js"></script>
</html>

'''

title = re.findall(r'<div class="coursename" title="(.*?)" onclick',html)
print title