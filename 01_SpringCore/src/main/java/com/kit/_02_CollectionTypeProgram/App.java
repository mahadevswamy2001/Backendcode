package com.kit._02_CollectionTypeProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Exicution Started ...........!!!!\n");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_02_CollectionTypeProgram/Config02.xml");
		Employ e = (Employ) context.getBean("Emp");
		System.out.println(e + "\n");
		System.out.println("Program Exicution was complited...........!!!!");
	}

}
