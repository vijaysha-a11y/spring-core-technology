package com.cs.spring_core_technology.dto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung implements Mobile{
	@Override
	public void getSnap() {
		System.out.println("samsung processing snap");
	}
	@Override
	public void getCall() {
		System.out.println("samsung ringing call");
	}
}
