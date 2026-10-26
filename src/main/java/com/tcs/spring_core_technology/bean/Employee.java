package com.tcs.spring_core_technology.bean;

import org.springframework.stereotype.Component;

@Component(value="beanEmployee")
public class Employee {
	public double getSalary() {
		
		return 100000;
	}
}
