package com.as.Client;
import java.util.Scanner;

public class BreakWhileLoop {
public static void main(String[] args) {
	int n;
	Scanner input=new Scanner(System.in);
	
	while(true){
		System.out.println("Enter the Number");
		n=input.nextInt();
		
	if(n==0)
	{
		break;
	}
	System.out.println("You entered number "+ n );
}
}
}
