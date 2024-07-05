package com.tnsif.hinheritance;

public class Ford extends Car {
    

    public Ford(String model, int year, double price) {
        super(model, year, price);
       
    }

    public String getBrandName() {
        return "Ford";
    }

    
}
