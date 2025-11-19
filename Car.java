package com.anudip.assignments;

public class Car {
	
	private String company;
	private String model;
	private int year;
	private int price; 
	
	private Car(String company, String model, int year, int price) {
		super();
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public static void main(String[] args) {

		Car car1 = new Car("Maruti","SUV",2013,79800);
		
		System.out.println("The car comoany is : "+car1.company);
		System.out.println("The car model is : "+car1.model);
		System.out.println("The year of mfg of the car is : "+car1.year);
		System.out.println("==========");
		System.out.println("The price of the car According to the given details is : "+car1.price);
		
	}

}
