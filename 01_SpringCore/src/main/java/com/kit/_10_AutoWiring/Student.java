package com.kit._10_AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Qualifier("cirti1")
	@Autowired
	private Certificate cirti;

	public Student(Certificate cirti) {
		this.cirti = cirti;
		System.out.println("Injucting proparty using Costructer Methods\n");
	}

	public Student() {
	}

	public Certificate getCirti() {
		return cirti;
	}

	public void setCirti(Certificate cirti) {
		this.cirti = cirti;
		System.out.println("Injucting proparty using Settrs  Methods\n");
	}

	@Override
	public String toString() {
		return "Student [cirti=" + cirti + "]";
	}
}
