package com.kit._13_ScopeAndDescription;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kit._12_SteroAnnotation.Ipl;

public class App {

	public static void main(String[] args) {

		System.out.println("project exicution Started===============>\n");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kit/_13_ScopeAndDescription/Config13.xml");

		Student s = (Student) context.getBean("temp");

		System.out.println(s.hashCode());

		System.out.println("==========================>");
		Student a = (Student) context.getBean("temp");

		System.out.println(a.hashCode());

		System.out.println("project exicution Ended===============>");
	}
}
