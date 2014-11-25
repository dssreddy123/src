package com.as.Client;

//import java.text.SimpleDateFormat;
import java.text.NumberFormat;

public class Product {
	private String code;
	private String description;
	private double price;

protected static int count=0;//a protected static variable
// get and set accessors for the code, description, and price
//instance variables

public Product(){
	code= "";
	description="";
	price=0;
}
public String toString() {//override the toString method
String message = "Code:       " + code + "\n" 
                 + "Description:      " + description + "\n"
                 + "Price:            " + this.getFormattedPrice() + "\n";

return message;

}
public String getFormattedPrice(){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	return currency.format(price);
	
}
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

public static int getCount() {
	return count;
}
public static void setCount(int count) {
	Product.count = count;
}
public static int getCont()
{
	return count;
}
	

}
