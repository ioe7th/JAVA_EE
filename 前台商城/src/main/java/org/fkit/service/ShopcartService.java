package org.fkit.service;

import java.util.List;

import org.fkit.domain.CartItem;

public interface ShopcartService {
	
	//根据pid进行筛选
CartItem selectCart(Integer pid);
	//根据传的count，修改pid商品的数量
void updateCount(Integer pid,Integer count,double subtotal);
	//根据pid插入购物车
void insertById
(Integer pid,String pname,Integer shop_price,Integer count,double subtotal,Integer uid,String image1);
  //根据uid进行查询
  List<CartItem> selectcartitem(Integer uid);
  //移出购物车
  void remove(Integer pid,Integer uid);
}
