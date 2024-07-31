package com.tns.array;

import java.util.Arrays;

public class ArrayOper {
	
	public static void main(String[] args) 
	{
		int a[] = {1,550,3250,040,98,15,75,44,888,30};
		int c[] = {1,550,3250,040,98,15,75,44,888,30};
		System.out.println("Array is:"+Arrays.toString(a)); //print
		//sort
		System.out.println("Array Before sort:"+Arrays.toString(a));
		Arrays.sort(a);//ascending order
		Arrays.sort(c);
		System.out.println("Array after sort:"+Arrays.toString(a));
		int b=30;
		//Print Key and Index
		//array must be sorted
		System.out.println("B found in:"+Arrays.binarySearch(a,b));
		//compare
		System.out.println("Array is:"+Arrays.compare(a,c));
		
		
		
		
		

	}

}
