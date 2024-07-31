package com.tns.array;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		Student s[];
		s=new Student[5];
		s[0]=new Student(1,"Anoop");
		s[1]=new Student(2,"Akash");
		s[2]=new Student(3,"Abhishek");
		s[3]=new Student(4,"darshan");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Name at"+s[i].getRollno()+" "+s[i].getName());
		}

	}

}
