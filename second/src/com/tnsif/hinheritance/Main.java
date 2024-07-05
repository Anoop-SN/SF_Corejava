package com.tnsif.hinheritance;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Ford("Puma", 2023, 1800000);
        Car car2 = new Hyundai("Tucson 2024", 2024, 3000000);
        Car car3 = new Nissan("X-Trail", 2024, 4000000);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car3.displayInfo();
    }
}
