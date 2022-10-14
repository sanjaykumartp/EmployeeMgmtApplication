package com.crud.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employeedetails.project.Employee;


public class CreateEmployee {

 
 public  void createEmployee() 
 {
  //Create student entity object
	 Employee employee = new Employee();
	 employee.setEmpid(105);
	 employee.setName("vijay");
	 employee.setDeptno(50);
	 
	 employee.setDesignation("operator");
	 employee.setDateOfBirth("1998-sep-06");
	 employee.setSalary(25000);
  
	 Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory =cfg.buildSessionFactory(); 
  
	   Session session =factory.openSession();
	     session.save(employee);
	     
	     Transaction tx = session.beginTransaction();
	     tx.commit();
	     session.close();
	     System.out.println("Employee table created......");
		
  
 }
}