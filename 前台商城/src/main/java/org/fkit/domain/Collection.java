package org.fkit.domain;

import java.io.Serializable;

public class Collection implements Serializable{
		private Integer cid;
		private Integer pid;
		private Integer uid; 
		private Integer shop_price;
	
		private String pname;
		private String image;
		public Integer getCid() {
			return cid;
		}
		public void setCid(Integer cid) {
			this.cid = cid;
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
	
		public Integer getShop_price() {
			return shop_price;
		}
		public void setShop_price(Integer shop_price) {
			this.shop_price = shop_price;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
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
		public void setImage(String image) {
			this.image = image;
		}
}
