package com.cg.eis.service;

public interface EmpService {

	public static String INSURANCE_SCHEME_A="Scheme A";
	public static String INSURANCE_SCHEME_B="Scheme B";
	public static String INSURANCE_SCHEME_C="Scheme C";
	public static String NO_INSURANCE_SCHEME="No Scheme";
	
	public String findInsuranceScheme(int emp_id);
	public String getEmployeeDetails(int emp_id,String emp_name,double salary,int desig);
	public String setInsuranceScheme(int emp_id);
	public String displayEmployeeDetails(int emp_id);

}
