package com.nt.service;

import com.nt.model.Employee;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Override
	public String registerEmployee(Employee employee) {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()Modified");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return null;
	}

}
