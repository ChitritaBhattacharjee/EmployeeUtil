package com.chitrita.models;

import com.chitrita.exception.EmployeeRegnoException;

public abstract class Employee implements Emp{
	private long regno;
	private String ename;
	private double basic;
	
//	private static int empCount;
//	static {
//		empCount = 1000;
//	}
//	public static int getEmpCounter() {
//		return empCount - 1000;
//	}
	
	// Constructors
	public Employee() {
		super();
//		this.regno = ++empCount;
	}
	public Employee(long regno, String ename, double basic) {
		super();
//		this.regno = ++empCount;
		if(regno <= 0) {
			throw new EmployeeRegnoException(regno, "Invalid regno, should be > 0");
		}
		this.regno = regno;
		this.ename = ename;
		this.basic = basic;
	}
	
	// Getters and Setters
	public long getRegno() {
		return regno;
	}
	public void setRegno(long regno) {
		if(regno <= 0) {
			throw new EmployeeRegnoException(regno, "Invalid regno, should be > 0");
		}
		this.regno = regno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
}
