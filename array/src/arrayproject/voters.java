package arrayproject;

public class voters 
{
static void age() throws votersException
{
	int age = 15;
	if(age>18)
	{
		System.out.println("you can vote");
	}
	else
	{
		throw new votersException("cant vote");
	}
}
public static void main(String[] args)
{
try
{
	age();
}
catch(votersException e)
{
	System.out.println(e.getMessage());
}
}
}
class votersException extends Exception
{
	String msg;
	votersException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
