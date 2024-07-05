package com.tnsif.inheritance;

public class Session extends Department {
    private String sessionYear;

    public Session(String collegeName, String collegeAddress, String departmentName, String sessionYear) {
        super(collegeName, collegeAddress, departmentName);
        this.sessionYear = sessionYear;
    }

    public String getSessionYear() {
        return sessionYear;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Session Year: " + sessionYear);
    }
}
