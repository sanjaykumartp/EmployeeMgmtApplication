package com.employeedetails.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@Column(name="dept_no")
	private int deprtno;
	@Column(name="dept_name")
	private String dname;
	@Column(name="purpose")
	private String purpose;
	public Department(int deprtno, String dname, String purpose) {
		super();
		this.deprtno = deprtno;
		this.dname = dname;
		this.purpose = purpose;
	}
	public Department() {
		super();
		
	}
	public int getDeprtno() {
		return deprtno;
	}
	public void setDeprtno(int deptno) {
		this.deprtno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	

}
