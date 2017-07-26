package org.fkit.hrm.controller;

import java.util.List;


import org.fkit.hrm.domain.User;
import org.fkit.hrm.service.HrmService;
import org.fkit.hrm.util.tag.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	@Qualifier("hrmService")
	 private HrmService hrmService;
	/**
     *处理查询请求
     *@Param pageIndex请求的是第几页
     *@Param  Manager     模糊查询参数
     *@Param Model     model
     **/
    @RequestMapping(value="/user/selectUser")
  public String selectManager(Integer pageIndex,
		  @ModelAttribute User user,
        Model model ){
   PageModel pageModel =new PageModel();
    if(pageIndex!=null){
           pageModel.setPageIndex(pageIndex);
         }
       //查询用户信息
  List<User> users=hrmService.findAllUser();
  model.addAttribute("users",users);
  model.addAttribute("pageModel",pageModel);
  return "user/user";
       } 
    
    /**
     *处理修改用户请求
     *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行修改操作
     *@Param User 要修改的对象
     *@Param  ModelAndView MV
     **/
    @RequestMapping(value="/user/updateUser")
     public ModelAndView updateUser(
             String flag,@ModelAttribute User user,
              ModelAndView mv){
           if(flag.equals("1")){
              //根据ID查询用户
            User target=hrmService.findUserById(user.getId());
               // 设置model数据
              mv.addObject("user",target);
         
              //返回修改员工页面
               mv.setViewName("user/showUpdateUser");
               
             }else{
                //执行修改操作
                 hrmService.modifyUser(user);
                 System.out.println("运行到这里了");
               //设置客户端跳转到查询请求
                 mv.setViewName("redirect:/user/selectUser");
             }
              return mv;
         }
	

}
