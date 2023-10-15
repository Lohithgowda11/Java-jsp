package loh_java_project;

public class Program2
{
	public static void main(String[] args) 
	{
		System.out.println("main Starts");
		try
		{
			int i=1/0;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		finally{
			System.out.println("hey i am finally");
		}
		System.out.println("main Starts");
		
	}

}
