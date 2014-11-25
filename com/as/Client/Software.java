package com.as.Client;

public class Software extends Product{
	private String version;
	public Software(){
		super();//call the constructor of Product superclass 
		version ="";
		count++;//update the count variable in the Product class
	}
public void setVersion(String version){
	this.version=version;
}
public String setVersion(){
	return version;
}
public String toString() {
String message = super.toString()+ "Vesrion:     " + version + "\n";

return message;
}
}
