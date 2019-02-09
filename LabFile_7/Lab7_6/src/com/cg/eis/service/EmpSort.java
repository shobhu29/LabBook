package com.cg.eis.service;
import java.util.Comparator;
import com.cg.eis.beans.Employee;

public class EmpSort implements Comparator<Employee> {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			
			return (int) (emp1.getSalary()-emp2.getSalary());
	}
}
