package com.java.salary;

public class FullTimeSalary extends Employee{
	private  double baseSalary = 4000;
	private  double attendence = 3;
	private  double totalWorkingDays = 30;
	private double overtimePerDay = 25;

	public double getbaseSalary() {
		return baseSalary;
	}


	public void setbaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public double getAttendence() {
		return attendence;
	}


	public void setAttendence(double attendence) {
		
		this.attendence = attendence;
	}


	public double gettotalWorkingDays() {
		return totalWorkingDays;
	}


	public void settotalWorkingDays(double totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	
	public double getOvertimePerDay() {
		return overtimePerDay;
	}


	public void setOvertimePerDay(double overtimePerDay) {
		this.overtimePerDay = overtimePerDay;
	}

	@Override
		double calCulSalary() {
		if(attendence < totalWorkingDays) {
			baseSalary = (baseSalary / totalWorkingDays) * attendence;
			
		}else if(attendence > totalWorkingDays){
			
			 baseSalary+=(attendence - totalWorkingDays) * overtimePerDay;
		}
		return baseSalary;
	}


	

	
	
	
}