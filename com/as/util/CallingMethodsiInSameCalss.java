package com.as.util;

public class CallingMethodsiInSameCalss {
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		
	}
public static void printOne(){
	System.out.println("Helo World");
}
public static void printTwo(){
	printOne();
}
}

