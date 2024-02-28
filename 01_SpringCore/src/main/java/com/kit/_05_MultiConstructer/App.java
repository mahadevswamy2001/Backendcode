package com.kit._05_MultiConstructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_05_MultiConstructer/Config05.xml");
		Test t = (Test) context.getBean("test");
		System.out.println(t);
		t.add();
	}
}
