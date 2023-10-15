package arrayproject;
import java.util.Scanner;
public class program3 
{
	public static void main(String[] args) 
	{
		Addition.sum();
	}
}
	
	class Addition
	{
	
	static int sum()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size= sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the aaray elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			int sum=0;
			while(no!=0)
			{
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
				
			}
			System.out.println(sum);
		} return 0;
	}

}
