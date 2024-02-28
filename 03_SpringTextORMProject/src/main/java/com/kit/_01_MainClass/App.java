package com.kit._01_MainClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kit._01_DaoClass.StudentDao;
import com.kit._01_EntityClass.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Application  execution Started..!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_01_MainClass/Config.xml");
		StudentDao bean = (StudentDao) context.getBean("studentDao");
		System.out.println(bean);
		System.out.println("===================");
		Student s = new Student();
		s.setUsn(12);
		s.setName("Deva");
		s.setCity("bangaluru");

		bean.insert(s);

		// single data fetching
//		System.out.println("=====================");
//		Student student = bean.getStudent(2);
//		System.out.println(student);

//		System.out.println("=============Multi data Fetching==================");
//		List<Student> std =  bean.getAllstudent();
//		for (Student b : std) {
//			System.out.println(b);
//		}

		System.out.println("=============Deleting the record==================");
		bean.delete(11);
		System.out.println("Application  execution Ended..!");
	}
}
