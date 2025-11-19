package com.abstraction;

public class Square extends Shape{

	@Override
	double calculatearea() {
		
		int side = 10;
		
		double area = side * side;

		return area;
	}

}
