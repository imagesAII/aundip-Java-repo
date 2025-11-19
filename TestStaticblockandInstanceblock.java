package com.encapsulation;

public class TestStaticblockandInstanceblock {
	
	public static class Xyz{
		
	}
	
	public TestStaticblockandInstanceblock() {
		System.out.println("Default constructor called.....");
	}

	public static void main(String[] args) {
		System.out.println("Main mathod called....");
		new TestStaticblockandInstanceblock();
	}
	
	
	static {
		System.out.println("static block loaded....");
	
	}
	
	{
		System.out.println("instance block loaded.....");
	}
	

}
