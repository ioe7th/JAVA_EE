package org.fkit.domain;

import java.io.Serializable;

public class Product implements Serializable {
 
  private Integer pid;
  private String pname;
  private Integer shop_price;
  private Integer inventory;
  private Integer saleamount;
  private String image1;
  private String image2;
  private String image3;
  public Product(){
	  super();
  }
  
public Integer getShop_price() {
	return shop_price;
}
public void setShop_price(Integer shop_price) {
	this.shop_price = shop_price;
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



public Integer getInventory() {
	return inventory;
}

public void setInventory(Integer inventory) {
	this.inventory = inventory;
}

public Integer getSaleamount() {
	return saleamount;
}

public void setSaleamount(Integer saleamount) {
	this.saleamount = saleamount;
}

public String getImage1() {
	return image1;
}

public void setImage1(String image1) {
	this.image1 = image1;
}

public String getImage2() {
	return image2;
}

public void setImage2(String image2) {
	this.image2 = image2;
}

public String getImage3() {
	return image3;
}

public void setImage3(String image3) {
	this.image3 = image3;
}
  
@Override
public String toString() {
	return "Manager [pid=" + pid + ", pname=" + pname + ", shop_price="
			+ shop_price + ", inventory=" + inventory + ", saleamount=" + saleamount
			+ ",image1=" + image1+",image2="+image2+",image3="+image3+ "]";
} 

}
 
