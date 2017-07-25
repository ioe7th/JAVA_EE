package org.fkit.domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class Comment implements Serializable{
  private Integer cid;
  private String tra;
  private String pro;
  private String ser;
  private String comment;
  private String path;
  private String pno;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getTra() {
	return tra;
}
public void setTra(String tra) {
	this.tra = tra;
}
public String getPro() {
	return pro;
}
public void setPro(String pro) {
	this.pro = pro;
}
public String getSer() {
	return ser;
}
public void setSer(String ser) {
	this.ser = ser;
}

public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

public String getPno() {
	return pno;
}
public void setPno(String pno) {
	this.pno = pno;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
}
