package com.cg.onlineshop.beans;

import java.util.Date;

public class Product {
	public int id;
	public String name;
	public int Price;
	public Date packagingDate;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
