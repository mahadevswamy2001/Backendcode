package com.kit._03_RefrenceType;

public class A {
	private int a;
	private B b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}
}
