package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Product;

public interface ProductMapper {
	//输出所有商品
   @Select("select * from tb_product")
   List<Product> selctProducts();
   //根据pId输出商品
   @Select("select * from tb_product where pid=#{pid}")
   Product selectById(@Param("pid")Integer pid);
}
