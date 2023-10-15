package com.family.myfamily;

public class sum
{
	public static void main(String[] args)
	{
		int no=12321;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
		}
		if(rev==copy)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
