package loh_java_project;

public class Sum 
{
	static void add(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int rem = a%10;
			sum = sum+rem;
			a=a/10;
			
		}
		System.out.println(sum);
	}
public static void main(String[] args)
{
	add(1234);
	
}
}
