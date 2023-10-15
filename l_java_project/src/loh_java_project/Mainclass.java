package loh_java_project;

class Icici
{
	private String password="icici@1234";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class Mainclass 
{
	public static void main(String[] args)
	{
		Icici ic = new Icici();
		
		System.out.println(ic.getPassword());
		 ic.setPassword("ivcic@43234");
		 System.out.println(ic.getPassword());
	  ic.setPassword("esdgh267");
	  System.out.println(ic.getPassword());
	}

}
