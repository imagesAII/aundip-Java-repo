package com.anudip.assignments;

// asssignment lab 3 

//Student.java
public class Student2 {

 // 1️⃣ Private attributes
 private String name;
 private int age;
 private String department;

 // 2️⃣ Parameterized constructor
 public Student2(String name, int age, String department) {
     this.name = name;
     this.age = age;
     this.department = department;
 }

 // 3️⃣ Getter and Setter for name
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }

 // 4️⃣ Getter and Setter for age
 public int getAge() {
     return age;
 }
 public void setAge(int age) {
     this.age = age;
 }

 // 5️⃣ Getter and Setter for department
 public String getDepartment() {
     return department;
 }
 public void setDepartment(String department) {
     this.department = department;
 }

 // Optional: toString() method for easy display
 @Override
 public String toString() {
     return "Student [Name=" + name + ", Age=" + age + ", Department=" + department + "]";
 }
}

