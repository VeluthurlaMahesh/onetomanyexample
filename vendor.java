package com.mahesh.pojo;

import java.util.Set;

public class vendor 
{
	private int vid;
	private String vname;
	private Set customer;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Set getCustomer() {
		return customer;
	}
	public void setCustomer(Set customer) {
		this.customer = customer;
	}

}
