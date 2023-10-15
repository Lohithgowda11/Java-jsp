package Classes;
import java.util.PriorityQueue;

public class Program1
{
	public static void main(String[] args) 
	{
		PriorityQueue l1 = new PriorityQueue();
		l1.add("lohith");
		l1.add("jayanth");
		l1.add("srini");
		l1.add("sahan");
		System.out.println(l1);
		l1.remove("srini");
		System.out.println(l1);
		
		
	}

}
