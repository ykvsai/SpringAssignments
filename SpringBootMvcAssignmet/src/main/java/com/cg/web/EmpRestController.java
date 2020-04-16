package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;
import com.cg.exception.EmpIdException;
import com.cg.exception.EmpNotFoundException;

public class EmpRestController {
	
	@Autowired
	private IEmpDao dao;
	
	@GetMapping("/viewall")
	public List<Emp> getAllEmployee() {
		return dao.viewEmp();
	}
	
	@GetMapping("/viewbyid/{empid}")
		public Emp getEmployeeById(@PathVariable("empid") int eid) throws EmpNotFoundException {
		Emp emp = dao.viewEmp(eid);
		if(emp==null)
			throw new EmpNotFoundException();
		return emp;
	}
	
	@GetMapping("/viewbydept/{dept}")
	public Emp getEmployeeByDept(@PathVariable("dept") int eid) {
		return dao.viewEmp(eid);
	}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Emp emp) throws EmpIdException{
		try {
			dao.addEmp(emp);
			return "succefully added";
		}
		catch (Exception e){
			throw new EmpIdException();
		}
	}
	
	@PutMapping("/edit")
	public String EditEmployee(@RequestBody Emp emp) throws EmpIdException{
		dao.editEmp(emp);
		return "succesfully edited";
	}
	
	@PutMapping("/remove/{empid}")
	public String removeEmployee(@PathVariable("empid") int eid) throws EmpIdException{
		dao.deleteEmp(eid);
		return "succesfully removed";
	}
	
}
