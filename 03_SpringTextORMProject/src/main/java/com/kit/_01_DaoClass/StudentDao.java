package com.kit._01_DaoClass;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.kit._01_EntityClass.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		System.out.println("inserting the data...!");
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}

//	
////Fetching Single record
//	public Student getStudent(int usn) {
//		System.out.println("Fetching the data....!");
//		Student s = hibernateTemplate.get(Student.class, usn);
//		return s;
//	}

	// fetching multiple record

//	public List<Student> getAllstudent() {
//		List<Student> loadAll = hibernateTemplate.loadAll(Student.class);
//
//		System.out.println("All the data should be Fetched.....!!");
//		return (List<Student>) loadAll;
//	}

	// Deleting the record in hibernateTemplate
	@Transactional
	public void delete(int usn) {
		System.out.println("Deleting the record");
		Student s = hibernateTemplate.get(Student.class, usn);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
