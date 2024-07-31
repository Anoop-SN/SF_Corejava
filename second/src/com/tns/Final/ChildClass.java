package com.tns.Final;

public class ChildClass extends Parentclass {
    public ChildClass(int a, int c) 
    {
        super(a, c);
    }

    public void displayChild() {
        System.out.println("Inside ChildClass:");
        display(); // calling the parent class's display method
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass(5, 15);
        child.displayChild();
        child.change(); // change the values of a and c
        System.out.println("After change:");
        child.displayChild();
    }
}
