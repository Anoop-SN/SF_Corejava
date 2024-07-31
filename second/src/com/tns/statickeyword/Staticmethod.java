package com.tns.statickeyword;

public class Staticmethod {
	static
	{
		System.out.println("Static Block");
	}
	static void display() {
	System.out.println("Static method");
	}
	void print()
	{
		System.out.println("Normal method");
	}
}
