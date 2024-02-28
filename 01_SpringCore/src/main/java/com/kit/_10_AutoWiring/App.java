package com.kit._10_AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Exicution Started.................!!!\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_10_AutoWiring/Config10.xml");
		Certificate c = (Certificate) context.getBean("cirti");
		System.out.println(c + "\n");
		System.out.println("=============================================\n");
		Student s = (Student) context.getBean("stud");
		System.out.println(s + "\n");
		System.out.println("program exicution was Ended.............!!!");
	}
}
