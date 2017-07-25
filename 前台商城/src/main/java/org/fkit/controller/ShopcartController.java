package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.CartItem;
import org.fkit.domain.Product;
import org.fkit.domain.User;
import org.fkit.service.ProductService;
import org.fkit.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopcartController {
	@Autowired
	@Qualifier("shopcartService")
	private ShopcartService shopcartService;
	
	
	//将商品加入购物车传值pid
	@RequestMapping(value="/insertcart")
	public ModelAndView insertCart(Integer pid,String pname,Integer shop_price,Integer count,Integer uid ,String image1,HttpSession session,ModelAndView mv){
//根据pid进行筛选
	CartItem cartitem=shopcartService.selectCart(pid);
	
System.out.println(cartitem);
	//判断数据库是否已经有了
	if(cartitem!=null){
			count +=cartitem.getCount();
		    double subtotal =count*shop_price;
		   shopcartService.updateCount(pid, count,subtotal);
         List<CartItem> cartItems=shopcartService.selectcartitem(uid);
		  session.setAttribute("cartItems", cartItems);
			mv.setViewName("shopcart");
		}else{
			double subtotal =count*shop_price;
		    shopcartService.insertById(pid, pname, shop_price, count, subtotal, uid, image1);
		    List<CartItem> cartItems=shopcartService.selectcartitem(uid);
		    session.setAttribute("cartItems", cartItems);
	       mv.setViewName("shopcart");
	}	
		return mv;
}
	//将商品从购车根据pid,uid移除
	
	@RequestMapping(value="/remove")
	 public ModelAndView remove(Integer pid,Integer uid, ModelAndView mv,HttpSession session){
		
		shopcartService.remove(pid,uid);
		List<CartItem> cartItems=shopcartService.selectcartitem(uid);
	    session.setAttribute("cartItems", cartItems);
		mv.setViewName("shopcart");
		return mv;
	}
	
}
