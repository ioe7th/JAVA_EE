package org.fkit.domain;

import java.io.Serializable;

public class CartItem implements Serializable{
	private Integer sid;
	private Integer pid;
	private Integer uid;
	private Integer shop_price;
	private String pname;
    private Integer  count;            // 购买某种商品数量
    private double subtotal;    // 购买某种商品小计
    private String image;

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		 return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
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
	public Integer getShop_price() {
		return shop_price;
	}
	public void setShop_price(Integer shop_price) {
		this.shop_price = shop_price;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String  image) {
		this.image = image;
	}
}
