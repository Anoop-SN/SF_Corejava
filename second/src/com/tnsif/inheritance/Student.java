package com.tnsif.inheritance;

public class Student extends Session {
    private String studentName;
    private int studentRollNo;

    public Student(String collegeName, String collegeAddress, String departmentName, String sessionYear, String studentName, int studentRollNo) {
        super(collegeName, collegeAddress, departmentName, sessionYear);
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + studentRollNo);
    }
}
