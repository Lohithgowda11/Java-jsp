package loh_java_project;

 interface Puma

{
	 void shoes();
}
 interface Nike extends Puma
{
	void bags();
}
class Rajoutlet implements Nike
{
	public  void shoes()
	{
		System.out.println("shoes");
	}
	public void bags()
	{
		System.out.println("bags");
	}
	public static void main(String[] args)
	{
		Rajoutlet r1=new Rajoutlet();
	r1.bags();
	r1.shoes();
	}
}