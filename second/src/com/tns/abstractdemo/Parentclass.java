package com.tns.abstractdemo;

public abstract class Parentclass {
    // Abstract method (does not have a body)
    abstract void display();

    // Regular method
    public void print() {
        System.out.println("This is a concrete method from the ParentClass.");
    }
}
