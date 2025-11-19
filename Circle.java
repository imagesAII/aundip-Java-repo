package com.abstraction;

public  class Circle extends Shape
{

	@Override
	double calculatearea() {
		int r = 10;
		
		double area = 3.14 * r * r;
		

		return area;
	}

}
