package com.cg.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.IDao;

@Component("myser")
public class SerImpl implements IService {

	private IDao dao;
	
	public SerImpl() {
		System.out.println("Service Constructor");
	}
	
	//setter for IOC to inject dependencies 
	@Autowired
	@Qualifier("jpadao")
	//@Resource(name = "${dbean}")
	public void setDao(IDao dao) {
		System.out.println("Inject the Dependencies");
		this.dao = dao;
	}

	@Override
	public String viewName() {
		return dao.getName();
	}

}
