package com.abstraction;

public class Testlogic {
	
	public static void main(String args[]) {
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Square();
		
		Shape[] shapes = new Shape[3];
		
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		
		double totalUsedArea = 0;
		
		for (Shape shape: shapes) {
			System.out.println(shape.calculatearea());
			totalUsedArea = totalUsedArea + shape.calculatearea();
		}
		
		System.out.println("\n**************");
		double totalPlotArea = 100 * 100;
		double remainingArea = totalPlotArea - totalUsedArea;
		System.out.println("Total Plot area used = "+ totalPlotArea);
		System.out.println("Total used area = "+ totalUsedArea);

		System.out.println("Total Plot area remaining = "+ remainingArea);

		
		
	}

}
