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
	
	public void setNumLives(int numLives)
	{
		this.numLives = numLives;
	}
	
	public void getNumLives()
	{
			return  numLives;
	}
	
	public void speak()
	{
		System.out.println("Meow!");
	}
}
	
	
}