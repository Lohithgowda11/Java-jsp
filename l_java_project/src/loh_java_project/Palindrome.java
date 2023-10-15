package loh_java_project;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	String str=sc.nextLine() ;
	String rev="";
	for(int i=str.length()-1 ; i>(str.length()-1)/2 ; i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	}

}
