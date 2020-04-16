package com.cg.dao;

import java.util.List;

import com.cg.entity.Emp;

public interface IEmpDao {

	public boolean addEmp(Emp emp);
	
	public boolean editEmp(Emp emp);
	
	public Emp viewEmp(int eid);
	
	public boolean deleteEmp(int eid);
	
	public List<Emp> viewEmp( String dept);
	
}
