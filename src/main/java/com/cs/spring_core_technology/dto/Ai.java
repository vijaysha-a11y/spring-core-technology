package com.cs.spring_core_technology.dto;

import org.springframework.stereotype.Component;

@Component
public class Ai implements Mobile{
	@Override
	public void getSnap() {
		System.out.println("Ai processing snap");
	}
	@Override
	public void getCall() {
		System.out.println("Ai ringing call");
	}
}
