package com.as.Client;
import java.util.Scanner;
public class IsInteger {
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
String choice="y";
while(choice.equalsIgnoreCase("y")){
System.out.println(" Enter Number");
number = sc.nextInt();
if( number>=0 ){
	System.out.println("The Number is: "+ number  + " and it is Integer " );
	System.out.println("continue y/n");
	choice=sc.next();
}
else{
	System.out.println("The Number is not an Integer: " );
	}
}
}
}

