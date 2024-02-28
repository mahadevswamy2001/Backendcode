//package com.kit.mainClass;
//import javax.naming.Context;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.kit.daoClass.StudentDao;
//import com.kit.entityClass.Student;
//public class App {
//
//public static void main(String[] args) {
//		System.out.println("Program execution Started-----------!");
//		ApplicationContext co = new ClassPathXmlApplicationContext("com/kit/mainClass/Config.xml");
//		StudentDao s = (StudentDao) co.getBean("student1");
//		Student m=(Student) co.getBean("a");
//		
//		int re = s.insert(m);
//		System.out.println("Program execution Ended-----------!");
//	}
//}
//
package com.kit.mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kit.daoClass.StudentDao;
import com.kit.entityClass.Student;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Program execution Started-----------!");

		// Creating the Spring application context
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kit/mainClass/Config.xml");

		// Getting the StudentDao bean
		StudentDao studentDao = context.getBean(StudentDao.class);

		// Creating a new Student object
		Student student = context.getBean(Student.class);

		// Taking user input for student details
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many Student dat would you want to insert");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(i+" Student data");
			System.out.println("Enter First Name: ");
			student.setFirst_Name(scanner.next());

			System.out.println("Enter Last Name: ");
			student.setLast_Name(scanner.next());

			System.out.println("Enter ERP Number: ");
			student.setERP_Number(scanner.next());

			System.out.println("Enter Date of Birth (DOB): ");
			student.setDOB(scanner.next());

			System.out.println("Enter Email: ");
			student.setEmail(scanner.next());

			System.out.println("Enter Gender: ");
			student.setGender(scanner.next());

			System.out.println("Enter Mobile: ");
			student.setMobile(scanner.next());

			System.out.println("Enter Parents Name: ");
			student.setParents_Name(scanner.next());

			System.out.println("Enter Password: ");
			student.setPassword(scanner.next());
		System.out.println("===================="
				+ "");
		}
		// Closing the scanner
		scanner.close();

		// Inserting the student record
		int result = studentDao.insert(student);

		System.out.println("Program execution Ended-----------!");
	}
}
