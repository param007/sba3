package com.example.crud.model;

public class Customer {
	private int cid;
	private String cname;
	private String doj;
	private String city;
	private int contact;
	public Customer(int cid, String cname, String doj, String city, int contact) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.doj = doj;
		this.city = city;
		this.contact = contact;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
	

}
