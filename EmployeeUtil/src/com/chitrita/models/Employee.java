package com.chitrita.models;

public abstract class Employee implements Emp{
	private long regno;
	private String ename;
	private double basic;
	
	private static int empCount;
	static {
		empCount = 1000;
	}
	public static int getEmpCounter() {
		return empCount - 1000;
	}
	
	// Constructors
	public Employee() {
		super();
		this.regno = ++empCount;
	}
	public Employee(String ename, double basic) {
		super();
		this.regno = ++empCount;
		this.ename = ename;
		this.basic = basic;
	}
	
	// Getters and Setters
	public long getRegno() {
		return regno;
	}
//	public void setRegno(long regno) {
//		this.regno = regno;
//	}
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
