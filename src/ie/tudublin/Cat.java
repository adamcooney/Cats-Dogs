package ie.tudublin;

public class Cat extends Animal
{
	private int numLives;
	
	public Cat(String name)
	{
		//Constructor chaining
		super(name);
		setNumLives(9);
	}
	
	public void setNumLives()
	{
		
	}
	
	public void getNumLives()
	{
		
	}
	
	public void speak()
	{
		System.out.println("Meow!");
	}
}
	
	
}