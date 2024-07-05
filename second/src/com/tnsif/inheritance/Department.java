package com.tnsif.inheritance;

public class Department extends College {
    private String departmentName;

    public Department(String collegeName, String collegeAddress, String departmentName) {
        super(collegeName, collegeAddress);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department Name: " + departmentName);
    }
}
