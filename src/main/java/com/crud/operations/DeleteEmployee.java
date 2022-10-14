package com.crud.operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employeedetails.project.Employee;

public class DeleteEmployee {

	public  void deleteEmployee()
	 {
		Scanner sc=new Scanner(System.in);
//	  //Create session factory object
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//	   SessionFactory factory =cfg.buildSessionFactory(); 
//	 
//	  //getting session object from session factory
//	  Session session = factory.openSession();
//	  
//	  //getting transaction object from session object
//	  session.beginTransaction();
//	 
//	  Employee e = (Employee)session.load(Employee.class, 1);
//	  session.delete(e);
//	  
//	  System.out.println("Deleted Successfully");
//	  session.getTransaction().commit();
//	  factory.close();
		
		Configuration configuration4 = new Configuration();
		configuration4.configure("hibernate.cfg.xml");
		configuration4.addAnnotatedClass(Employee.class);

		//Creating Session Factory
		SessionFactory sessionFactory4 = configuration4.buildSessionFactory();

		//Initialize Session Object
		Session session4 = sessionFactory4.openSession();
		System.out.println("  column is deleted.. ...");
		int id4 = sc.nextInt();
		Employee emp4 = session4.get(Employee.class, id4);
		session4.delete(emp4);
		session4.beginTransaction();
		session4.getTransaction().commit();
		System.out.println("data will be deleted........");
}
}