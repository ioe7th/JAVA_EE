package org.fkit.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collection;

public interface CollectionMapper {
	//根据匹敌查询收藏夹
@Select("select * from tb_collection where pid=#{pid} and uid=#{uid}")
	Collection selectCollect(@Param("pid")Integer pid,
			@Param("uid")Integer uid);
	
	//插入收藏夹u
@Insert("insert into tb_collection(pid,shop_price,pname,uid,image) "
		+ "values(#{pid},#{shop_price},#{pname},#{uid},#{image})")
void insertCollection(@Param("pid")Integer pid,
		@Param("shop_price")Integer shop_price,
		@Param("pname")String  pname,
		@Param("uid")Integer uid,
		@Param("image")String image);
//遍历显示
@Select("select * from tb_collection where uid=#{uid}")
      List<Collection> selectAllCollect(@Param("uid")Integer uid);

//删除收藏
@Delete("delete from tb_collection where uid=#{uid} and pid=#{pid}")
   void removecollect(@Param("uid")Integer uid,
		   @Param("pid")Integer pid);
}
