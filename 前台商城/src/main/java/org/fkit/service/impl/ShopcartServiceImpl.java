package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.CartItem;
import org.fkit.mapper.ShopcartMapper;
import org.fkit.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("shopcartService")
public class ShopcartServiceImpl implements ShopcartService {
	 @Autowired
	    private   ShopcartMapper shopcartMapper;

	@Override
	public void insertById(Integer pid, String pname, Integer shop_price, Integer count, double subtotal, Integer uid,
			String image1) {
		shopcartMapper.addcartItem(pid, shop_price, pname, count, subtotal, uid, image1);
		
	}

	@Override
	public CartItem selectCart(Integer pid) {
		// TODO Auto-generated method stub
		return shopcartMapper.selectCart(pid);
	}

	@Override
	public void updateCount(Integer pid, Integer count,double subtotal) {
		// TODO Auto-generated method stub
		shopcartMapper.updateCount(count, pid,subtotal);
	}

	@Override
	public List<CartItem> selectcartitem(Integer uid) {
		// TODO Auto-generated method stub
	return shopcartMapper.selectCartitem(uid);
	}

	@Override
	public void remove(Integer pid,Integer uid) {
		// TODO Auto-generated method stub
		shopcartMapper.remove(pid,uid);
	}

}
