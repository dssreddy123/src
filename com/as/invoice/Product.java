package com.as.invoice;

import java.text.NumberFormat;

public class Product {

	//the instance variables
	private String code;
	private String description;
	private double price;
	//the constructor 
	public Product() {
		super();
		code="";
		description="";
		price=0;
	}
	//set and get accessors for the code variable
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFormattedPrice(){
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	
	
}
