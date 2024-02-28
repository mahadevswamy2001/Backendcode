// StudentConfiguration.java
package com.kit._15_ProgramWithoutXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration("std")
public class Student {

	@Value("12")
	private int id;

	@Value("Dev")
	private String name;

	void study() {
		System.out.println("Study for four hours");
	}

	public int getId() {
		System.out.println("Getter");

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Super class");

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
