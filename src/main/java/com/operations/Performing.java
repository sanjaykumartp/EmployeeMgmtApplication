package com.operations;

import java.util.LinkedHashMap;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employeedetails.project.Employee;

public class Performing implements EmployeeSystems
{

	static LinkedHashMap<Integer, Employee> details=new LinkedHashMap<Integer, Employee>();
	static Employee emp;
	Scanner sc=new Scanner(System.in);

	
	
	public void addEmployee()
	{
//		System.out.println("enter employee id");
//		int id=sc.nextInt();
//		System.out.println("enter employee name");
//		String name=sc.next();
//		System.out.println("enter employee designation");
//		String designation=sc.next();
//		System.out.println("enter employee dept number");
//		int deptNo=sc.nextInt();
//		System.out.println("enter employee date of birth");
//		String dob=sc.next();
//		System.out.println("enter employee salary");
//		double salary=sc.nextDouble();
//		
//		emp=New Employee(id,name,designation,deptNo,dob,salary);
//		details.put(id,emp);
//		System.out.println("employee details added...");
//	}
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
	   Session session =factory.openSession();
	   Transaction tx = session.beginTransaction();
	   
	   Employee e = new Employee();
	   e.setEmpid(empid);
	   e.setName(ename);
	   e.setDeptno(deptno);
	   e.setDesignation(designation);
	   e.setDateOfBirth(dateOfBirth);
	   e.setSalary(salary);

	   
	   
	   
//	   Session session =factory.openSession();
	     session.save(e);
	     
//	     Transaction tx = session.beginTransaction();
	     tx.commit();
	     session.close();
	     System.out.println("Employee table created......");
	}
	
	public void viewEmployeeDetails()
	{
//		System.out.println("enter employee ID");
//		int id=sc.nextInt();
//		if(details.containsKey(id)) {
//			Employee s=details.get(id);
//			System.out.println("---------------------------------------------");
//			System.out.println(s);
//			System.out.println("---------------------------------------------");
//			
//			
//		}
//		else {
//			System.out.println("data will be not founded......");
//		}
//	}
		System.out.println("enter employee ID");
		int id1=sc.nextInt();
//		
		Configuration cfg2 = new Configuration();
	cfg2.configure("hibernate.cfg.xml");
		cfg2.addAnnotatedClass(Employee.class);
		
		SessionFactory factory1 =cfg2.buildSessionFactory();
		
		Session session1=factory1.openSession();
		
		Employee emp1= session1.get(Employee.class, id1);
//		Employee e=new Employee();
		System.out.println(emp1);
		System.out.println("-----------------------------------------------");
		
		
		}
		public void deleteEmployee()
		{
			
//
//            System.out.println("enter id for the employee.....");
//			int id=sc.nextInt();
//			if(details.containsKey(id)) {
//				details.remove(id);
//				System.out.println("employee details deleted.....");
//				
//			
//			}else {
//				System.out.println("data will be not found....");
//			}
			///////////////////////////////////////////////////////
			
			//Create session factory object
//			Configuration cfg = new Configuration();
//			cfg.configure("hibernate.cfg.xml");
//		   SessionFactory factory =cfg.buildSessionFactory(); 
//		 
//		  //getting session object from session factory
//		  Session session = factory.openSession();
//		  
//		  //getting transaction object from session object
//		  session.beginTransaction();
//		 
//		  Employee e = (Employee)session.load(Employee.class, 1);
//		  session.delete(e);
//		  
//		  System.out.println("Deleted Successfully");
//		  session.getTransaction().commit();
//		  factory.close();
		////////////////////////////////////////////////////////
			
			Configuration configuration4 = new Configuration();
			configuration4.configure("hibernate.cfg.xml");
			configuration4.addAnnotatedClass(Employee.class);

			//Creating Session Factory
			SessionFactory sessionFactory4 = configuration4.buildSessionFactory();

			//Initialize Session Object
			Session session4 = sessionFactory4.openSession();
			System.out.println("Enter Employee Id whose Data want to DELETE...");
			int id4 = sc.nextInt();
			Employee emp4 = session4.get(Employee.class, id4);
			session4.delete(emp4);
			session4.beginTransaction();
			session4.getTransaction().commit();
			
		}
}
