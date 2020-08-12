package day2.abstractdemo;

 abstract class Bike
{
	public Bike()
	{
		System.out.println("Bike is Started");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear is Changed");
	}
}
 
 class Triumph extends Bike
 {
	 void run()
	 {
		 System.out.println("Triumph bike is running");
	 }
 }
 
 class Ducati extends Bike
 {
	 void run()
	 {
		 System.out.println("Ducati bike is running");
	 }
 }

public class AbstractDemo
{

	public static void main(String[] args) 
	{
	
		Bike bike1 = new Triumph();
		bike1.changeGear();
		bike1.run();
		Bike bike2 = new Ducati();
		bike2.changeGear();
		bike2.run();

	}

}
