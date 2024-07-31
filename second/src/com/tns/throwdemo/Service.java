package com.tns.throwdemo;

public class Service {
    public static boolean validateMark(int mark) throws InvalidMarkException {
        if (mark < 0 || mark > 100) {
            throw new InvalidMarkException("Mark should be between 0 and 100");
        }
        return true;
    }
}
