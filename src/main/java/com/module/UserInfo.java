package com.module;

public class UserInfo {
	private String firstName;
	private String lastName;
	private String empId;
	public UserInfo() {
		
	}
	public UserInfo(String firstName, String lastName, String empId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
	

}
