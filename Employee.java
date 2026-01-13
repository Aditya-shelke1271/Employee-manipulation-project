package com.java.project.jan12;

public class Employee {
	
	int emp_id;
	String name;
	String role;
	int salary;
	
	
	public Employee(int empid, String name, String role, int salary){
		
		this.emp_id = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
		
	}
	
	public void display() {
		System.out.println(emp_id+"\t "+name +"\t "+role+"\t\t"+salary);
	}

}
