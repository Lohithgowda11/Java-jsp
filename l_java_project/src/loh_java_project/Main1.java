package loh_java_project;

abstract class Sample1
{
	abstract void disp();
	abstract void cool();
}
abstract class Dem extends Sample1
{
	void cool()
	{
		System.out.println("hello");
	}
}
class Test extends Dem
{
	void disp()
	{
		System.out.println("hii");
	}
}
public class Main1 
{
	public static void main(String[] args)
	{
		Test s = new Test();
		s.cool();
		s.disp();
	}

}
