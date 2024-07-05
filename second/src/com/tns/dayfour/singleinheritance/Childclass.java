package com.tns.dayfour.singleinheritance;

public class Childclass extends Parentclass
{
	int age;
	float per;

	public Childclass () {
		System. out.println ("Default Constructor !!! ");



	}

	public Childclass (int age, float per, int id, String name) 
	{
		this.age = age;
		this.per = per;
		this.name= name;
		this.id = id;

	}

	void display () 
	{
		System.out.println("Name: "+name) ;
		System. out.println ("ID: "+id) ;
		System. out.println ("Age: "+age) ;
		System. out.println ("Percentage: "+per) ;

	}
}
