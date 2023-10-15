package arrayproject;

import java.util.Scanner;

public class Strong 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem = no%10;
			int no1= rem;
			int fact=1;
			for (int i = no1; i >=1; i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println(" not Strong number");
		}
	}

}
