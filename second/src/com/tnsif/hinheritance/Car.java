package com.tnsif.hinheritance;

public abstract class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    public abstract String getBrandName();

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("Brand: " + getBrandName());
    }
}
