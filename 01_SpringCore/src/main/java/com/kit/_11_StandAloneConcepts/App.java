package com.kit._11_StandAloneConcepts;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project exicution Started===============>\n");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_11_StandAloneConcepts/Config11.xml");
		Employ e = (Employ) context.getBean("emp1");
		System.out.println("===================================\n");
		System.out.println(e.getVehecle());
		System.out.println(e.getVehecle().getClass().getName());
		System.out.println("===================================\n");
		System.out.println(e.getEmail());
		System.out.println(e.getEmail().getClass().getName());

		System.out.println("===================================\n");
		System.out.println(e.getName());
		System.out.println(e.getName().getClass().getName());
		System.out.println("===================================\n");
		System.out.println(e.getDbprop());
		System.out.println(e.getDbprop().getClass().getName() + "\n");

		System.out.println("********Re using Coad**************\n");

		Employ a = (Employ) context.getBean("emp2");
		System.out.println(e.getVehecle());
		System.out.println(e.getVehecle().getClass().getName());

		System.out.println("project exicution Ended===============>");
	}
}
