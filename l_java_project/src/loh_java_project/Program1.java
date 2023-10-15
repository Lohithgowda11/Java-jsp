package loh_java_project;

import java.util.Scanner;

public class Program1 
{
	 
	public static void main(String[] args) 
	{
		int no=456;
		
		while(no>9)
		{
			int sum=0;
			while(no!=0)
			{
				int rem= no%10;
				sum=sum+rem;
				no=no/10;
			}
			System.out.println(sum);
		}
		
	}

}
