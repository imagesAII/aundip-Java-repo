package com.anudip.assignments;

public class TestAssign1 {

	public static void main(String[] args) {
		

//		case1
		Rectangle rec1 = new Rect1(20, 10);
		System.out.println("The Area of the rectangle 1 is : "+rec1.calculateArea());
		
		Rectangle rec2 = new Rect2(20, 10);
		System.out.println("The Area of the rectangle 2 is : "+rec2.calculateArea());
		
		if(rec1.calculateArea()>rec2.calculateArea()) {
			System.out.println("The Area of rectangle 1 is Bigger than the area of rectangle 2");
		}
		else if(rec1.calculateArea()<rec2.calculateArea()){
			System.out.println("The Area of rectangle 2 is Bigger than the area of rectangle 1");
		}
		else {
			System.out.println("Both are equal");
		}
		
		System.out.println("-----------------------------");
		
//		case2
		Rectangle rec3 = new Rect1(20, 10);
		System.out.println("The Area of the rectangle 1 is : "+rec3.calculateArea());
		
		Rectangle rec4 = new Rect2(35, 14);
		System.out.println("The Area of the rectangle 2 is : "+rec4.calculateArea());
		
		if(rec3.calculateArea()>rec4.calculateArea()) {
			System.out.println("The Area of rectangle 1 is Bigger than the area of rectangle 2");
		}
		else if(rec3.calculateArea()<rec4.calculateArea()){
			System.out.println("The Area of rectangle 2 is Bigger than the area of rectangle 1");
		}
		else {
			System.out.println("Both are equal");
		}
		
		System.out.println("------------------------------");
		
//		casee3
		Rectangle rec5 = new Rect1(56, 18);
		System.out.println("The Area of the rectangle 1 is : "+rec5.calculateArea());
		
		Rectangle rec6 = new Rect2(12, 6);
		System.out.println("The Area of the rectangle 2 is : "+rec6.calculateArea());
		
		if(rec5.calculateArea()>rec6.calculateArea()) {
			System.out.println("The Area of rectangle 1 is Bigger than the area of rectangle 2");
		}
		else if(rec5.calculateArea()<rec6.calculateArea()){
			System.out.println("The Area of rectangle 2 is Bigger than the area of rectangle 1");
		}
		else {
			System.out.println("Both are equal");
		}
		
		System.out.println("------------------------");
		
	}

}
