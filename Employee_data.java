package com.java.project.jan12;

import java.util.ArrayList;
import java.util.List;



public class Employee_data {
	public static void main(String[] args) {
		
		List<Employee> list = new  ArrayList();
		
		list.add(new Employee (1,"karan","Tester",55000));
		list.add(new Employee (2,"ram  ","Developer",8000));
		list.add(new Employee (3,"om   ","Tester",12000));
		list.add(new Employee (4,"sai  ","Developer",10000));
		list.add(new Employee (5,"aniket","Tester",7000));
		 
		//display the Employees
		System.out.println("\n\n All Employees :- ");
		for(Employee e : list) {
			e.display();
		}
		
		//display only testers
		System.out.println("\n\n Testers :- ");
		for(Employee e : list) {
			if(e.role.equalsIgnoreCase("Tester")) {
				e.display();
			}
		}
		
		//display only developers
		System.out.println("\n\n  Developers :-");
		for(Employee k : list) {
			if(k.role.equalsIgnoreCase("Developer")) {
				k.display();
			}
		}
		
		//If salary < 100 then 10% growth in the salary and above increments is 5%.
		System.out.println("\n\n Updated employees salary structure :- ");
		for(Employee f : list) {
			if(f.salary < 10000) {
				f.salary += (f.salary*10) /100;
				
				f.display();
			}else {
				f.salary += (f.salary*5)/100;
				f.display();
			}
		}
		
		//total salary employee
		int tsalary = 0;
		System.out.println("\n\n Total salary");
		for(Employee k : list) {
			
			tsalary += k.salary;
			
			
		}System.out.println("\n\n Total Employee salary :- "+tsalary);
		
	}

}
