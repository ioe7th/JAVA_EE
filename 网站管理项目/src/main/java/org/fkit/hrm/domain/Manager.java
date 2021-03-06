package org.fkit.hrm.domain;

import java.io.Serializable;
import java.util.Date;

public class Manager implements Serializable {
	   private Integer id;
	   private String  name;
	   
	   private String phone;
	 
	   private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", password=" + password + ",phone=" + phone +"]";
	}
}
