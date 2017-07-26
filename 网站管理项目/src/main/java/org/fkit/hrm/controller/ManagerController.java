package org.fkit.hrm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.hrm.domain.Manager;
import org.fkit.hrm.service.HrmService;
import org.fkit.hrm.util.common.HM;
import org.fkit.hrm.util.tag.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManagerController {
	/**
     *自动注入service层
     **/
@Autowired
@Qualifier("hrmService")
 private HrmService hrmService;
    /**
     *处理登录的请求
     *@Param  String name
     *@Param  String password
     *return 跳转的视图
     **/
 @RequestMapping(value="/dologin")
  public ModelAndView login(@RequestParam("name") String name,
    @RequestParam("password") String password,
         HttpSession session,ModelAndView mv ){
    //调用业务逻辑层判断管理员是否登成功
      Manager manager =hrmService.login(name,password);
      if(manager !=null){
         //将用户保存到session中
       session.setAttribute(HM.MANAGER_SESSION,manager);
        mv.setViewName("index");
      }else{
   mv.addObject("message","登录名或密错误！请重新输入");
     mv.setViewName("forward:/login");
       }
   return mv;
 }
    /**
     *处理查询请求
     *@Param pageIndex请求的是第几页
     *@Param  Manager     模糊查询参数
     *@Param Model     model
     **/
    @RequestMapping(value="/manager/selectManager")
  public String selectManager(Integer pageIndex,
		  @ModelAttribute Manager manager,
        Model model ){
    	System.out.println("manager = " + manager);
   PageModel pageModel =new PageModel();
    if(pageIndex!=null){
           pageModel.setPageIndex(pageIndex);
         }
       //查询管理员信息
  List<Manager> managers=hrmService.findManager(manager,pageModel);
  model.addAttribute("managers",managers);
  model.addAttribute("pageModel",pageModel);
  return "manager/manager";
       }
    /**
     *处理删除管理员请求
     *@Param  String ids  需要删除的字符串
     *@Param  ModelAndView MV
     **/
   @RequestMapping(value="/manager/moverManager")
   public ModelAndView removeManager(String ids,ModelAndView mv){
        //分解ID字符串
String[] idArray=ids.split(",");
for (String id :idArray){
     //根据ID删除管理员
      hrmService.removeManagerById(Integer.parseInt(id));
      }
   //设置客户端跳转到查询请求
     mv.setViewName("redirect:manager/selectManager");
    return mv;
    }
    /**
     *处理修改管理员请求
     *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行修改操作
     *@Param Manager 要修改的对象
     *@Param  ModelAndView MV
     **/
    @RequestMapping(value="/manager/updateManager")
     public ModelAndView updateManager(
             String flag,@ModelAttribute Manager manager,
              ModelAndView mv){
           if(flag.equals("1")){
              //根据ID查询用户
              Manager target=hrmService.findManagerById(manager.getId());
               // 设置model数据
              mv.addObject("manager",target);
         
              //返回修改员工页面
               mv.setViewName("manager/showUpdateManager");
               
             }else{
                //执行修改操作
                 hrmService.modifyManager(manager);
                 System.out.println("运行到这里了");
               //设置客户端跳转到查询请求
                 mv.setViewName("redirect:/manager/selectManager");
             }
              return mv;
         }
     /**
     *处理添加管理员请求
     *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行添加操作
     *@Param Manager 要修改的对象
     *@Param  ModelAndView MV
     **/           
@RequestMapping(value="/manager/addManager")
     public ModelAndView addManager(
             String flag,@ModelAttribute Manager manager,
              ModelAndView mv){
           if(flag.equals("1")){
              //设置跳转到添加页面
               mv.setViewName("manager/showAddManager");
             }else{
                //执行添加操作
                 hrmService.addManager(manager);
               //设置客户端跳转到查询请求
                 mv.setViewName("redirect:/manager/selectManager");
             }
              return mv;
         }
}


