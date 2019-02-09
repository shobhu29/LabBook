package com.cg.eis.service;
import com.cg.eis.beans.Employee;
import com.cg.eis.beans.Employee.Designation;
import com.cg.eis.exceptions.InvalidInsuranceSchemeException;;

public class EmpServiceImpl implements EmpService {

		private static Employee[] emp = new Employee[10];
		private static int counterEmp;
		
		private static Employee search(int employeeID) {
			for(int i=0;i<counterEmp;i++) {
				if(emp[i].getEmp_id()==employeeID) {
					return emp[i];
				}
			}
			return null;
		}
		
		@Override
		public String findInsuranceScheme(int emp_id) throws InvalidInsuranceSchemeException {
			Employee employee = search(emp_id);
			if(employee!=null) {
				if(employee.getSalary()>3000) {
					if((employee.getDesig().equals(Designation.System_Associate))&&(employee.getSalary()>=5000&&employee.getSalary()<20000)) {
						return INSURANCE_SCHEME_C;
					}
					else if((employee.getDesig().equals(Designation.Programmer))&&(employee.getSalary()>=20000&&employee.getSalary()<40000)) {
						return INSURANCE_SCHEME_B;
					}
					else if((employee.getDesig().equals(Designation.Manager))&&(employee.getSalary()>=40000)) {
						return INSURANCE_SCHEME_A;
					}
					else {
						return NO_INSURANCE_SCHEME;
					}
				}
				throw new InvalidInsuranceSchemeException();
			}
			return "You entered a wrong employee id.";
		}
		
		@Override
		public String getEmployeeDetails(int emp_id, String emp_name, double salary, int desig) {
			Designation designation = null;
			if(desig>=1&&desig<=4) {
				switch(desig) {
				case 1:designation = Designation.System_Associate;break;
				case 2:designation = Designation.Programmer;break;
				case 3:designation = Designation.Manager;break;
				case 4:designation = Designation.Clerk;break;
				}
				Employee employee = search(emp_id);
				if(employee==null) {
					emp[counterEmp] = new Employee(emp_id,emp_name,salary,designation,null);
					counterEmp++;
					return "Employee data added sucessfully.";
				}
				return "Your entered a invalid employee id.";
			}
			else {
				return "You enter the wrong designation\nPlease Try Again!!";
			}		
		}
		
		@Override
		public String displayEmployeeDetails(int employeeID) {
			Employee employee = search(employeeID);
			if(employee!=null) {
				return employee.toString();
			}
			return "You entered the wrong employee id.";
		}
		
		@Override
		public String setInsuranceScheme(int employeeID) throws InvalidInsuranceSchemeException {
			Employee employee = search(employeeID);
			if(employee!=null) {
				employee.setInsuScheme(findInsuranceScheme(employeeID));
				return "Your employee details updated.";
			}
			return "You entered the wrong employee id.";
	}
}
	
