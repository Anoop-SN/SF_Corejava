package com.tns.interfaces;

public class Car implements Vechile {
    private String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(model + " is stopping.");
        speed = 0;
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println(model + " is accelerating to " + speed + " km/h.");
    }

    public void displayStatus() {
        System.out.println(model + " is currently at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.start();
        myCar.accelerate(60);
        myCar.displayStatus();
        myCar.stop();
        myCar.displayStatus();
    }
}
