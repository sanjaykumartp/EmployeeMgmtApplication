package com.employeedetails.project;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainapplication {

	public static void main(String[] args) {
		
		System.out.println("Select 1 to update Employee table");
		System.out.println("Select 2 to update Department table");
		System.out.println("Please Enter your choice need to update ...");
		Scanner sc = new Scanner(System.in);
		
		int choice= sc.nextInt();
		
		switch (choice) {
		case 1:
			
			System.out.println("Select 1 to perform CRUD operations  Employee table");
			System.out.println(" Enter Employee id: ");
			int  empid =sc.nextInt();
			System.out.println(" Enter Employee Name ");
			String ename=sc.next();
			System.out.println(" Enter Employee Department Number: ");
			int  deptno =sc.nextInt();
			System.out.println(" Enter Employee Designation ");
			String designation=sc.next();
			System.out.println(" Enter Employee Date of Birth ");
			String dateOfBirth=sc.next();
			System.out.println(" Enter Employee salary: ");
	         double  salary =sc.nextDouble();
			
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
		   SessionFactory factory =cfg.buildSessionFactory(); 
		   
		   Employee e = new Employee();
		   e.setEmpid(empid);
		   e.setName(ename);
		   e.setDeptno(deptno);
		   e.setDesignation(designation);
		   e.setDateOfBirth(dateOfBirth);
		   e.setSalary(salary);

		   
		   
		   
		   Session session =factory.openSession();
		     session.save(e);
		     
		     Transaction tx = session.beginTransaction();
		     tx.commit();
		     session.close();
		     System.out.println("Employee table created......");
			
			
			
			break;
			
		
		case 2:
			System.out.println("Select 2 to perform CRUD operations on  Department table");
			System.out.println("1 Enter Department id: ");
			int deprtno =sc.nextInt();
			System.out.println(" Enter Department Name ");
			String dname=sc.next();
			System.out.println(" Enter Purpose");
			String purpose=sc.next();
			
			Configuration file = new Configuration();
			file.configure("hibernate.cfg.xml");
		   SessionFactory factories =file.buildSessionFactory(); 
		   
			Department detail=new Department();
			detail.setDeprtno(deprtno);
			detail.setDname(dname);
			detail.setPurpose(purpose);
			
			Session s1 =factories.openSession();
		     s1.save(detail);
		     
		     Transaction tnx = s1.beginTransaction();
		     tnx.commit();
		     s1.close();
		     System.out.println("Employee table created......");
		   
		     
		     
			break;

		default:System.out.println("Invalid Choice.....");
		        System.exit(0);
		        
			break;
		}

	}

}