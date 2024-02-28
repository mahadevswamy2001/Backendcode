package com.kit._16_ProgramWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfigration {

	@Bean(name = { "a", "b" })
	public Student getStudent() {
		Student s = new Student();
		return s;
	}
	
}
