package com.tnsif.hinheritance;

public class Hyundai extends Car {
    

    public Hyundai(String model, int year, double price) {
        super(model, year, price);
    }

    public String getBrandName() {
        return "Hyundai";
    }
}
