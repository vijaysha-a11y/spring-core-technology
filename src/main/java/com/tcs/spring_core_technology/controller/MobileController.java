package com.tcs.spring_core_technology.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.spring_core_technology.dto.MobileDriver;
import com.tcs.spring_core_technology.config.MyConfig;
import com.tcs.spring_core_technology.controller1.Customer;


public class MobileController {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		MobileDriver driver = ctx.getBean(MobileDriver.class);
		Customer customer =  ctx.getBean(Customer.class);
		customer.m1();
	}
}
