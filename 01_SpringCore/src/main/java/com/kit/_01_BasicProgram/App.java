package com.kit._01_BasicProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Execution Started...........!!!!\n");

		// Object will created during the RUN time.
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_01_BasicProgram/Config01.xml");
		System.out.println();
		System.out.println("================1ND Student details================>");
		Student a = (Student) context.getBean("student1");
		System.out.println(a);
		System.out.println();
		System.out.println("================2ND Student details================>");
		Student b = (Student) context.getBean("student2");
		System.out.println(b + "\n");
		System.out.println("Project Execution Completed...........!!!!");
	}
}
