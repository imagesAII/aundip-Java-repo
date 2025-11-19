package com.anudip.assignments;

public class Rect2 extends Rectangle{
	
	private int length;
	private int width;

	public Rect2(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rect2 [length=" + length + ", width=" + width + "]";
	}

	@Override
	double calculateArea() {
		return length * width;
	}

}
