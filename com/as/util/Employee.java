package com.as.util;

public class Employee {
	private int empNo; 
	private String empName; 
	private String address; 
	public String State; 
	private int zipCode; 
	private String phone; 
	private String designation;  
	private int experienceinYears; 
	private String emailAddress; 
	public double basic; 
	public double hra; 
	public double bonus;
	//(% of basic)
	public Employee(){
		
	}
	public Employee(int empNo, String empName, String address, String state,
			int zipCode, String phone, String designation,
			int experienceinYears, String emailAddress, int basic) {
		super();
		
		
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		State = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.designation = designation;
		this.experienceinYears = experienceinYears;
		this.emailAddress = emailAddress;
		this.basic=basic;
		
		
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperienceinYears() {
		return experienceinYears;
	}
	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	

}
