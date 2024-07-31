package com.tns.throwdemo;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] marks = {95, 150, 85, -5, 60};

        for (int mark : marks) {
            try {
                if (Service.validateMark(mark)) {
                    System.out.println("Valid mark: " + mark);
                }
            } catch (InvalidMarkException e) {
                System.out.println("Invalid mark: " + mark + ". Error: " + e.getMessage());
            }
        }
    }
}
