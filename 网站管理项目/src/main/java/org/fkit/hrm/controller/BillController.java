package org.fkit.hrm.controller;

import java.util.List;

import org.fkit.hrm.domain.Bill;

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
public class BillController {
	@Autowired
	@Qualifier("hrmService")
	 private HrmService hrmService;
	 @RequestMapping(value="/bill/selectBill")
	  public String selectManager(Integer pageIndex,
			  @ModelAttribute Bill bill,
	        Model model ){
	   PageModel pageModel =new PageModel();
	    if(pageIndex!=null){
	           pageModel.setPageIndex(pageIndex);
	         }
	       //查询管理员信息
	  List<Bill> bills=hrmService.findAllBill();
	  model.addAttribute("bills",bills);
	  model.addAttribute("pageModel",pageModel);
	  return "bill/bill";
	       }
	 
	 /**
	     *处理修改管理员请求
	     *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行修改操作
	     *@Param Manager 要修改的对象
	     *@Param  ModelAndView MV
	     **/
	    @RequestMapping(value="/bill/updateBill")
	     public ModelAndView updateBill(
	             String flag,@ModelAttribute Bill bill,
	              ModelAndView mv){
	           if(flag.equals("1")){
	              //根据ID查询用户
	              Bill target=hrmService.findBillById(bill.getBid());
	       
	               // 设置model数据
	              mv.addObject("bill",target);
	              //返回修改订单页面
	             mv.setViewName("bill/showUpdateBill");
	             }else{
	                //执行修改操作
	                 hrmService.modifyBill(bill);
	               //设置客户端跳转到查询请求
	                 mv.setViewName("redirect:/bill/selectBill");
	             }
	              return mv;
	         }
}
