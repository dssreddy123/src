package com.as.invoice;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {
	//instance variables
	private ArrayList<LineItem> lineItems;
	// the constructor
	public Invoice()
	{
		lineItems = new ArrayList<LineItem>();
		
	}
//a method that adds a line item
	public void addItem(LineItem lineItem){
		this.lineItems.add(lineItem);
	}
// the get accessor for the lineItem collection
	public ArrayList<LineItem> getLineItems(){
		return lineItems;
	}
// a method gives invoice total value
	public double getInvoiceTotal()
	{
		double invoiceTotal=0;
		for (LineItem lineItem : this.lineItems) {
			invoiceTotal+=lineItem.getTotal();
			}
		return invoiceTotal;
		
	}
//a method that returns the invoice total in currency format
	public String getFormattedTotal(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getInvoiceTotal());
		
	}
	
	
}
