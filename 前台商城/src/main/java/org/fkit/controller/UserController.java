package org.fkit.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/doregister")
	 public String  register(
			 String username,String nickname,String telphone,String email,String password,
			 Model model){
		  userService.register(username, nickname, telphone, email, password);
		    return "login";
	}
	
	@RequestMapping(value="/updatePassword")
	
	public ModelAndView update( String username,String latter,
			ModelAndView mv,
			HttpSession session){
		userService.changePassword(latter,username);
		mv.setViewName("password");
		return mv;
	}
	
	@RequestMapping(value="/dologin")
	 public ModelAndView login(
			 String username,String password,
			 ModelAndView mv,
			 HttpServletResponse response,
			 HttpSession session){
		    // 根据登录名和密码查找用户，判断用户登录
		 User user = userService.login(username, password);

		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			  session.setAttribute("user", user);
			  
			// 转发到main请求
			mv.setViewName("redirect:home");
		}else{
			mv.setViewName("login");
		}
		return mv;
	}

  //通过邮箱找回密码
@RequestMapping("/findpwd")
public ModelAndView findpassoword( String username, String email,
		HttpServletRequest request, HttpServletResponse response,
		HttpSession session) throws Exception {	
	response.setContentType("text/plain"); 
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

    String result=userService.findPwd(username, email);
	if(result!=null&&!result.equalsIgnoreCase("")&&!result.equalsIgnoreCase("null")){
		
		StringBuffer url = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		// 正文
		builder.append(
				"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
		url.append("<font color='red'>" + result + "</font>");
		builder.append("<br/><br/>");
		builder.append("<div>" + url + "</div>");
		builder.append("</body></html>");
		SimpleEmail sendemail = new SimpleEmail();
		sendemail.setHostName("smtp.163.com ");// 指定要使用的邮件服务器
		sendemail.setAuthentication("18852140185@163.com", "A2372518568");// 使用163的邮件服务器需提供在163已注册的用户名、密码
		sendemail.setCharset("UTF-8");
		try {
			sendemail.setCharset("UTF-8");
			sendemail.addTo(email);
			sendemail.setFrom("18852140185@163.com");
			sendemail.setSubject("找回密码");
			sendemail.setMsg(builder.toString());
			sendemail.send();
			System.out.println(builder.toString());
		} catch (EmailException e) {
			e.printStackTrace();
		}
		response.getWriter().println("你的密码为已结成功发送到邮箱");	
		
	}else{
		
		response.getWriter().println("获取密码失败");
	}
    return null;
}

	
	
}
