package programming;

import java.util.Scanner;

public class Perfect_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		for (int i = 1; i < no; i++) 
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(no==sum)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
	}

}
