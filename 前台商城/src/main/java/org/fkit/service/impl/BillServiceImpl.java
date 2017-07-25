package org.fkit.service.impl;

import org.fkit.domain.Bill;
import org.fkit.mapper.BillMapper;
import org.fkit.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("billService")
public class BillServiceImpl implements BillService {
	 @Autowired
	    private BillMapper billMapper;
	@Override
	public void insertBill(Integer pid, Long  pno, String pname, Integer shop_price, Integer count, double total,
			Integer uid, String state) {
		// TODO Auto-generated method stub
		 billMapper.insertbill(pid, pno, pname, shop_price, count, total, uid, state);
	}
	@Override
	public Bill selectnew() {
		// TODO Auto-generated method stub
		return billMapper.selectnew();
	}
	@Override
	public Bill selectBill(Long pno) {
		// TODO Auto-generated method stub
		return billMapper.selectBill(pno);
	}

}
