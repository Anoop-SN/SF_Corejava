package com.tns.statickeyword;

public class Student {
    String name;
    int rollNo;
    String dept;
    static String college = "CEC"; // static variable
    static int studentCount = 0; // static variable to keep track of the number of students

    public Student(String name, int rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
        studentCount++; // increment the student count for each new student
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + dept);
        System.out.println("College: " + college);
    }

    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }
}
