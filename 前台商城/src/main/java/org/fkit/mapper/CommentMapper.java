package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Comment;

public interface CommentMapper {
	//添加评论
@Insert("insert into tb_comment(tra,pro,ser,comment,path,pno)"
		+ "values(#{tra},#{pro},#{ser},#{comment},#{path},#{pno})")
   void insertcomment(@Param("tra")String tra,
		 @Param("pro")String pro,@Param("ser")String ser,
		 @Param("comment")String comment,
		 @Param("path")String path,
		 @Param("pno")String pno);
//便利所有评论
@Select("select * from tb_comment")
     List<Comment> selctAll();
   
}
