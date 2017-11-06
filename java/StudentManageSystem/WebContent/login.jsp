<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<style type="text/css">
.form-sigin{
max-width:330px;
padding:15px;
margin:0 atuo;
}


body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,p,blockquote,th,td
	{
	margin: 0;
	padding: 0;
}

.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 100px auto 20px;
	background-color: darkgray;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 15px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}

h1 {
	color: #fff;
	background: #06b;
	padding: 10px;
	font-size: 200%;
	text-align: center;
}
.labelError{line-height: 9px; font-size: 10pt; color: #f40000; border: 1px #ffb8b8 solid; padding: 8px 8px 8px 35px; background: url(/StudentManagerWeb/images/error.png) no-repeat; background-color: #fef2f2;}
</style>
</head>
<body>
	<!-- <fieldset> -->
		<!-- <legend>用户登录</legend> -->
		<!-- <div style="margin-left:600px;height:300px">
		<form action="login" method="post" class="form-signin">
		<h2 class="form-signin-heading">欢迎登陆后台</h2>
			<p>
			用户名:<input name="username" class="form-control" />	
			</p>
			<p>
			密　码:<input type="password" name="password" class="form-control">
			</p>
			<p>
			<div style="margin-left:55px;">
			<select name="role" class="form-control">
			<option value=学生登录>学生登录</option>
			<option value=教师登录>教师登录</option>
			<option value=管理员登录>管理员登录</option>
			</select>
			</div>
			</p>
			<p>
			<div style="margin-left:100px;">
			<input type="reset" value="取消" class="btn btn-lg btn-primary btn-block">
			<input type="submit" value="登录" class="btn btn-lg btn-primary btn-block">
			</div>
			</p>
		</form>
		</div> -->
	<!-- </fieldset> -->	
	
	 <div >
  		
		<form  class="form-signin" action="login" method="post"  >
 
        <h2 class="form-signin-heading">欢迎登陆后台</h2>
       用户名： <input class="form-control" placeholder="User name" required="" autofocus="" type="text" name="username">
        <p></p>
      密　码  ：<input class="form-control" placeholder="Password" required="" type="password" name="password">
         <p></p>
        <div style="margin-left:70px;" class="form-control">
			<select name="role" class="form-control">
			<option value=学生登录>学生登录</option>
			<option value=教师登录>教师登录</option>
			<option value=管理员登录>管理员登录</option>
			</select>
			</div>
        <input type="submit" value="登录" class="btn btn-lg btn-primary btn-block">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="index.jsp"><button class="btn btn-lg btn-primary btn-block" type="submit">返回首页</button></a>
      </form>
     </div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
     <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
     <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/bootstrap.min.js"></script>
</body>
</html>
		
		
	
	</form>

</body>
</html>