<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<title>忘记密码</title>
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

				<h3 class="title">找回密码</h3>

				<div class="clear"></div>

				<div class="login-form">
					<form method="post" action="findpwd">
						<div class="user-name">
							<label for="user"><i class="am-icon-user">&nbsp;</i></label> <input
								type="text" name="username" value="" id="user" placeholder="用户名">
						</div>
						<div class="user-pass">
							<label for="password"><i class="am-icon-lock">&nbsp;</i></label>
							<input type="email" name="email" value="" id="password"
								placeholder="请输入你的163邮箱地址">
						</div>
				</div>

				<div class="login-links">

					<br />
				</div>
				<div class="am-cf">
					<input type="submit" name="" value="找回密码"
						class="am-btn am-btn-primary am-btn-sm">
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