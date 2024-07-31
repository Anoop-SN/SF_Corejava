package com.tns.statickeyword;

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, "Computer Science");
        Student s2 = new Student("Jane", 102, "Electrical Engineering");
        Student s3 = new Student("Mark", 103, "Mechanical Engineering");

        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
        System.out.println();
        s3.displayStudentInfo();
        System.out.println();

        // Display the total number of students using the static method
        Student.displayStudentCount();
    }
}
