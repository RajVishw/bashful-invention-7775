package com.masai.model;

public class register {
	int rid;
	String name;
	String shopname;
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public register(int rid, String name, String shopname) {
		super();
		this.rid = rid;
		this.name = name;
		this.shopname = shopname;
	}
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("register [rid=");
		builder.append(rid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", shopname=");
		builder.append(shopname);
		builder.append("]");
		return builder.toString();
	} 
	
	
}
