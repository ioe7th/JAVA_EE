package org.fkit.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Bill;
import org.fkit.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BillController {
	@Autowired
	@Qualifier("billService")
	private BillService billservice;
	//点击购买生成订单
	@RequestMapping(value="/pay")
	  public ModelAndView buy(Integer pid,Integer count,String pname,
			  Integer shop_price,Integer uid,String image,HttpSession session, ModelAndView mv){
		double total  =count*shop_price;
	    Date d=new Date();
		Long pno=d.getTime();
		String state="unpaid";
	    billservice.insertBill(pid, pno, pname, shop_price, count, total, uid, state,image);
     //读取这个订单(倒序读取)
	     Bill bill=billservice.selectnew();
	     session.setAttribute("bill", bill);
	 // 跳转到订单页面
		mv.setViewName("pay");
		return mv;
	}
	
  @RequestMapping(value="/docomment")
  public ModelAndView selectBILLPNO(Long pno,HttpSession session, ModelAndView mv){   
	    Bill bill= billservice.selectBill(pno);
	    session.setAttribute("bill",bill);
	  mv.setViewName("comment");
      return mv;
  }
	
}
