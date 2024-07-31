package com.tns.Final;

public class FinalVariable {
	
	int a;
	//final int b;
	int c=10;
	final int d=20;
	
	static final int e=40;
	//static final int f;
	
	void change() {
		a=10;
		c=20;
		//d=21; cannot change final value
	}
	
}
