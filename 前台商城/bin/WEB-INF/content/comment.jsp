<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>发表评论</title>
<link rel="stylesheet"
	href="http://v3.bootcss.com/dist/css/bootstrap.min.css" />
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="css/personal.css" rel="stylesheet" type="text/css">
<link href="css/appstyle.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
</head>

<body>
	<!--头 -->
	<header> <article>
	<div class="mt-logo">
		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
					<div class="menu-hd">
						<a href="#" target="_top" class="h">亲，请登录</a> <a href="#"
							target="_top">免费注册</a>
					</div>
				</div>
			</ul>
			<ul class="message-r">
				<div class="topMessage home">
					<div class="menu-hd">
						<a href="#" target="_top" class="h">商城首页</a>
					</div>
				</div>
				<div class="topMessage my-shangcheng">
					<div class="menu-hd MyShangcheng">
						<a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a>
					</div>
				</div>
				<div class="topMessage mini-cart">
					<div class="menu-hd">
						<a id="mc-menu-hd" href="#" target="_top"><i
							class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong
							id="J_MiniCartNum" class="h">0</strong></a>
					</div>
				</div>
				<div class="topMessage favorite">
					<div class="menu-hd">
						<a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a>
					</div>
			</ul>
		</div>

		<!--悬浮搜索框-->

		<div class="nav white">
			<div class="logoBig">
				<li><img src="images/logobig.png" /></li>
			</div>

			<div class="search-bar pr">
				<a name="index_none_header_sysc" href="#"></a>
				<form>
					<input id="searchInput" name="index_none_header_sysc" type="text"
						placeholder="搜索" autocomplete="off"> <input
						id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
						type="submit">
				</form>
			</div>
		</div>

		<div class="clear"></div>
	</div>
	</div>
	</article> </header>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="#">首页</a></li>
				<li class="qc"><a href="#">闪购</a></li>
				<li class="qc"><a href="#">限时抢</a></li>
				<li class="qc"><a href="#">团购</a></li>
				<li class="qc last"><a href="#">大包装</a></li>
			</ul>
			<div class="nav-extra">
				<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i
					class="am-icon-angle-right" style="padding-left: 10px;"></i>
			</div>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="user-comment">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small>
						</div>
					</div>
					<hr />

					<div class="comment-main">

						<div>
							<table
								class="table table-bordered table-hover table-striped table-condensed">
								<tr>
									<td colspan='3'>
										<h2>订单评价</h2>
									</td>
								</tr>
								<tr>
									<th width="33%">评价项目</th>
									<th width="33%">星星</th>
									<th width="33%">分数</th>
								</tr>
								<tr class="tr">
									<td>物流速度</td>
									<td><span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span></td>
									<td class="score" id="tra"></td>
								</tr>
								<tr class="tr">
									<td>商品质量</td>
									<td><span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span></td>
									<td class="score" id="pro"></td>
								</tr>
								<tr class="tr">
									<td>卖家服务</td>
									<td><span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span> <span
										class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-star-empty"
										aria-hidden="true"></span></td>
									<td class="score" id="ser"></td>
								</tr>
								<tr>

									<td colspan="3" style="text-align: center;">
										<button type="button" class="btn btn-info"
											onclick="javascript:location.reload();">重选</button>
									</td>
								</tr>
							</table>
						</div>

						<script>  
        $(function(){  
            /**  
             * 整体思路:该评价案例主要分为两种情况，1、当某行的星星还没有被选中时，此时鼠标移到哪颗星星时，就显示该星星对应的文字提示，前面的星星包括自己都变成实心星，如果该行后面还有星星，那后面的依然是空心星，鼠标离开时文字提示消失，该行星星全部变回原来的空心星；2、当某行有星星被选中，即鼠标点中某颗星，该星星以及前面的星星都变成实心星，如果该行后面还有星星，则依然还是空心星，分数和文字内容显示在该行的后面一列。鼠标移到某颗星星时，还是显示该星星对应的文字提示，前面的星星包括自己依然变成实心星，如果该行后面还有星星，那后面的依然是空心星，鼠标离开时，继续显示原来选中时星星状态。如果重新选中星星，则此时是新的评分分数，新的星星状态了。   
            为所有的span标签绑定mouseout和mouseover事件。bind({事件名：function(){},事件名：function(){}})的方法绑定多个事件  
            */  
            var tip_text = '',$parent = {};  
            $(".glyphicon").bind({  
                mouseout: function () {  
                    $parent.children('.extra').remove();  
                    var score = $parent.siblings('.score').html();  
                    if(score){//有星星选中时  
                        $parent.children(":lt("+ parseInt(score) +")").removeClass('glyphicon-star-empty').addClass('glyphicon-star');//PS:此处应该加上parseInt进行整型转换，否则会没有效果  
                        $parent.children(":gt("+ eval(parseInt(score)-1) + ")").removeClass('glyphicon-star').addClass('glyphicon-star-empty');//PS:此处要记得加eval，进行js计算，不然会报“jquery.min.js:2 Uncaught Error: Syntax error, unrecognized expression: NaN)”的错误  
                    }else{  
                        $(this).prevAll().andSelf().removeClass('glyphicon-star').addClass('glyphicon-star-empty');  
                    }  
                },  
                mouseover: function () {  
                    $parent = $(this).parent();//把父节点存放起来  
                    var score = $parent.siblings('.score').html();  
                    $parent.append('<span class="extra dot-left"></span><span class="extra tip"></span>');//添加提示框  
                    tip_text = indexText($(this).index());//得到相应的文字提示  
                    $(this).siblings('.tip').html(tip_text);//显示文字提示  
                    $(this).prevAll().andSelf().removeClass('glyphicon-star-empty').addClass('glyphicon-star');  
                    if(score){//当有星星选中时，为了解决鼠标移到选中星星的的前面星星时的小bug，此时会出现前面星星鼠标滑动时，星星颜色不变化现象  
                        $(this).nextAll().not('.extra').removeClass('glyphicon-star').addClass('glyphicon-star-empty');     
                    }  
                },  
                click: function(){  
                    var score = $(this).index() + 1;  
                    $parent.siblings('.score').html(score+'(' + tip_text + ')');  
                    $(this).prevAll().andSelf().removeClass('glyphicon-star-empty').addClass('glyphicon-star');  
                }  
            });  
  
            $('.btn-success').click(function(){  
                var allScore = '';  
                $('.score').each(function(){  
                    var text = $(this).html();  
                    if(text == ''){  
                        alert('请完成每项的评分后再提交!');  
                        throw "请完成每项的评分后再提交!";//向浏览器抛出异常，终止程序运行，用了return false试了下，还是会继续执行下面的弹窗，这里用throw刚好恰到好处,如果想继续用return false则可以改成if...else...进行判断处理也可以。  
                        //return false;  
                    }  
                    allScore += $(this).siblings(":first").html() + ':' + text + '\n';  
                })  
                alert(allScore);  
            })  
        })  
  
        //封装文字提示函数  
        function indexText(i){  
            switch(i){  
                case 0:  
                    return 'Very dissatisfied';  
                case 1:  
                    return 'Dissatisfied';  
                case 2:  
                    return 'commonly';  
                case 3:  
                    return 'Satisfied';  
                case 4:  
                    return 'Very satisfied';  
            }  
        }  
    </script>
						<!-- 以上是评分 -->
						<div class="comment-list">
							<div class="item-pic">
								<a href="#" class="J_MakePoint"> <img
									src="images/comment.jpg_400x400.jpg" class="itempic">
								</a>
							</div>

							<div class="item-title">

								<div class="item-name">
									<a href="#">
										<p class="item-basic-info">${sessionScope.bill.pname}</p>
									</a>
								</div>
								<div class="item-info">
									<div class="info-little">
										<span>颜色：</span> <span>包装：</span>
									</div>
									<div class="item-price">
										价格：<strong>${sessionScope.bill.shop_price}</strong>
									</div>
								</div>
							</div>
							<div class="clear"></div>
							<div class="item-comment">

								<textarea id="comment" placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
							</div>
							<form action="upload" enctype="multipart/form-data" method="post">
								<div class="filePic">
									<input type="hidden" id="pno" name="pno"
										value="${sessionScope.bill.pno }"> <input type="file"
										name="file" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
									<input type="submit" value="上传" class="am-btn am-btn-danger">
									<img src="images/image.jpg" alt="">
								</div>
							</form>
							<div class="item-opinion"></div>
						</div>
						<div class="info-btn">
							<div class="am-btn am-btn-danger" onclick="view()">发表评论</div>
						</div>




						<script type="text/javascript">
						$(document).ready(function() {
							$(".comment-list .item-opinion li").click(function() {	
								$(this).prevAll().children('i').removeClass("active");
								$(this).nextAll().children('i').removeClass("active");
								$(this).children('i').addClass("active");
								
							});
				     })
				     
				     
				     function view(){
					        var tra=document.getElementById('tra').innerText;
					        var pro=document.getElementById('pro').innerText;
					        var ser=document.getElementById('ser').innerText;
					        var pno=document.getElementById("pno").value;
					        var comment =document.getElementById("comment").value;
						    //拼接url
						    var url = "doview?";
						    url += "pno="+pno+"&tra="+tra+"&pro="+pro+"&ser="+ser+"&comment="+comment;
						    //重新定位url
						    window.location = url;
						}
					</script>



					</div>

				</div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="#">恒望科技</a> <b>|</b> <a href="#">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">关于恒望</a> <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a
							href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
							- Collect from <a href="http://www.cssmoban.com/" title="网页模板"
							target="_blank">网页模板</a></em>
					</p>
				</div>
			</div>
		</div>

		<aside class="menu">
		<ul>
			<li class="person active"><a href="index.html"><i
					class="am-icon-user"></i>个人中心</a></li>
			<li class="person">
				<p>
					<i class="am-icon-newspaper-o"></i>个人资料
				</p>
				<ul>
					<li><a href="information.html">个人信息</a></li>
					<li><a href="safety.html">安全设置</a></li>
					<li><a href="address.html">地址管理</a></li>
					<li><a href="cardlist.html">快捷支付</a></li>
				</ul>
			</li>
			<li class="person">
				<p>
					<i class="am-icon-balance-scale"></i>我的交易
				</p>
				<ul>
					<li><a href="order.html">订单管理</a></li>
					<li><a href="change.html">退款售后</a></li>
					<li><a href="comment.html">评价商品</a></li>
				</ul>
			</li>
			<li class="person">
				<p>
					<i class="am-icon-dollar"></i>我的资产
				</p>
				<ul>
					<li><a href="points.html">我的积分</a></li>
					<li><a href="coupon.html">优惠券 </a></li>
					<li><a href="bonus.html">红包</a></li>
					<li><a href="walletlist.html">账户余额</a></li>
					<li><a href="bill.html">账单明细</a></li>
				</ul>
			</li>

			<li class="person">
				<p>
					<i class="am-icon-tags"></i>我的收藏
				</p>
				<ul>
					<li><a href="collection.html">收藏</a></li>
					<li><a href="foot.html">足迹</a></li>
				</ul>
			</li>

			<li class="person">
				<p>
					<i class="am-icon-qq"></i>在线客服
				</p>
				<ul>
					<li><a href="consultation.html">商品咨询</a></li>
					<li><a href="suggest.html">意见反馈</a></li>

					<li><a href="news.html">我的消息</a></li>
				</ul>
			</li>
		</ul>

		</aside>
	</div>

</body>

</html>