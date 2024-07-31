package com.tns.Final;

public class Parentclass {
    int a;
    int c = 10;
    final int d = 20;
    static final int e = 40;

    public Parentclass() {
        // This constructor is intentionally empty.
    }

    public Parentclass(int a, int c) {
        this.a = a;
        this.c = c;
        // The final variables cannot be reassigned here
    }

    public void change() {
        a = 10;
        c = 20;
        // d = 21; // cannot change final value
    }

    public void display() {
        System.out.println("a: " + a);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
    }
}
