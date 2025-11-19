package com.anudip.assignments;

import java.util.Scanner;

public class ArraySunAvg {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Step 1: Get array size
		        System.out.print("Enter number of elements: ");
		        int n = sc.nextInt();

		        // Step 2: Declare array
		        int[] numbers = new int[n];
		        int sum = 0;

		        // Step 3: Get array elements from user
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = sc.nextInt();
		            sum += numbers[i]; // calculate sum
		        }

		        // Step 4: Calculate average
		        double average = (double) sum / n;

		        // Step 5: Display results
		        System.out.println("\nSum = " + sum);
		        System.out.println("Average = " + average);

		        sc.close();

	}

}
