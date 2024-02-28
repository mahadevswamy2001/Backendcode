package com.kit._16_ProgramWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project exicution Started===============>");

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigration.class);

		Student s = (Student) context.getBean("b");
		System.out.println(s);
		s.study();
		System.out.println("project exicution Ended===============>");

	}

}
