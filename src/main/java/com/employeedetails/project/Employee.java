package com.employeedetails.project;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
	@Column(name="emp_id")
	private int empid;
	@Column(name="emp_name")
	private String ename;
	@Id
	@Column(length=10 ,name="DEPT_No")
	private int deptno;
	@Column(name="emp_designation")
	private String designation;
	@Column(name="emp_DateofBirth")
	private String  dateOfBirth ;
	@Column(name="emp_Salary")
	private double salary;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getdateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String ename, int deptno, String designation,String dateOfBirth, double salary) {

		super();
		this.empid = empid;
		this.ename = ename;
		this.deptno = deptno;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	
	
	

}
