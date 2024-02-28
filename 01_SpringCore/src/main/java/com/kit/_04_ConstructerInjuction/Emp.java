package com.kit._04_ConstructerInjuction;

public class Emp {

	private String eName;
	private int eId;
	private int eSalary;
	private Dep dept;

	public Emp(String eName, int eId, int eSalary, Dep dept) {
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + ", dept=" + dept + "]";
	}
}
