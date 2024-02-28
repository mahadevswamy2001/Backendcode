package com.kit._07_BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
System.out.println("Program exicution Started===!!");
ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_07_BeanLifeCycle/Config.xml");
Chicken c=  (Chicken) context.getBean("c1");
System.out.println(c);
System.out.println("Program exicution Ended===!!");

	}

}
