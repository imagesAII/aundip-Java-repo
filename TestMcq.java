package com.inheritance;

class Parent {
	public void method() {
		System.out.println("Hi i am parent");
	}
}

public class TestMcq extends Parent {
	public void method() {
		System.out.println("Hi i am Child");
	}

	public static void main(String args[]) {
		TestMcq child = new TestMcq();
		child.method();
	}
}