package day2.polymorphism;

class Animal
{
	void animalSound()
	{
		System.out.println("Animal Sounds");
	}
}

class Pig extends Animal
{
	void animalSound()
	{
		System.out.println("Pig Sounds");
	}
}

class Lion extends Animal
{
	void animalSound()
	{
		System.out.println("Lion Sounds");
	}
}

public class DynamicMethodDispatch
{
	public static void main(String[] args) 
	{
		Animal myPig = new Pig();
		Animal myLion = new Lion();
		myPig.animalSound();
		myLion.animalSound();
	}

}
