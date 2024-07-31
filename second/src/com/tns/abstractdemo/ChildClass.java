package com.tns.abstractdemo;

public class ChildClass extends Parentclass {
    
    // Implementation of the abstract method
    @Override
    void display() {
        System.out.println("Abstract method implementation in ChildClass.");
    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.display();
        cc.print();
    }
}
