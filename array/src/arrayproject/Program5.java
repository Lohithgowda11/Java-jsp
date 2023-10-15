package arrayproject;

import java.util.Scanner;

public class Program5
{
	static int factorial(int no)
	{

		
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			 fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		System.out.println(factorial(no));
	}
		

}
