package com.kit._14_Spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("project exicution Started===============>\n");
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_14_Spel/Config14.xml");

		Spel s= (Spel) context.getBean("bean1");
		System.out.println(s);
		System.out.println("project exicution Ended===============>");
	}
}
