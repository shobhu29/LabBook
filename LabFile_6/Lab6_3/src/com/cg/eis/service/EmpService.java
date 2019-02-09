package com.cg.eis.service;

import com.cg.eis.exceptions.InvalidInsuranceSchemeException;

public interface EmpService {

	public static String INSURANCE_SCHEME_A="Scheme A";
	public static String INSURANCE_SCHEME_B="Scheme B";
	public static String INSURANCE_SCHEME_C="Scheme C";
	public static String NO_INSURANCE_SCHEME="No Scheme";
	
	public String findInsuranceScheme(int employeeID) throws InvalidInsuranceSchemeException;
	public String getEmployeeDetails(int employeeID,String name,double salary,int deg);
	public String setInsuranceScheme(int employeeID) throws InvalidInsuranceSchemeException;
	public String displayEmployeeDetails(int employeeID);

}

