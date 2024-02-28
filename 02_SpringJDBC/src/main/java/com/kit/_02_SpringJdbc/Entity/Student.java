package com.kit._02_SpringJdbc.Entity;

public class Student {
	private String Usn;
	private String Name;
	private String City;

	// Getters and Setters


	public String getUsn() {
		return Usn;
	}

	public void setUsn(String usn) {
		Usn = usn;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [Usn=" + Usn + ", Name=" + Name + ", City=" + City + "]";
	}

}
