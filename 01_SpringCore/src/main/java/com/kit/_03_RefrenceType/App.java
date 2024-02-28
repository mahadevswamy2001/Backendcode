package com.kit._03_RefrenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Exicution Started...........!!!!");
		// we can create the object of implementation class And the object will created
		// during the run time
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_03_RefrenceType/Config03.xml");
		B b = (B) context.getBean("refB");
		A a = (A) context.getBean("refA");
		System.out.println(b);
		System.out.println(a);
		System.out.println("Project Exicution Complited...........!!!!");
	}
}
