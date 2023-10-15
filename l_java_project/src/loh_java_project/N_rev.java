package loh_java_project;

public class N_rev
{
	public static void main(String[] args)
	{
	int no =1233;
	int rev=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		rev=(rev*10)+rem;
		no=no/10;
	}
	System.out.println(rev);
	
	if(copy==rev)
	{
		System.out.println("it is palindrome");
		
	}
	else
	{
		System.out.println("it is not palindrome");
	}

}
}