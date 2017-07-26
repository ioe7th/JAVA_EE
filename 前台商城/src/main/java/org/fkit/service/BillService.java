package org.fkit.service;

import org.fkit.domain.Bill;

public interface BillService {
void insertBill(Integer pid, Long pno,String pname,
		Integer shop_price,Integer count,double total,Integer uid,String state,String image);
//倒序读取最新记录
Bill selectnew();
//选择,pno
Bill selectBill(Long pno);
}
