package day2.Interfacesdemo;

interface Bike
{
	void changeGear();
	public static void start()
	{
		System.out.println("bike is Started");
	}
	public static void stop()
	{
		System.out.println("bike is stopped");
	}
}

public class InterfaceDemo3 
{

	public static void main(String[] args) {
		Bike.start();
		Bike.stop();

	}

}
