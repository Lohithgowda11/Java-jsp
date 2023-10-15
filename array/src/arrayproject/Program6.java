package arrayproject;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		russian_doll(no);
		
	}
	static void russian_doll(int no)
	{
		if(no==10)
		{
			System.out.println(no);
		}
		else
		{
			if(no%2==0)
			{
				System.out.println(no);
			}
			russian_doll(no+1);
		}
	}

}
