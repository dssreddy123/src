package com.as.Client;
import java.util.Scanner;
import java.text.NumberFormat;

public class InvoiceApp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			//get input from the user
			System.out.println("Enter Sub Total:");
			double subTotal =sc.nextDouble();
			// calculate the results
			double discountPercent =0.0;
			
			if(subTotal>=1000){
				discountPercent = .1;
				}
			else {
				discountPercent = 0.0;
			}
			double discountAmount = subTotal *discountPercent;
			double totalBeforeTax= subTotal - discountAmount;
			double salesTax=totalBeforeTax*.05;
			double total = totalBeforeTax + salesTax;
			//format an the display results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			String message= "Discount Percent: " + percent.format(discountPercent) + "Discount Amount:  "  + currency.format(discountAmount)
							+ "Total Before Tax:   " + currency.format(totalBeforeTax)+ "Sales Tax:  " + currency.format(salesTax)
							+ "Invoice Total: " + currency.format(total);
			System.out.println(message);
			//See if the user wants continue
			System.out.println("Continue y/n:   ");
			choice = sc.next();
			System.out.println();
			
			
					
			}
				
			
		}
		
	}


