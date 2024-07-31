package com.tns.markainterface;

import com.tns.markainterface.OuterClass.InnerClass;
import com.tns.markainterface.OuterClass.NestedInterface;

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        // Using the nested interface
        InnerClass obj = new InnerClass();
        obj.nestedMethod();
    }
}
