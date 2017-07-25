<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">
<meta charset="UTF-8">
<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/AmazeUI-2.4.2/assets/css/amazeui.css" />
<link href="<%=request.getContextPath()%>/css/dlstyle.css"
	rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.cookie.js"
	type="text/javascript"></script>

<script type="text/javascript">
$(document).ready(function(){
	if($.cookie("setUser")=="true"){
		$("#checkbox").attr("checked",true);
		$("#user").val($.cookie("username"));
		$("#password").val($.cookie("password"));
	}
});

function Save(){
	if($("#remember-me:checked").length==1){
		var str_username=$("#user").val();
		var str_password=$("#password").val();
		$.cookie("setUser","true",{expires:7});
		$.cookie("username",str_username,{expires:7});
		$.cookie("password",str_password,{expires:7});
	}else{
		$.cookie("setUser","false",{expires:-1});
		$.cookie("username","",{expires:-1});
		$.cookie("password","",{expires:-1});
	}
};
			
	</script>


</head>

<body>

	<div class="login-boxtitle">
		<a href="home.html"><img alt="logo"
			src="<%=request.getContextPath()%>/images/logobig.png" /></a>
	</div>

	<div class="login-banner">
		<div class="login-main">
			<div class="login-banner-bg">
				<span></span><img src="<%=request.getContextPath()%>/images/big.jpg" />
			</div>
			<div class="login-box">

				<h3 class="title">登录商城</h3>

				<div class="clear"></div>

				<div class="login-form">
					<form method="post" action="dologin">
						<div class="user-name">
							<label for="user"><i class="am-icon-user">&nbsp;</i></label> <input
								type="text" name="username" id="user" placeholder="用户名">
						</div>
						<div class="user-pass">
							<label for="password"><i class="am-icon-lock">&nbsp;</i></label>
							<input type="password" name="password" id="password"
								placeholder="请输入密码">
						</div>
				</div>

				<div class="login-links">
					<label for="remember-me"> <input id="remember-me"
						type="checkbox" value="y" name="isLogin">记住密码
					</label> <a href="forgetpwd">忘记密码 <a href="password"> 修改密码</a> <a
						href="register" class="zcnext  am-btn-default">注册</a> <br />
				</div>
				<div class="am-cf">
					<input type="submit" name="" value="登录" onclick="Save()"
						class="am-btn am-btn-primary am-btn-sm">
					<c:if test="${er!=null }">
						<c:out value="${er}" />
					</c:if>
				</div>
				</form>

				<div class="partner">

					<h3>合作账号</h3>
					<br>
					<div class="am-btn-group">
						<li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
						<li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span>
						</a></li>
						<li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span>
						</a></li>
					</div>
				</div>

			</div>
		</div>
	</div>


	<div class="footer ">
		<div class="footer-hd ">
			<p>
				<a href="# ">惜剑制作</a> <b>|</b> <a href="# ">商城首页</a> <b>|</b> <a
					href="# ">支付宝</a> <b>|</b> <a href="# ">物流</a>
			</p>
		</div>
		<div class="footer-bd">
			<p>
				<a href="# ">大河之水天上来</a> <a href="# ">奔流到海不复回</a>
			</p>
		</div>
	</div>
</body>

</html>