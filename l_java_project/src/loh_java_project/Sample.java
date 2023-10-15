package loh_java_project;
interface  Maincl
{
	public static int a=10;
	public abstract void disp();
	public abstract void cool();
}
 class Demo1 implements Maincl
{
	public void disp()
	{
		System.out.println("hii");
	}
	public void cool()
	{
		System.out.println("hello");
	}
}
public class Sample 
{
	public static void main(String[] args)
	{
		Demo1 d = new Demo1();
		d.disp();
		d.cool();
		
		System.out.println(d.a);
	}

}
