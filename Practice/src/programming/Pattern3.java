package programming;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		for (int i = 1; i <=no; i++)
		{
			for (int j = no; j>=1 ; j--)
				
			{
				if(i>j)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}

}
