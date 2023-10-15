package loh_java_project;

interface Animal
{
	void noise();
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("meow meow");
	}
	
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("bow bow");
	}
}
class Snake implements Animal
{
	public void noise()
	{
		System.out.println("buss buss");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
		
	}
}
class Demo{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		Cat c1= new Cat();
		Snake s1= new Snake();
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);
		Stimulator.ansim(c1);
	}
}


