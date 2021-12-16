package com.java.company.assign;

import java.util.Arrays;

public class Dept {
	private int deptid; //public int getDeptId()->return 0
	private String deptName;
	private String deptCode;
	
	//getter retrieve  ->public string getDeptCode() --> null
	//setter set param -->public void setDeptCode(String params)
	
	private Employee[] employees;

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		if(deptid<100){
			System.out.println("Invalid dept id");
		}
		else{
		this.deptid = deptid;
	}
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int deptid, String deptName, String deptCode, Employee[] employees) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
		this.deptCode = deptCode;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\tDept [deptid=" + deptid + ", deptName=" + deptName + ", deptCode=" + deptCode + ", \n\t\t\temployees="+Arrays.toString(employees)+ "]\n\n";
	}
	

	
	
	

} 
