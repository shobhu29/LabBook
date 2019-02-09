package com.cg.eis.beans;

public class Employee {

	public enum Designation{System_Associate,Programmer,Manager,Clerk};
	private int emp_id;
	private String emp_name;
	private double salary;
	private Designation desig;
	private String insuScheme;
	public Employee() {
		super();
	}
	public Employee(int emp_id, String emp_name, double salary,
			Designation desig, String insuScheme) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.desig = desig;
		this.insuScheme = insuScheme;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name
				+ ", salary=" + salary + ", desig=" + desig + ", insuScheme="
				+ insuScheme + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Designation getDesig() {
		return desig;
	}
	public void setDesig(Designation desig) {
		this.desig = desig;
	}
	public String getInsuScheme() {
		return insuScheme;
	}
	public void setInsuScheme(String insuScheme) {
		this.insuScheme = insuScheme;
	}
	
}
