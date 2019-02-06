package com.cg.eis.beans;
import com.cg.eis.exception.EmployeeException;

	public class Employee {

		private String name;
		private double salary;
		private String id;
		private String Designation;
		public String InsuranceScheme;

		public Employee(String string, double i, String string2, String string3) {
			name = string;
			salary = i;
			Designation = string3;
			id = string2;
			InsuranceScheme = getInsuranceScheme(salary);
		}

		private String getInsuranceScheme(double sal) {
			String s = "";
			if (sal >= 40000) {
				s = "Scheme A";
			} else if (sal >= 20000 && sal <= 40000) {
				s = "Scheme B";
			} else if (sal >= 5000 && sal < 20000) {
				s = "Scheme C";
			} else if (sal < 5000) {
				s = "No Valid Scheme ";
			}

			if (sal < 3000) {
				try {
					throw new EmployeeException("Exception");
				} catch (EmployeeException exe) {
					// System.out.println("catch block");
					System.out.println(exe.getMessage());
				}

			}
			return s;

			// Write your code here
			// should return the schemes as scheme a, scheme b, scheme c, no scheme
			// , null or raise an exception.

		}

		public String getEmployeeDetails() {
			// Write your code here
			// Should return a String in the below format
			return " Name: " + name + "\n" + " Id: " + id  + "\n" + " Salary: " + salary
					+ "\n" + " Designation: " + Designation + "\n" + " InsuranceScheme: "
					+ InsuranceScheme;
			// Name: name Id: id Salary: salary Designation: Designation
			// InsuranceScheme: InsuranceScheme
		}
	}

