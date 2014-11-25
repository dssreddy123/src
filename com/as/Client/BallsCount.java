package com.as.Client;

public class BallsCount {
public static void main(String[] args) {
	
	System.out.println("Give Number of balls");
	int noOfBalls = (new Integer(args[0])).intValue();  
	System.out.println("No of balls: "+ noOfBalls);
	
	
	for(int i=0;i< args[i].length(); i++)
	{
		int weight = (new Integer(args[i])).intValue();
		System.out.println("weight of ball: " + weight);
	
	}
}
}
