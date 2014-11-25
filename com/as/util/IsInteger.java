package com.as.util;
import java.util.Scanner;

public class IsInteger {
public static void main(String[] args) {
	
	public boolean isInteger(String str)
	
	{

		try {
	        Integer.parseInt(str);
	        return true;
	    } 
	    
	    catch (NumberFormatException nfe) {}
	    return false;
	}
	
	
}
}
