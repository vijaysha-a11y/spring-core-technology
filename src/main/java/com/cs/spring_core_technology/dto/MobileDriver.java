package com.cs.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MobileDriver {
	@Autowired
//	@Qualifier(value="ai")
	Mobile mobile;
	public void getMobile() {
		mobile.getSnap();
		mobile.getCall();
	}
}
