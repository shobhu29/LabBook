package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.beans.Employee;
import com.cg.eis.service.EmpServiceImpl;

	public class Main {

		public static Scanner sc = new Scanner(System.in);
		public static EmpServiceImpl service = new EmpServiceImpl();
		public static void main(String[] args) {
			showMenu();
		}
		
		private static void showMenu() {
			int ch;
			System.out.println("Welcome to my Employee Insurance Scheme");
			while(true) {
				System.out.println("________________________________________\n");
				System.out.println("1.Insert Employee Data");
				System.out.println("2.Find Insurance Scheme");
				System.out.println("3.Set Your Insurance Scheme");
				System.out.println("4.Show Your Details");
				System.out.println("5.Show employee based on Insurance Scheme");
				System.out.println("6.Delete Employee Data");
				System.out.println("7.Exit");
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
				case 5:showEmployees();
				       break;
				case 6:deleteEmployee();
				       break;
				case 7:System.exit(0);
				       break;
				default:System.out.println("_________You entered a wrong choice !!________");
				
				}
			}
		}

		private static void insertEmployeeData() {
			System.out.print("Enter Employee ID : ");
			int emp_id = sc.nextInt();
			System.out.print("Enter Employee Name : ");
			String emp_name = sc.next();
			System.out.print("Enter Employee Salary : ");
			double salary = sc.nextDouble();
			System.out.println("1.SYSTEM ASSOCIATE\n2.PROGRAMMER\n3.MANAGER\n4.CLERK");
			System.out.print("Enter your Designation : ");
			int deg = sc.nextInt();
			System.out.println(service.getEmployeeDetails(emp_id,emp_name,salary,deg));
			
		}

		private static void findInsuranceScheme() {
			System.out.print("Enter your employee id : ");
			int emp_id = sc.nextInt();
			System.out.println(service.findInsuranceScheme(emp_id));
			
		}

		private static void setInsuranceScheme() {
			System.out.print("Enter your employee id : ");
			int emp_id = sc.nextInt();
			System.out.println(service.setInsuranceScheme(emp_id));
			
		}

		private static void showDetails() {
			System.out.print("Enter your employee id : ");
			int emp_id = sc.nextInt();
			System.out.println(service.displayEmployeeDetails(emp_id));
			
		}
		
		private static void showEmployees() {
			System.out.println("A.Scheme A\nB.Scheme B\nC.Scheme C\nN.No Scheme");
			System.out.print("Enter scheme : ");
			char scheme = Character.toUpperCase(sc.next().charAt(0));
			for(Employee e:service.showEmployees(scheme)) {
				System.out.println("___________________________________________________");
				System.out.println(e);
			}
		}
		
		private static void deleteEmployee() {
			System.out.print("Enter your employee id : ");
			int emp_id = sc.nextInt();
			System.out.println(service.deleteEmployee(emp_id));
	}

}
