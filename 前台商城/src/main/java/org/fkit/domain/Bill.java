package org.fkit.domain;

import java.io.Serializable;

public class Bill implements Serializable{
  private Long pno;
  private Integer pid;
  private String pname;
  private Integer shop_price;
  private Integer count;
  private Integer total;
  private Integer uid;
  private String state;

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
public Integer getShop_price() {
	return shop_price;
}
public void setShop_price(Integer shop_price) {
	this.shop_price = shop_price;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public Long getPno() {
	return pno;
}
public void setPno(Long pno) {
	this.pno = pno;
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
