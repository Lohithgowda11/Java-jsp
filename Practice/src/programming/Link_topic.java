package programming;

import java.util.LinkedList;

public class Link_topic 
{
	public static void main(String[] args) 
	{
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add("oji");
		l1.add(1, 354);
		
		System.out.println(l1.peek());
		System.out.println(l1.poll());
		System.out.println(l1);
		
	}

}
