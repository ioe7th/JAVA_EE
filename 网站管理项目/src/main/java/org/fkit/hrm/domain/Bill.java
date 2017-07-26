package org.fkit.hrm.domain;

import java.io.Serializable;

public class Bill  implements Serializable  {
      private Integer bid;
      private String pno;
      private Integer pid;
      private String pname;
      private Integer count;
      private Integer shop_price;
      private String  total;
      private Integer uid;
      private String state;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getShop_price() {
		return shop_price;
	}
	public void setShop_price(Integer shop_price) {
		this.shop_price = shop_price;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
}
