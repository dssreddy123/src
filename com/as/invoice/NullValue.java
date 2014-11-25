package com.as.invoice;

public class NullValue {
	public static void main(String[] args) {
		int i=5;
		int j=10;
		i+=j++;
		i--;
		
		System.out.println(i);
		System.out.println(j);
	}
}