package org.fkit.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Comment;
import org.fkit.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
	@Autowired
	@Qualifier("commentService")
	private  CommentService commentService;
	  @RequestMapping(value="/doview")
    public ModelAndView insertComment(String tra,String pro,String ser,
    		String comment,String pno,MultipartFile file,ModelAndView mv,HttpSession session) throws IllegalStateException, IOException{
		    String path=session.getServletContext().getRealPath("/images/");
			String filename=file.getOriginalFilename();
			File filepath=new File(path,filename);
			//判断路径是否存在
			if(!filepath.getParentFile().exists()){
				filepath.getParentFile().mkdirs();
			}
			//将图片保存到这个文件里面
			file.transferTo(new File(path + File.separator +filename));
    	commentService.insertComment(tra, pro, ser, comment,filename, pno);
		//便利查询所有的评价，输出显示
    	List<Comment> comments=commentService.SelectALL();
    	session.setAttribute("comments", comments);
		  mv.setViewName("list");
		  return mv;
    }
}

