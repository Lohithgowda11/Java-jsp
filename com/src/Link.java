import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Link 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str= sc.nextLine();
		LinkedHashSet l1 = new LinkedHashSet();
		for (int i = 0; i <str.length(); i++) 
		{
			l1.add(str.charAt(i));
			
		}
		System.out.println(l1);
	}

}
