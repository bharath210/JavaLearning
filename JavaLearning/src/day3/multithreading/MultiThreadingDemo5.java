package day3.multithreading;
// Synchronizing the Threads

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class MultiThreadingDemo5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Counter c = new Counter();
		Thread t1 = new Thread(()->
				{
					for(int i =1; i<=1000;i++ )
					{
						c.increment();
					}
				});
		Thread t2 = new Thread(()->
							{
								for(int i =1; i<=1000;i++ )
								{
									c.increment();
								}
							});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The count value is "+c.count);
	}

}
