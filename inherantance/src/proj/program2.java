package proj;
class dem
{
	void send(int a)
	{
		System.out.println("number");
	}
	void send(int b,String c)
	{
		System.out.println("number and stiring");
	}
	void send(int d,String e,char f)
	{
		System.out.println("number,string and char");
	}
}
public class program2
{
	public static void main(String[] args)
	{
		dem d2= new dem();
		d2.send(123);
		d2.send(123,"lohith");
		d2.send(123,"lohith",'l');	}
	
	

}
