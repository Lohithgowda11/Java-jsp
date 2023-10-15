package loh_java_project;

public class Reve
{
	public static void main(String[] args)
	{
	String str= "lohith";
	String rev=" ";
	for(int i=0;i>=str.length()-1;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	}
}
