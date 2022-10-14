package com.operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employeedetails.project.Employee;

public class UpdatingData {

	 public  void updateEmployee()
	 {
	  Scanner scanner=new Scanner(System.in);
//	  
//	  System.out.println("enter the employee name...");
//	  String uname=scanner.next();
//	  
//	  Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//	   SessionFactory factory =cfg.buildSessionFactory(); 
//	  
//	  Session session=factory.openSession();
//	  session.beginTransaction();
//	  
//	  Employee e2=(Employee) session.get(Employee.class , 1);
//	  e2.setName(uname);
//	   
//	  System.out.println("employee updated......");
//	  session.getTransaction().commit();
		
		//em.updateEmployeeDetails();
		Configuration configuration3 = new Configuration();
		configuration3.configure("hibernate.cfg.xml");
		configuration3.addAnnotatedClass(Employee.class);

		//Creating Session Factory
		SessionFactory sessionFactory3 = configuration3.buildSessionFactory();

		//Initialize Session Object
		Session session3 = sessionFactory3.openSession();
		System.out.println("Enter Employee ID");
		int empId3 = scanner.nextInt();
		Employee emp3 = session3.get(Employee.class, empId3);
		System.out.println("1:Update name\n2:Update Designation\n3:Update Department Number\n4: Update Date of Birth\n5:Update Salary ");
		System.out.println("Enter the Choice");
		int choice3 = scanner.nextInt();
		if (choice3==1) {
			System.out.println("Enter Name");
			String name3 = scanner.next();
			emp3.setName(name3);
			System.out.println("Employee Name Updated Sucesfull");
		}else if (choice3==2) {
			System.out.println("Enter Designation");
			String designation3 = scanner.next();
			emp3.setDesignation(designation3);
			System.out.println("Employee Designation Updated Sucesfull");
		}else if (choice3==3) {
			System.out.println("Enter Department Number");
			int deptNo3 = scanner.nextInt();
			emp3.setDeptno(deptNo3);
			System.out.println("Department Number Updated Sucesfull");
//		}else if (choice3==4) {
//			System.out.println("Enter Date of Birth");
//			String dob3 = scan.next();
//			emp3.setDob(dob3);
//			System.out.println("Date of Birth Updated Sucesfull");
		}else if (choice3==5) {
			System.out.println("Enter Name");
			double salary3 = scanner.nextDouble();
			emp3.setSalary(salary3);
			System.out.println("Salary Updated Sucesfull");
		} else {
			System.out.println("Invalid Choice");
		}
		session3.beginTransaction();
		session3.saveOrUpdate(emp3);
		session3.getTransaction().commit();
}
	
}