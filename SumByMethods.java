package com.anudip.assignments;
import java.util.Scanner;

public class SumByMethods {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumByMethods calc = new SumByMethods();

        System.out.println("=== Calculator Demonstrating Method Overloading ===");

        // Two integers
        System.out.print("Enter first integer: ");
        int x = sc.nextInt();
        System.out.print("Enter second integer: ");
        int y = sc.nextInt();
        System.out.println("Sum of two integers: " + calc.add(x, y));

        System.out.println("--------------------------------");

        // Three integers
        System.out.print("Enter three integers (separated by spaces): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three integers: " + calc.add(a, b, c));

        System.out.println("--------------------------------");

        // Two doubles
        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        System.out.println("================================");
        System.out.println("All methods executed successfully!");

        sc.close();
    }
}
