package proj;

import java.util.Scanner;

public class prgram4 
{
	static String num(int no)
	{
		int num=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev= (rev*10)+rem;
			no=no/10;
			
		}
		if(num==rev)
		{
			 return "a "+num;
		}
		else
		{
			return "b";
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the number");
		int no = Sc.nextInt();
		System.out.println(num(no));
	}

}
