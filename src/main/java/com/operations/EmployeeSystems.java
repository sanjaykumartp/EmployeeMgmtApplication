package com.operations;



public interface EmployeeSystems {

	void addEmployee();
	void viewEmployeeDetails();
//	void updateEmployeeDetails();
	void deleteEmployee();
	
}
////Create session factory object
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
//	  Employee employee = (Employee)session.get(Employee.class, 1);
//	  
//	  employee.setName("Sudeep");
//	  System.out.println("Updated Successfully");
//	  
//	  session.getTransaction().commit();
//	  factory.close();