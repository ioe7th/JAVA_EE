<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">

<meta charset="UTF-8">
<title>注册</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
<link href="<%=request.getContextPath()%>/css/dlstyle.css"
	rel="stylesheet" type="text/css">
<script
	src="<%=request.getContextPath()%>/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
<script
	src="<%=request.getContextPath()%>/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>

	<div class="login-boxtitle">
		<a href="home/demo.html"><img alt=""
			src="<%=request.getContextPath()%>/images/logobig.png" /></a>
	</div>

	<div class="res-banner">
		<div class="res-main">
			<div class="login-banner-bg">
				<span></span><img src="<%=request.getContextPath()%>/images/big.jpg" />
			</div>
			<div class="login-box">

				<div class="am-tabs" id="doc-my-tabs">
					<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
						<li class="am-active"><a href="">用户注册</a></li>
					</ul>

					<div class="am-tabs-bd">
						<div class="am-tab-panel am-active">
							<form method="post" action="doregister">
								<div class="user-realname">
									<label for="username"><i class="am-icon-user">&nbsp;</i></label>
									<input type="text" name="username" id="username"
										placeholder="请输入您的真实姓名">

								</div>
								<div class="user-nickname">
									<label for="nickname"><i class="am-icon-user">&nbsp;</i></label>
									<input type="text" name="nickname" id="nickname"
										placeholder="请输入您的昵称">

								</div>
								<div class="user-email">
									<label for="email"><i class="am-icon-envelope-o">&nbsp;</i></label>
									<input type="email" name="email" id="email"
										placeholder="请输入邮箱账号">
								</div>
								<div class="user-phone">
									<label for="phone"><i class="am-icon-phone ">&nbsp;</i></label>
									<input type="text" name="telphone" id="phone"
										placeholder="请输入手机号">
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock">&nbsp;</i></label>
									<input type="password" name="password" id="password"
										placeholder="设置密码">
								</div>

								<div class="am-cf">
									<input type="submit" name="" value="注册"
										class="am-btn am-btn-primary am-btn-sm am-fl">
								</div>
							</form>
							<hr>
						</div>

						<script>
									$(function() {
									    $('#doc-my-tabs').tabs();
									  })
								</script>

					</div>
				</div>

			</div>
		</div>

		<div class="footer ">
			<div class="footer-hd ">
				<p>
					<a href="# ">惜剑制作</a> <b>|</b> <a href="home.html">商城首页</a> <b>|</b>
					<a href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
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