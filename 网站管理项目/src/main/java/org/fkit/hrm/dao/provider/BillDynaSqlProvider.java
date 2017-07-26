package org.fkit.hrm.dao.provider;

import static org.fkit.hrm.util.common.HM.BILLTABLE;

import org.apache.ibatis.jdbc.SQL;
import org.fkit.hrm.domain.Bill;

public class BillDynaSqlProvider {
	//动态更新
	  public String updateBill(Bill bill){
			
			return new SQL(){
				{
					UPDATE(BILLTABLE);
					  if(bill.getPno()!=null){
			               SET("pno=#{pno}");
			        }
			     
			      if(bill.getPid()!=null){
			               SET("pid=#{pid}");
			        }
			      if(bill.getPname()!=null){
			               SET("pname=#{pname}");
			        }
			      if(bill.getCount()!=null){
		               SET("count=#{count}");
		        } if(bill.getPname()!=null){
		               SET("pname=#{pname}");
		        } if(bill.getShop_price()!=null){
		               SET("shop_price=#{shop_price}");
		        } if(bill.getUid()!=null){
		               SET("uid=#{uid}");
		        } if(bill.getState()!=null){
		               SET("state=#{state}");
		        }
	             WHERE ("bid=#{bid}");
			      }		      
			}.toString();
		}
}
