package com.cs.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value(value="${spring.id}")
	private int id;
	@Value(value="${spring.name}")
	private String name;
	@Value(value="${spring.price}")
	private double price;
	
	public void display() {
		System.out.println("id ="+id);
		System.out.println("Name ="+name);
		System.out.println("Price ="+price);
	}
}
