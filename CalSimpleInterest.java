package com.anudip.assignments;

import java.util.Scanner;

public class CalSimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount of the loan :");
		int principle = sc.nextInt();
		
		System.out.println("Enter the time required to pay the loan :");
		int time = sc.nextInt();
		
		int si = principle * time;
		
		if(principle>10000) {
			si =  si * 1/10;
			System.out.println("The simple interest at 10% rate is :"+ si);
		}if(10000 > principle && principle > 5000){
			
			si =  si * 4/50;
			System.out.println("The simple interest at 8% rate is :"+ si);
			
		}if(5000>=principle){
			si =  si * 1/20;
			System.out.println("The simple interestat 5% rate is :"+ si);
		}
	}

}
