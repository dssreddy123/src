package com.as.util;

public class EmployeeSalaryCal{
	double hra;
	double bonus;
	double TotalValue;
	//Employee e=new Employee();
	public  double getHracal(Employee e){
		
		
		if (e.getBasic()>=10000 && e.getBasic()<=15000 ){
			
			hra=(e.getBasic()*5)/100;
			
		}
		else if(e.getBasic()>15000 ){
			hra=(e.getBasic()*6)/100;
			
		}
		else {
			
			hra=(e.getBasic()*1)/100;
			
		}
		return hra;
	}
		
	public double getBonusCal(Employee e)
	{
		
		if (e.getState().equalsIgnoreCase("CA")){
			bonus = 5000;
		}
		else if (e.getState().equalsIgnoreCase("AZ")){
			bonus = 6000;
		}
		else{
			bonus = 2000;
		}
			
		return bonus;
	}
		
	public double getTotalValue(Employee e)
	{
		TotalValue=e.getBasic()+hra+bonus;
		return TotalValue;
			
		
	}	
	
}
	

	

