package com.as.invoice;

public class Employee {
String keyName;
String valueName;

	public void generateOuput(String keyName, String valueName,String[] keys,String[] values){
		this.keyName=keyName;
		this.valueName=valueName;
		    			
	}
	public static void main(String[] args) {
		String[] keys={"1","2","3"};
		String[] values = {"Ram", "Raju", "Vijay"};
		for (int i=0; i<keys.length;i++){
			System.out.println("EmployeeId: " + keys[i] + " and " + "EmployeeName: " + values[i]);
		}
	}
}	

