<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->   
<style type="text/css">
.form-sigin{
max-width:330px;
padding:15px;
margin:0 atuo;
}
</style>
  </head>
  
  <body>
  <div>
		<form class="form-signin" action="login" method="post" onSubmit="return check()" style="margin-left:600px">
 
        <h2 class="form-signin-heading">欢迎登陆</h2>
        <input class="form-control" placeholder="User name" required="" autofocus="" type="text">
        <p></p>
        <input class="form-control" placeholder="Password" required="" type="password">
         <p></p>
        <input class="form-control" placeholder="验证码" required="" type="password">
           <p></p>
        <label class="checkbox">
          <input value="remember-me" type="checkbox">管理员
          
        </label>
        <p></p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>
     </div><!-- /container -->
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
     <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
     <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/bootstrap.min.js"></script>
     
  </body>
</html>
