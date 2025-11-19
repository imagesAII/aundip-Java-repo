package com.anudip.assignments;


public class CalSimBill {

	public static void main(String[] args) {
		


		int Gb_Consumed = 50;
		int basic_charge = 300;
		int bill_amount = 0;
		
		if(Gb_Consumed < 10) {
			
			bill_amount = basic_charge;
			System.out.println("The bill amount for the data consumed is : "+ bill_amount);
			System.out.println("==============================");
		}if(10<Gb_Consumed && Gb_Consumed<30) {
			
			bill_amount = basic_charge + 5*(Gb_Consumed-10);
			System.out.println("The bill amount for the data consumed is : "+bill_amount);
			System.out.println("==============================");
			
		}if(Gb_Consumed>30) {
			bill_amount = 400 + 3*(Gb_Consumed-30);
			System.out.println("The bill amount for the data consumed is : "+bill_amount);
			System.out.println("==============================");
		}
		
		System.out.println("Your bill is given by your Sim card Provider");
		
		
		
	}

}
