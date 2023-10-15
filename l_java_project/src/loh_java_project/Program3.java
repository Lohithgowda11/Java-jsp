package loh_java_project;

public class Program3
{
	static public  void main(String[] abs)
	{
		int no =27;
		
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%2==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}
		
	}

}
