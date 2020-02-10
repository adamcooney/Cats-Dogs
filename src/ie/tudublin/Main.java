package ie.tudublin;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Animal a = new Animal();
		
		//polymorphism means the type is a superclass, the instance is a subclass

		//this is not polymorphism
		//Cat topcat = new Cat("Topcat");

		//this is polymorphism
		Animal mino = new Cat("Mino");

		//virtual method
		//dynamic binding
		mino.speak();
		
		System.out.println(mino.getNumLives());
	}
}

