package com.operations;

import java.util.Scanner;

public class MainSource {

	public static void main(String[] args) {
		System.out.println("welcome to perform CRUD operations");
		System.out.println("-----------------------------------");
		System.out.println("enter your choice....");
		
		Scanner sc=new Scanner(System.in);
		
		Performing action=new Performing();
		UpdatingData act=new UpdatingData();
		
		while(true) {
			System.out.println("1:Add Employee\n2:Delete Employee\n3:view Employee\n4: Update Employee");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				
				action.addEmployee();
				break;
			}
			case 2:
			{
				action.deleteEmployee();
				break;
			}
			case 3:
			{
				action.viewEmployeeDetails();
				break;
			}
			case 4:
			{
				act.updateEmployee();
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
}
}}