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
		
		//this wont compile
		//System.out.println(mino.getNumLives());
		
		//this is an example of a cast
		System.out.println(((Cat)mino).getNumLives());
		
		mino = new Dog("Misty"); //this will compile
		//topcat = new Dog("Tara"); //this wont compile
		
		Animal a = new Cat("a");
		Animal b = new Cat("b");
		
		System.out.println(a);
		System.out.println(b);
		
		a = b;
		
		a.setName("c");
		
		System.out.println(a);
		System.out.println(b);
	}
}

