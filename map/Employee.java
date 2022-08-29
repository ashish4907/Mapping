package com.spark.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "demo_employeee")
public class Employee {
	@Id
	@Column(name = "employee_id")
	private int eId;

	@Column(name = "employee_name")
	private String pName;

	@Column(name = "employee_salary")
	private int eSalary;

	private Dept eDept;

	public Dept geteDept() {
		return eDept;
	}

	public void seteDept(Dept eDept) {
		this.eDept = eDept;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", pName=" + pName + ", eSalary=" + eSalary + "]";
	}

}
