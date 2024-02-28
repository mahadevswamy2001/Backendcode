package com.kit._12_SteroAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("project exicution Started===============>\n");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_12_SteroAnnotation/Config12.xml");

		Ipl a = (Ipl) context.getBean("ipl");
		System.out.println(a);

		System.out.println("project exicution Ended===============>");
	}
}
