package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.exceptions.InvalidInsuranceSchemeException;
import com.cg.eis.service.EmpServiceImpl;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static EmpServiceImpl service = new EmpServiceImpl();
	public static void main(String[] args) {
		showMenu();
	}
	
	private static void showMenu() {
		int ch;
		System.out.println("______________Welcome to Employee Insurance Scheme_____________\n");
		while(true) {
			System.out.println("1.Insert Employee Data");
			System.out.println("2.Find Insurance Scheme");
			System.out.println("3.Set your Insurance Scheme");
			System.out.println("4.Show Your Details");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:insertEmployeeData();
			       break;
			case 2:findInsuranceScheme();
		           break;
			case 3:setInsuranceScheme();
			       break;
			case 4:showDetails();
			       break;
			case 5:System.exit(0);
			       break;
			default:System.out.println("_________You entered a wrong choice !!_________");
			
			}
		}
	}

	private static void insertEmployeeData() {
		System.out.print("Enter Employee ID : ");
		int emp_id = sc.nextInt();
		System.out.print("Enter Employee Name : ");
		String emp_name = sc.next();
		System.out.print("Enter Salary : ");
		double salary = sc.nextDouble();
		System.out.println("1.SYSTEM ASSOCIATE\n2.PROGRAMMER\n3.MANAGER\n4.CLERK");
		System.out.print("Enter your Designation : ");
		int desig = sc.nextInt();
		System.out.println(service.getEmployeeDetails(emp_id,emp_name,salary,desig));
		
	}

	private static void findInsuranceScheme() {
		System.out.print("Enter Employee ID : ");
		int employeeID = sc.nextInt();
		try {
			System.out.println(service.findInsuranceScheme(employeeID));
		} catch (InvalidInsuranceSchemeException e) {
			System.out.println(e.getMessage());;
		}
	}

	private static void setInsuranceScheme() {
		System.out.print("Enter your employee id : ");
		int employeeID = sc.nextInt();
		try {
			System.out.println(service.setInsuranceScheme(employeeID));
		} catch (InvalidInsuranceSchemeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void showDetails() {
		System.out.print("Enter your employee id : ");
		int employeeID = sc.nextInt();
		System.out.println(service.displayEmployeeDetails(employeeID));
		
	}


}