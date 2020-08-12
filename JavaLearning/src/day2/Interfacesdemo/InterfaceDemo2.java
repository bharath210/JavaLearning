package day2.Interfacesdemo;

interface Demo
{
	void show();
	default void doSometing()
	{
		System.out.println("In Demo Interface do something");
	}
}

class Abc implements Demo
{
	public void show()
	{
		System.out.println("In Class Abc Show");
	}
	public void doSometing()
	{
		System.out.println("In class Abc do something");
	}
}
public class InterfaceDemo2
{

	public static void main(String[] args) 
	{
		Demo obj = new Abc();
		obj.doSometing();
		obj.show();

	}

}
