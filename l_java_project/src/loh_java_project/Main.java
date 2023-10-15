package loh_java_project;

class Isro
{
	private int a = 10;
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		a=a;
	}
}

public class Main 
{
	public static void main (String[] args)
	{
		Isro i1 = new Isro();
		System.out.println(i1.getA());
		i1.setA(30);
		System.out.println(i1.getA());
		i1.setA(55);
		System.out.println() ;
		System.out.println(i1.getA());
		
	}

}
