package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	import com.cg.eis.beans.Employee;
import com.cg.eis.beans.Employee.Designation;

	public class EmpServiceImpl implements EmpService {

		private static HashMap<Integer,Employee> hmap = new HashMap<>();;
		
		private static Employee search(int employeeID) {
			for(Map.Entry<Integer,Employee> mapElement : hmap.entrySet()) {
				if(mapElement.getKey()==employeeID) {
					return mapElement.getValue();
				}
			}
			return null;
		}
		
		public String findInsuranceScheme(int emp_id) {
			Employee emp = search(emp_id);
			if(emp!=null) {
				if((emp.getDesig().equals(Designation.System_Associate))&&(emp.getSalary()>=5000&&emp.getSalary()<20000)) {
					return INSURANCE_SCHEME_C;
				}
				else if((emp.getDesig().equals(Designation.Programmer))&&(emp.getSalary()>=20000&&emp.getSalary()<40000)) {
					return INSURANCE_SCHEME_B;
				}
				else if((emp.getDesig().equals(Designation.Manager))&&(emp.getSalary()>=40000)) {
					return INSURANCE_SCHEME_A;
				}
				else {
					return NO_INSURANCE_SCHEME;
				}
			}
			return "You entered a wrong employee id.";
		}

		public String getEmployeeDetails(int emp_id, String emp_name, double salary, int desig) {
			Designation designation = null;
			if(desig>=1&&desig<=4) {
				switch(desig) {
				case 1:designation = Designation.System_Associate;
				break;
				case 2:designation = Designation.Programmer;
				break;
				case 3:designation = Designation.Manager;
				break;
				case 4:designation = Designation.Clerk;
				break;
				}
				Employee employee = search(emp_id);
				if(employee==null) {
					Employee e = new Employee(emp_id,emp_name,salary,designation,null);
					hmap.put(emp_id, e);
					return "Employee data added sucessfully.";
				}
				return "Your entered a invalid employee id.";
			}
			else {
				return "You enter the wrong designation\nPlease Try Again!!";
			}		
		}

		public String displayEmployeeDetails(int employeeID) {
			Employee employee = search(employeeID);
			if(employee!=null) {
				return employee.toString();
			}
			return "You entered the wrong employee id.";
		}
		
		public String setInsuranceScheme(int employeeID) {
			Employee employee = search(employeeID);
			if(employee!=null) {
				employee.setInsuScheme(findInsuranceScheme(employeeID));
				return "Your employee details updated.";
			}
			return "You entered the wrong employee id.";
		}

		public List<Employee> showEmployees(char scheme) {
			List<Employee> emp = new ArrayList<>();
			if(scheme=='A'||scheme=='B'||scheme=='C'||scheme=='N') {
				String schemes;
				if(scheme=='A')
					schemes=INSURANCE_SCHEME_A;
				else if(scheme=='B')
					schemes=INSURANCE_SCHEME_B;
				else if(scheme=='C')
					schemes=INSURANCE_SCHEME_C;
				else
					schemes=NO_INSURANCE_SCHEME;
				for(Map.Entry<Integer,Employee> mapElement : hmap.entrySet()) {
					if(mapElement.getValue().getInsuScheme().equals(schemes)) {
						emp.add(mapElement.getValue());
					}
				}
				return sortEmployee(emp);
			}
			return null;
		}

		public String deleteEmployee(int emp_id) {
			Employee emp = search(emp_id);
			if(emp!=null) {
				hmap.remove(emp_id);
				return "Your employee details deleted sucessfully.";
			}
			return "You entered the wrong employee id.";
		}
		
		public List<Employee> sortEmployee(List<Employee> emp) {
			Collections.sort(emp, new EmpSort());
			return emp;
		}

	}
