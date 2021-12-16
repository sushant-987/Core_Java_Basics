package com.java.company.assign;

  public class Address { // who defined this type  --> developer 

	private String name;
	private int id;
	private String State;
	private int pincode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<0){
			System.out.println("Invalid Id");
			}
		else{
		this.id = id;
	}
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		if(pincode<=99999 || pincode>999999){
			System.out.println("Invalid pincode");
		}
		else{
		
		this.pincode = pincode;
		
		
		
		}
	}
	
	

	@Override
	public String toString() {
		return "\n\t\t\t\t [name=" + name + ", id=" + id + ", State=" + State + ", pincode=" + pincode + "]";
	}

	public Address(String name, int id, String state, int pincode) {
		super();
		this.name = name;
		this.id = id;
		State = state;
		this.pincode = pincode;
	}
	public Address(){
		super();
	}

}
