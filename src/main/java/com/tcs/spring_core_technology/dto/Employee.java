package com.tcs.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.cs.spring_core_technology.dto.Laptop;
import com.tcs.spring_core_technology.dto.Laptop;

@Component(value="dtoEmployee")

public class Employee {
	
	Laptop laptop;

	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public String getName() {
		return "My name is Spring";
	}
	
}
