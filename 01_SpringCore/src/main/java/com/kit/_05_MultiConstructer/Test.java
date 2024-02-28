package com.kit._05_MultiConstructer;

//during the run time The priority will be given to the String
//By default the execution will happen top to bottom but in case of non primitive data type the priyority will be given to the String
public class Test {
	private int x;
	private int y;

	public Test(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Integer type============");
	}

	//
//		public Test(String x, String y) {
//			this.x = Integer.parseInt(x);
//			this.y = Integer.parseInt(y);
//			System.out.println("String  type============");
//		}
	public Test(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("Double type");
	}

	public void add() {
		System.out.println("Value of x is:--" + this.x);
		System.out.println("Value of y is:--" + this.y);
		// not result should be in brackete other wise it will be act as String
		System.out.println("Result of x and y is" + (this.x + this.y));
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
}
