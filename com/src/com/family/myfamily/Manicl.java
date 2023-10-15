package com.family.myfamily;

abstract class Sample
{
	abstract void disp();
	abstract void cool();
	
}
class Demo1 extends Sample
{
	void disp()
	{
		System.out.println("hii");
	}
	void cool()
	{
		System.out.println("hello");
	}
	}
public class Manicl 
{
	public static void main (String[] args)
	{
		Demo1 d1= new Demo1();
		d1.disp();
		d1.cool();
		
	}
}
