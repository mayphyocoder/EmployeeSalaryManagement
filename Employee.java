package com.java.salary;

public abstract class Employee {

	public static void main(String[] args) {
		
		FullTimeSalary fulltimeSalary = new FullTimeSalary();
		
		System.out.println(fulltimeSalary.calCulSalary());
		
	}
	
	
	abstract double calCulSalary();
}
