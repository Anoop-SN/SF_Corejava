package com.tns.markainterface;

public class OuterClass {
    // Nested interface
    public interface NestedInterface {
        void nestedMethod();
    }

    // Implementation of the nested interface within the outer class
    public static class InnerClass implements NestedInterface {
        @Override
        public void nestedMethod() {
            System.out.println("Implementation of nested interface method.");
        }
    }
}
