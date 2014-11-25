package com.as.util;

public class EmlployerClient{
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Syam", "Fremont",	"CA", 95001, "8978929726", "Manager", 12, "dssreddy@gmail.com",10000 );
		Employee e2= new Employee(2, "Ramesh","sanjose", "AZ", 95002, "8978929725", "Assist Manager", 24, "dssreddy123@gmail.com",17000);
		Employee e3= new Employee(3,"Rohini","Fremont","TX",93004,"98106376090","Director",36,"rohini@gmail.com",5000);

		EmployeeSalaryCal emp = new EmployeeSalaryCal();
		
		Employee empArray[]={e1,e2,e3};
		
			
		for (int i=0;i<empArray.length;i++){
			double hra1 = emp.getHracal(empArray[i]);
			double bonus1=emp.getBonusCal(empArray[i]);
			double totalSalary=emp.getTotalValue(empArray[i]);
			System.out.println(empArray[i].getEmpName() + " basic is:  " + empArray[i].getBasic() +
					" and HRA for his Basic is:  " + hra1 + " and Bonus for his State " + empArray[i].getState() + " is " + bonus1);
		
			System.out.println("Total Salary for " + empArray[i].getEmpName() + " is " + totalSalary );
		}
		
		
		
	}
	

}
