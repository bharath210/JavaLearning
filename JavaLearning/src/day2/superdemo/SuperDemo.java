package day2.superdemo;

class Animal
{
	String clr = "Black";
	public Animal()
	{
		System.out.println("In Animal Constructor");
	}
	public Animal(int a)
	{
		System.out.println("In 2 Animals Constructor");
	}
	void eat()
	{
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal
{
	String clr = "Red";
	public Dog()
	{
		System.out.println("In Dog Constructor");
	}
	public Dog(int a)
	{
		super(); //super can be used to refer parent class constructor
		System.out.println("In 2 Dogs Constructor");
	}
	
	void showColor()
	{
		System.out.println(clr+" is the color of Dog");
		System.out.println(super.clr+" is the color of Animal"); // super can be used refer parent class variable
	}
	void work()
	{
		System.out.println("Dog is sleeping");
	    super.eat();
	}
}



public class SuperDemo
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog(5);
		d1.showColor();
		d1.work();
	}
	

}
