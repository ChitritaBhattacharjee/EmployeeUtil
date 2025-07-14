package com.chitrita.models;

public class Manager extends Employee{
	private double ma;
	private double carAllowance;
	
	// Constructors 
	public Manager() {
		super();
	}
	public Manager(String ename, double basic, double ma, double carAllowance) {
		super(ename, basic);
		this.ma = ma;
		this.carAllowance = carAllowance;
	}
	
	// Getters And Setters
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	public double getCarAllowance() {
		return carAllowance;
	}
	public void setCarAllowance(double carAllowance) {
		this.carAllowance = carAllowance;
	}
	
	@Override
	public double computeSal() {
		double gross = getBasic() + ma + carAllowance;
		return gross * ((100.00 - taxPer) / 100.0);
	}
	
	@Override
	public String toString() {
		return "Manager [Regno=" + getRegno() + ", Eployee name =" + getEname() + ", Basic = INR."	+ getBasic() + ", Medical Allowance= " + getMa() + ", Car Allowance= " + getCarAllowance() + "]";
	}
}
