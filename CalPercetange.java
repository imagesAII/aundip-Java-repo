package com.anudip.assignments;

import java.util.Scanner;

public class CalPercetange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("The score of first subject out of 100 is : ");
		int subject1 = sc.nextInt();
		
		System.out.println("The score of second subject out of 100 is : ");
		int subject2 = sc.nextInt();
		
		System.out.println("The score of third subject out of 100 is : ");
		int subject3 = sc.nextInt();
		
		System.out.println("The score of forth subject out of 100 is : ");
		int subject4 = sc.nextInt();
		
		System.out.println("The score of fifth subject out of 100 is : ");
		int subject5 = sc.nextInt();
		
		double total_marks = subject1 + subject2 + subject3 + subject4 + subject5;
		
		System.out.println("The total marks out of 500 are :" + total_marks);

		double average =total_marks / 500;
		System.out.println("Average is :"+average*100);
		
		if(average>=90) {
		
			System.out.println("The student has got Excellent Grade");
			
		}if(average<90 && average>80) {
			
			System.out.println("The student has got 'A' Grade");
			
		}if(average<80 && average>60) {
			
			System.out.println("The student has got 'B' Grade");
			
		}if(average<60 && average>=40) {
			
			System.out.println("The student has got 'C' Grade");
			
		}if(average<40) {
			
			System.out.println("The Student has got 'D' Grade");
		}
	}

}
