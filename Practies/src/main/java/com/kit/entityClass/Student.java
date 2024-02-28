package com.kit.entityClass;

public class Student {
    private String First_Name;
    // other properties and methods...

    // Getters and Setters

    @Override
    public String toString() {
        return "Student [First_Name=" + First_Name + /* other properties... */ "]";
    }

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
}