package com.cg.eis.pl;

import com.cg.eis.beans.Employee;
import com.cg.eis.service.Service;

public class MainApp {
	public static void main(String[] args) {
		
	
	Service e=new Service();
	Employee e2=new Employee("Shobhit",12000,"0400","Analyst");
	int a = e.maxMedicalInsurance(e2);
	System.out.println(e2.getEmployeeDetails());
	
  }
}