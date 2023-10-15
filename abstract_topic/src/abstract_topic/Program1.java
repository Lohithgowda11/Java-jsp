package abstract_topic;

abstract class Sample
{
	abstract void disp();
	
	
}



public class Program1 extends Sample
{
	void disp()
	{
		System.out.println("hiii");
	}
	void disp1()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Program1 p1 = new Program1();
		
		p1.disp();
	}
}
