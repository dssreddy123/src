package com.as.util;
import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println(" Give Fibonacci number u required");
	int fbn= sc.nextInt();
	
	for(int i=1; i<=fbn; i++){
		System.out.print(i +"\t");
	}
	
}
}
