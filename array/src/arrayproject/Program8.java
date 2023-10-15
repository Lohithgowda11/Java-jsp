package arrayproject;
import java.util.Scanner;

public class Program8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int m= sc.nextInt();
		System.out.println("enter the no of column");
		int n= sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("enter the matrix");
		for (int i = 0; i < arr.length; i++)
		{
			
			for (int j = 0; j < arr.length; j++) 
			{
				arr[i][j] =sc.nextInt();
			}
			
		}
		for (int i = 0; i < arr.length; i++)
		{
			
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		int sum1=0;
		int sum2=0;
		for (int i = arr.length-1; i>=0; i--)
		{
			
			for (int j =arr.length-1 ; j>=0 ; j--) 
			{
				if(arr[i]==arr[j])
				{
					sum1= sum1+arr[i][j];
				}
				if((i+j)==(arr.length-1))
				{
					sum2= sum2+arr[i][j];
				
				}
			}
			
		}
		
		System.out.println(sum1+sum2);
		
		
		
	}

}
