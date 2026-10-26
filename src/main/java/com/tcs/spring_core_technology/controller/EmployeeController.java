package com.tcs.spring_core_technology.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.spring_core_technology.dto.EmployeeDriver;
import com.tcs.spring_core_technology.config.MyConfig;

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeDriver dtoEmployee = ctx.getBean(EmployeeDriver.class);
		dtoEmployee.getEmployee();
//		String name = dtoEmployee.getName();
//		Laptop laptop = new dtoEmployee.getLaptop();
//		laptop.display();
//		System.out.println(name);
	}
}
