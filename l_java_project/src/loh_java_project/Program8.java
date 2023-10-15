package loh_java_project;
import java.util.Arrays;
import java.util.Scanner;

public class Program8 
{
	static int Demo(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Ascending order of array");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("descending order");
		for(int i= arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= sc.nextInt();
			
		}
		Demo(arr);
		
	}

}
