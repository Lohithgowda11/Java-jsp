package proj;

class demo
{
	int a=10;
	
}
class demo1 extends demo
{
	void samp()
	{
		System.out.println("hiii");
	}
}
class demo2 extends demo1
{
	void sample()
	{
		System.out.println("hello");
	}
}
public class prgram1 
{
	public static void main(String[] args)
	{
		demo2 d1 = new demo2();
		System.out.println(d1.a);
		d1.samp();
		d1.sample();
	}
}
