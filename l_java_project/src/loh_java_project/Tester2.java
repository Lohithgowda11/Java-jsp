package loh_java_project;

interface Sample2
{
	void disp();
	void test();

}
abstract class Demo2 implements Sample2
{
	public void test()
	{
		System.out.println("hello");
	}
}
class  Tester2 extends Demo2

	{
		public void disp()
		{
			System.out.println("hi");
		}

		public static void main(String[] args)
		{
			Tester2 t2=new Tester2();
			t2.disp();
			t2.test();
		}
}
