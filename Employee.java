package com;

public class Employee {
	
	String name;
	double Salary;
	
	public Employee(String name,double Salary)
	{
		this.name = name;
		this.Salary = Salary;
		
	}
	@Override
	public String toString()
	{
		return "name  "+name+"   Salary: "+Salary;	

		
	}
	

}
