package day3.multithreading;
// Multi Threading using Runnable interface 

class Jon implements Runnable
{
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("Jon");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class Snow implements Runnable
{
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println("Snow");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class MultiThreadingDemo2 
{
	public static void main(String[] args) 
	{
		Runnable obj1 = new Jon();
		Runnable obj2 = new Snow();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
	}
}
