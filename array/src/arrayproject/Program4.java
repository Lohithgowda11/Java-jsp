package arrayproject;

import java.util.Scanner;

public class Program4 
{
	static int add(int size)
	{
		System.out.println("print array element");
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=arr[i]*arr[i];
			System.out.println();
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int x=sc.nextInt();
		
		add(x);
		
	}

}
