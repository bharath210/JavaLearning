package day3.multithreading;
// Multi Threading using Thread class
class Bharath extends Thread
{
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("Bharath");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class Kumar extends Thread
{
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("Kumar");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class MultiThreadingDemo1 
{

	public static void main(String[] args) 
	{
		Bharath obj1 = new Bharath();
		Kumar obj2 = new Kumar();
		obj1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		obj2.start();
	}

}
