package com.tnsif.inheritance;

public class College {
    private String collegeName;
    private String collegeAddress;

    public College(String collegeName, String collegeAddress) {
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void displayInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Address: " + collegeAddress);
    }
}
