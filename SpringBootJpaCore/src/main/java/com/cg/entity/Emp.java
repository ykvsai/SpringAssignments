package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table (name="cg_emp")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Emp {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name", length=25)
	private String empName;
	
	@Column(name="emp_sal")
	private double empSal;
	
	@Column(name="emp_dept", length=20)
	private String empDept;
	
	@Column(name="DOJ")
	private LocalDate doj;

	public Emp() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empSal + " " + empDept + " " + doj;
	}
	
}
