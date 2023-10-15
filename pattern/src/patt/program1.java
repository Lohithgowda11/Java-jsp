package patt;

public class program1
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=5; i++)
		{
			for (int j = 0; j <=i; j++)
			{
				if(i==0)		
					System.out.print("A");		
				else if(i==1)			
					System.out.print("B");			
				else if(i==2)			
					System.out.print("C");			
				else if(i==3 && j<3)			
					System.out.print("D");
				else if(i==4 && j<4)
					System.out.print("E");
				else if(i==5 && j<5)		
					System.out.print("F");
			}
			System.out.println();
		}
	}
}
