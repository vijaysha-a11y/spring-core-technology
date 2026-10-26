package com.tcs.spring_core_technology.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = "com.tcs.spring_core_technology")
@ComponentScan(basePackages = {"com.tcs.spring_core_technology", "com.cs.spring_core_technology"},nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
@PropertySource("classpath:application.properties")
public class MyConfig {

	@Bean
	public String getToDayDate() {
		System.out.println("ToDay time = " + LocalDate.now());
		return "Today date = " + LocalDate.now();
	}
}