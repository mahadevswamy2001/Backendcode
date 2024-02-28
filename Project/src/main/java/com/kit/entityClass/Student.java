package com.kit.entityClass;
public class Student {
	private String First_Name;
	private String Last_Name;
	private String ERP_Number;
	private String DOB;
	private String Email;
	private String Gender;
	private String Mobile;
	private String Parents_Name;
	private String Password;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getERP_Number() {
		return ERP_Number;
	}
	public void setERP_Number(String eRP_Number) {
		ERP_Number = eRP_Number;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getParents_Name() {
		return Parents_Name;
	}
	public void setParents_Name(String parents_Name) {
		Parents_Name = parents_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Student [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", ERP_Number=" + ERP_Number
				+ ", DOB=" + DOB + ", Email=" + Email + ", Gender=" + Gender + ", Mobile=" + Mobile + ", Parents_Name="
				+ Parents_Name + ", Password=" + Password + "]";
	}
}

