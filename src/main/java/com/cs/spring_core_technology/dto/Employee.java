package com.cs.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="csEmployee")
public class Employee {
	Laptop laptop;
	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public String getName() {
		return "my name is spring";
	}
}
