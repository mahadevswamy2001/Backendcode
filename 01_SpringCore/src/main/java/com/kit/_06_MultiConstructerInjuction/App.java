package com.kit._06_MultiConstructerInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Application exicution started ===>");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_06_MultiConstructerInjuction/Config06.xml");
		Emp m = (Emp) context.getBean("emp1");
		System.out.println(m);
		System.out.println("====================================================================");
		Emp n = (Emp) context.getBean("emp2");
		System.out.println(n);
		System.out.println("Application exicution Ended ===>");
	}
}
