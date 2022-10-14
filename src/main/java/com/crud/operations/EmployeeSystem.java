package com.crud.operations;

import java.util.Scanner;

public class EmployeeSystem {

	public static void main(String[] args) {
		System.out.println("welcome to perform CRUD operations");
		System.out.println("-----------------------------------");
		System.out.println("enter your choice....");
		
		CreateEmployee check=new CreateEmployee();
		DeleteEmployee d1=new DeleteEmployee();
		UpdateEmployee u1=new UpdateEmployee();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1:Create Employee\n2:Delete Employee\n3:Update Employee");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				
				check.createEmployee();
				break;
			}
			case 2:
			{
				d1.deleteEmployee();
				break;
			}
			case 3:
			{
				u1.updateEmployee();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	}
