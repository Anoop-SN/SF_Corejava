package com.tns.markainterface;

public class MarkerDemo {
    public static void main(String[] args) {
        MarkedClass obj = new MarkedClass();
        
        if (obj instanceof Markable) {
            obj.display();
        } else {
            System.out.println("This class is not marked by the Markable interface.");
        }
    }
}
