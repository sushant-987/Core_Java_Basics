package com.java.company.assign;

import java.util.Arrays;

//class 

// all properties -private
// business constraints -> getters/setters
// object initialization -> param constructors
// object representation -> tostring

//company -> regno,name,singleAddress,manydepts

public class Company {
	private String companyRegNo;
	private String companyName;
	// private String companyAddress;//[id,city,state,pincode]
	private Address companyAddress; // [id,city,state,pincode]
	private Dept[] departments; // array holds -> multiple hom dataelements

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Dept[] getDepartments() {
		return departments;
	}

	public void setDepartments(Dept[] departments) {
		this.departments = departments;
		
		
		
	}

	@Override
	public String toString() {
		return "Company [companyRegNo=" + companyRegNo + ", companyName=" + companyName + ", \n\t\tcompanyAddress="
				+ companyAddress + " ,\n\t\tdepartments=" +Arrays.toString(departments)+" ]";
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* 
	 * fields -> private -> business constraints --> getters/setters
	 * 
	 * object initialization ->constructor
	 * object representation -> tostring() method
	 * 
	 * constructor -> to initialize the objects
	 *  
	 * 
	 */

	public Company(String companyRegNo, String companyName, Address companyAddress, Dept[] departments) {
		super();
		this.companyRegNo = companyRegNo;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.departments = departments;
	}
	

	
	
}
