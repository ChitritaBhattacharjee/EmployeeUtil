package com.chitrita.models;

public class Clerk extends Employee {
	private double overtime;
	
	// Constructors 
	public Clerk() {
		super();
	}
	public Clerk(long regno, String ename, double basic, double overtime) {
		super(regno, ename, basic);
		this.overtime = overtime;
	}
	
	// Getters And Setters
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
	@Override
	public double computeSal() {
		double gross = getBasic() + overtime;
		return gross * ((100.00 - taxPer) / 100.0);
	}

	@Override
	public String toString() {
		return "Clerk [Regno=" + getRegno() + ", Eployee name =" + getEname() + ", Basic = INR." + getBasic() + ", Overtime()= INR." + getOvertime() + "]";
	}
	
}
