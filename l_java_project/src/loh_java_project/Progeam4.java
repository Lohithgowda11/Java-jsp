package loh_java_project;

import java.util.Scanner;

public class Progeam4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of number to be Print");
		int no=sc.nextInt();
		
		fibo(no);
	}
	static int fibo(int no)
	{
		int f1=0;
		int f2=1;
		int f3=0;
		System.out.print(f1+" "+f2+" ");
		for(int i=0;i<=no;i++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
		return 0;
	}
	}


