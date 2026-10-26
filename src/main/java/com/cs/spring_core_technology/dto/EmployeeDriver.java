package com.cs.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDriver {
	@Autowired
	Employee employee;
	public void getEmployee() {
		String msg = employee.getName();
		System.out.println(msg);
		Laptop laptop = employee.getLaptop();
		laptop.display();
	}
}
