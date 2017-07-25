package org.fkit.controller;

import java.util.List;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Product;
import org.fkit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@Autowired
	@Qualifier("productService")
	 private ProductService productService;
	//遍历查询商品
	@RequestMapping(value="/home")
	public ModelAndView select(ModelAndView mv,HttpSession session){
        List<Product> products=productService.selectProducts();
        session.setAttribute("products", products);
		mv.setViewName("home");
	     return mv;
	}
	@RequestMapping(value="/detial")
	public ModelAndView showDetial( Integer pid ,ModelAndView mv,HttpSession session){
		
		    Product product=productService.selctProductbYId(pid);
		    session.setAttribute("product", product);
		mv.setViewName("detial");
	    return mv;
	}	
}
