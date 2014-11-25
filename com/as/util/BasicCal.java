package com.as.util;

public class BasicCal {
	int i,j;
	BasicCal(int i, int j){
	this.i=i;
	this.j=j;
	int sum = i+j;
	int substract = i-j;
	int multiplication = i*j;
	int division= i/j;
	System.out.println("Sum of "+ i + " ," + j + " is : " + sum);
	System.out.println("Subsctract of "+ i + " ," + j + " is : " + substract);
	System.out.println("Multiplication of "+ i + " ," + j + " is : " + multiplication);
	System.out.println("Division of "+ i + " ," + j + " is : " + division);

	}
	
}

