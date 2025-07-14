package com.chitrita.models;

public class Salesman extends Employee {
	private double ta;
	private double comm;
	
	// Constructors
	public Salesman() {
		super();
	}
	public Salesman(String ename, double basic, double ta, double comm) {
		super(ename, basic);
		this.ta = ta;
		this.comm = comm;
	}
	
	// Getters and Setters
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	
	@Override
	public double computeSal() {
		double gross = getBasic() + ta + comm;
		return gross * ((100.00 - taxPer) / 100.0);
	}
	
	@Override
	public String toString() {
		return "Salesman [Regno=" + getRegno() + ", Eployee name =" + getEname() + ", Basic = INR." + getBasic() + ", ta=" + ta + ", comm=" + comm + "]";
	}
}
