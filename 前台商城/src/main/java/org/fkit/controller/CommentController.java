package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Comment;
import org.fkit.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
	@Autowired
	@Qualifier("commentService")
	private  CommentService commentService;
	  @RequestMapping(value="/doview")
    public ModelAndView insertComment(String tra,String pro,String ser,
    		String comment,String pno,ModelAndView mv,HttpSession session){
    	commentService.insertComment(tra, pro, ser, comment, pno);
    	
		//便利查询所有的评价，输出显示
    	List<Comment> comments=commentService.SelectALL();
    	session.setAttribute("comments", comments);
		  mv.setViewName("list");
		  return mv;
    }
}
