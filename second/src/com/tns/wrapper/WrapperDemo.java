package com.tns.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		int a =10;
		//wrapping
		Integer i = new Integer(a);
		
		int b = i.intValue();
		System.out.println(a);
		System.out.println(b);
	}

}
