package com.chitrita;

import java.util.ArrayList;
import java.util.Scanner;

import com.chitrita.models.Clerk;
import com.chitrita.models.Employee;
import com.chitrita.models.Manager;
import com.chitrita.models.Salesman;

public class Main {

	public static void main(String[] args) {
//		Manager manager = new Manager("Chitrita",50000,10000,5000);
//		Clerk clerk = new Clerk("Arun",30000,500);
//		Salesman salesman = new Salesman("Tarun",20000,2000,1000);
//		
//		System.out.println(manager);
//		System.out.println(manager.computeSal());
//		System.out.println(clerk);
//		System.out.println(clerk.computeSal());
//		System.out.println(salesman);
//		System.out.println(salesman.computeSal());
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> eAl = new ArrayList<>();
		int ch = 0;
		String ename = null;
		double basic = 0.0;
		double carAllowance = 0.0;
		double ma = 0.0;
		do {
			System.out.println("1. for Manager");
			System.out.println("2. for Clerk");
			System.out.println("3. for Salesman");
			System.out.println("0. to Exit");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(sc.nextLine());
			switch(ch) {
				case 1: System.out.print("Enter employee name: ");
					ename = sc.nextLine();
					System.out.print("Enter basic amount: ");
					basic = Double.parseDouble(sc.nextLine());
					System.out.print("Enter car allowance: ");
					carAllowance = Double.parseDouble(sc.nextLine());
					System.out.print("Enter medical allowance: ");
					ma = Double.parseDouble(sc.nextLine());
					eAl.add(new Manager(ename, basic, carAllowance, ma));
					break;
				case 2: Clerk c = new Clerk();
					System.out.print("Enter employee name: ");
					c.setEname(sc.nextLine());
					System.out.print("Enter basic amount: ");
					c.setBasic(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter overtime amount: ");
					c.setOvertime(Double.parseDouble(sc.nextLine()));
					eAl.add(c);
					break;
				case 3: Salesman s = new Salesman();
					System.out.print("Enter employee name: ");
					s.setEname(sc.nextLine());
					System.out.print("Enter basic amount: ");
					s.setBasic(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter travelling allowance: ");
					s.setTa(Double.parseDouble(sc.nextLine()));
					System.out.print("Enter commission amount: ");
					s.setComm(Double.parseDouble(sc.nextLine()));
					eAl.add(s);
					break;
				case 0: System.out.println("Bye...");
					break;
				default: System.out.println("Invalid choice!!!");
			}
		} while(ch != 0);
		System.out.println("Employee details:");
		for(Employee e : eAl) {
			System.out.println(e);
			System.out.println("Employee salary"+e.computeSal());
		}
	}
}
