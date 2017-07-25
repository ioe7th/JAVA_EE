package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.CartItem;

public interface ShopcartMapper {
	
    //根据pid进行筛选
		@Select("select * from tb_cartitem where pid=#{pid}")
	    CartItem selectCart(@Param("pid") Integer pid);
	//根据传的count，修改pid商品的数量
		@Update("update tb_cartitem set count = #{count} ,subtotal=#{subtotal} where pid=#{pid} ")
		void updateCount(@Param("count") Integer count,
				@Param("pid") Integer pid,
			    @Param("subtotal") double subtotal);
  //向购物车插入信息
 @Insert("insert into tb_cartItem(pid,pname,shop_price,count,subtotal,uid,image) values(#{pid},#{pname},#{shop_price},#{count},#{subtotal},#{uid},#{image1})")
	void addcartItem(@Param("pid") Integer pid,
	@Param("shop_price") Integer shop_price,
	@Param("pname") String pname,
	@Param("count") Integer count,
    @Param("subtotal") double subtotal,
    @Param("uid")Integer uid,
    @Param("image1")String image1);
 //根据uid 查询订单
	@Select("select * from tb_cartitem where uid=#{uid}")
	List<CartItem> selectCartitem(@Param("uid") Integer uid);
//根据pid,uid移除
	@Delete("delete from tb_cartitem where pid=#{pid} and uid=#{uid}")
	void remove(@Param("pid")Integer pid,
			@Param("uid")Integer uid);
	
	
	
	
}