class Sample
{
	void test1()
	{
		System.out.println("hiii");
	}
}
class Demo extends Sample
{
//	void test1()
//	{
//		System.out.println("hiii");
//	}
	void test2()
	{
		System.out.println("hello");
	}
}
public class Class_casting 
{
	public static void main(String[] args) 
	{
		Sample s1=new Demo();
		s1.test1();
		Demo d1= (Demo)s1;
		d1.test1();
		d1.test2();
		
	}

}
