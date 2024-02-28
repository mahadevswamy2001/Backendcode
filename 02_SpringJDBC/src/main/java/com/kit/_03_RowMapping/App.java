package com.kit._03_RowMapping;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kit._03_Student.Dao.StudentDao;
import com.kit._03_StudentEntity.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Program execution Started-----------!");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_03_RowMapping/Config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configration.class);
		
		
		// Call getStudent method with a specific USN
		StudentDao s = (StudentDao) context.getBean("student1");

		Student p = s.getStudent("1");
		System.out.println(p);

		// To get the all Student data
//		List<Student> std = s.getStudent();
//		for (Student a :std) {
//			System.out.println(a);
//		}
//		
		System.out.println("Program exicution was ended-----------------!!!");
	}

}
