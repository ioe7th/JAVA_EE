package org.fkit.hrm.controller;

import java.util.List;

import org.fkit.hrm.domain.Manager;
import org.fkit.hrm.domain.Product;
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
public class ProductController {
	@Autowired
	@Qualifier("hrmService")
	 private HrmService hrmService;
	 /**
     *处理查询请求
     *@Param pageIndex请求的是第几页
     *@Param  Product     模糊查询参数
     *@Param Model     model
     **/
    @RequestMapping(value="/product/selectProduct")
  public String selectManager(Integer pageIndex,
		  @ModelAttribute Product product,
        Model model ){
   PageModel pageModel =new PageModel();
    if(pageIndex!=null){
           pageModel.setPageIndex(pageIndex);
         }//查询商品信息
    List<Product> products=hrmService.findAllProduct();
    model.addAttribute("products",products);
    model.addAttribute("pageModel",pageModel);
    return "product/product";
         }
    
    /**
     *处理删除管理员请求
     *@Param  String pid  需要删除的字符串
     *@Param  ModelAndView MV
     **/
   @RequestMapping(value="/product/moverProduct")
   public ModelAndView removeProduct(String pid,ModelAndView mv){
     //根据ID删除商品
	  Integer pid1=Integer.parseInt(pid);
	  System.out.println(pid1);
	   hrmService.removeProductById(5);
   //设置客户端跳转到查询请求
     mv.setViewName("redirect:/product/selectProduct");
    return mv;
    }
    
   /**
    *处理修改商品请求
    *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行修改操作
    *@Param Product 要修改的对象
    *@Param  ModelAndView MV
    **/
   @RequestMapping(value="/product/updateProduct")
    public ModelAndView updateProduct(
            String flag,@ModelAttribute Product product,
             ModelAndView mv){
          if(flag.equals("1")){
             //根据pID查询商品
        	  Product  target=hrmService.findProductById(product.getPid());
              
        	  // 设置model数据
             mv.addObject("product",target);
             //返回修改商品页面
              mv.setViewName("product/showUpdateProduct");
            }else{
               //执行修改操作
                hrmService.modifyProduct(product);
              //设置客户端跳转到查询请求
                mv.setViewName("redirect:/product/selectProduct");
            }
             return mv;
        }
   
   /**
    *处理添加商品请求
    *@Param  String flag 标记:1.表示跳转到修改页面 2.表示执行添加操作
    *@Param Product 要修改的对象
    *@Param  ModelAndView MV
    **/           
@RequestMapping(value="/product/addProduct")
    public ModelAndView addProduct(
            String flag,@ModelAttribute Product product,
             ModelAndView mv){
          if(flag.equals("1")){
             //设置跳转到添加页面
              mv.setViewName("product/showAddProduct");
            }else{
               //执行添加操作
                hrmService.addProduct(product);
              //设置客户端跳转到查询请求
                mv.setViewName("redirect:/product/selectProduct");
            }
             return mv;
        }
    
    
}
