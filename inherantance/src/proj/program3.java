package proj;
class animal
{
	void noise()
	{
		System.out.println("sound");
	}
}
class Dog extends animal
{
	void noise()
	{
		System.out.println("bow bow");
	}
}
class Snake extends animal
{
	void noise()
	{
		System.out.println("buss buss");
	}
}
class cat extends animal
{
	void noise()
	{
		System.out.println("meow meow");
	}
}
class stimulator
{
	static void ansim(animal a1)
	{
		a1.noise();
	}
}
public class program3
{
	public static void main(String[] args)
	{
		cat c1 = new cat();
		Snake s1 = new Snake();
		Dog d1 = new Dog();
		stimulator.ansim(c1);
		stimulator.ansim(d1);
		stimulator.ansim(s1);
		
	}

}
