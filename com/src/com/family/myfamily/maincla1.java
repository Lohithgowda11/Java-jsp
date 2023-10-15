package com.family.myfamily;

interface Sample1
{
	void disp();
	void test();
	
}

abstract class Demo3 implements Sample1
{
	public void disp()
	{
		System.out.println("hiii");
	}
}
class Demo2 extends Demo3
{
	public void test()
	{
		System.out.println("hellloo");
	}
}
public class maincla1
{
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.test();
		d2.disp();
	}
}
