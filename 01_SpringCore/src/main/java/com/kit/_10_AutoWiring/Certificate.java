package com.kit._10_AutoWiring;

public class Certificate {

	private String cName;
	private double Duration;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

	public Certificate() {
		super();
	}

	@Override
	public String toString() {
		return "Certificates [cName=" + cName + ", Duration=" + Duration + "]";
	}
}
