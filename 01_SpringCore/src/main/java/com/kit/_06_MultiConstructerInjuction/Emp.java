package com.kit._06_MultiConstructerInjuction;

public class Emp {
	private int eId;
	private String name;
	private int eSalarry;

	public Emp(int eId, String name, int eSalarry) {
		super();
		this.eId = eId;
		this.name = name;
		this.eSalarry = eSalarry;
	}

	@Override
	public String toString() {
		return "emp [eId=" + eId + ", name=" + name + ", eSalarry=" + eSalarry + "]";
	}
}
