package com.anudip.assignments;

public class TestStudent2 {
    public static void main(String[] args) {
        // Create Student object using constructor
        Student2 s1 = new Student2("Pratik", 21, "Computer Science");

        // Display using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Department: " + s1.getDepartment());

        // Modify values using setters
        s1.setAge(22);
        s1.setDepartment("Information Technology");

        System.out.println("\nUpdated Student Details:");
        System.out.println(s1); // uses toString()
    }
}

