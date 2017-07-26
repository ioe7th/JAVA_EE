package org.fkit.hrm.dao;

import static org.fkit.hrm.util.common.HM.BILLTABLE;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.hrm.dao.provider.BillDynaSqlProvider;
import org.fkit.hrm.domain.Bill;

public interface BillDao {
	//查询所有订单
		@Select("select * from "+BILLTABLE+" ")
	    List<Bill> selectAllBill();
	//动态修改管理员信息
		@SelectProvider(type=BillDynaSqlProvider.class,method="updateBill")
		   void update(Bill bill);
		  //根据bid 查询订单
		@Select("select * from "+BILLTABLE+" where bid=#{bid}")
		Bill selectById(Integer bid);
}
