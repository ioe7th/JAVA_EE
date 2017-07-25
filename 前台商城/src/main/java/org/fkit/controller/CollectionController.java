package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Collection;
import org.fkit.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectionController {
	@Autowired
	@Qualifier("collectionService")
	private CollectionService collectionservice;
	@RequestMapping(value="/collect")
	public ModelAndView collect(Integer pid,Integer shop_price,String pname,String image,Integer uid,ModelAndView mv,HttpSession session){
		Collection collection=collectionservice.SelectColect(pid,uid);
		if(collection!=null){
			System.out.println("------------------");	
		}else{
			collectionservice.InsertCollection(pid, shop_price, pname, uid, image);
		}
		List<Collection> collections=collectionservice.selectAllcollect(uid);
		session.setAttribute("collections",collections);
		mv.setViewName("collection");
		return mv;
	}
	@RequestMapping(value="/removecollect")
	public ModelAndView removecollect(Integer pid,Integer uid,ModelAndView mv,HttpSession session){
		collectionservice.removeCollection(uid, pid);
		List<Collection> collections=collectionservice.selectAllcollect(uid);
		session.setAttribute("collections",collections);
		mv.setViewName("collection");
		return mv;
	}
}
