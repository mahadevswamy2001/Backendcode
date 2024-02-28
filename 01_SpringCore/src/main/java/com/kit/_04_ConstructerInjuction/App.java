package com.kit._04_ConstructerInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project exicution Started===============>");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_04_ConstructerInjuction/Config04.xml");
		Dep d = (Dep) context.getBean("emp1");
		Emp a = (Emp) context.getBean("emp2");
		System.out.println(d);
		System.out.println(a);
		System.out.println("Project exicution Ended===============>");
	}
}
