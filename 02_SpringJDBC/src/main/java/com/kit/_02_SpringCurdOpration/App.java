package com.kit._02_SpringCurdOpration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kit._02_SpringJdbc.Deo.StudentDao;
import com.kit._02_SpringJdbc.Entity.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Program execution Started-----------!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_02_SpringCurdOpration/Config.xml");
		StudentDao s = context.getBean("student1", StudentDao.class);
		Student m = (Student) context.getBean("a");
//		Student a = new Student();
//		a.setUsn("727832");
//		a.setName("Rahul");
//		a.setCity("Bangaluru");
		int re = s.insert(m);

		System.out.println("Program execution Ended-----------!");
	}
}
