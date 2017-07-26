package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Bill;

public interface BillMapper {
	//点击购买生成订单
	@Insert("insert into tb_bill(pid,pno,pname,shop_price,count,total,uid,state,image)"
			+ " values(#{pid},#{pno},#{pname},#{shop_price},#{count},#{total},#{uid},#{state},#{image} )")
    void insertbill(@Param("pid") Integer pid,
  		  @Param("pno")  Long pno,
  		  @Param("pname")String pname,
  		  @Param("shop_price")Integer shop_price,
  		  @Param("count") Integer count,
  		  @Param("total") double total,
  		  @Param("uid")Integer uid,
  		  @Param("state")String state,
  		@Param("image")String image);
//倒序读取最新记录
@Select("select * from tb_bill ORDER BY bid DESC LIMIT 0,1 ;")
  Bill selectnew();
//根据pno 搜索订单
@Select("select * from tb_bill where pno=#{pno}")
   Bill selectBill(@Param("pno") Long pno);
}
