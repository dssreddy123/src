package com.as.invoice;

public class ProductDB {
	public static Product getProduct(String productCode){
		// Create the Product object
		Product p= new Product();
		//fill the product object with data
		p.setCode(productCode);
		if (productCode.equalsIgnoreCase("java"))
		{
			p.setDescription("Murach's Beginning Java 2");
			p.setPrice(49.50);
			
		}
		else if (productCode.equalsIgnoreCase("jsps"))
		{
			p.setDescription("Murach's Java Servelets and JSP");
			p.setPrice(49.50);
			
		} 	
		else if (productCode.equalsIgnoreCase("mcb2"))
		{
			p.setDescription("Murach's Mainframe COBOL");
			p.setPrice(59.50);
			
		} 	
		else{
			p.setDescription("unknown");
		}
		return p;
	}

}
