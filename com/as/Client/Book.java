package com.as.Client;

public class Book extends Product {
	private String author;
	public Book(){
		super();//call the constructor of Product superclass 
		author ="";
		count++;//update the count variable in the Product class
	}
public void setAuthor(String author){
	this.author=author;
}
public String getAuthor(){
	return author;
}
public String toString() {
String message = super.toString()+ "Author:     " + author + "\n";

return message;
}
}