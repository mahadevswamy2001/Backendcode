package com.kit._04_ConstructerInjuction;

public class Dep {

	private String dName;
	public Dep(String dName) {
		super();
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Dep [dName=" + dName + "]";
	}
}


