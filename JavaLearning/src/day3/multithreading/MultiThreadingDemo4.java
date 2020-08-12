package day3.multithreading;

public class MultiThreadingDemo4
{

	public static void main(String[] args) throws InterruptedException
	{
				Thread t1 = new Thread(()->
				{
					for (int i = 1; i <=5; i++) 
					{
						System.out.println("Selena");
						try {Thread.sleep(500);} catch (InterruptedException e) {}
					}
				});
		Thread t2 = new Thread(()->
					{
						for (int i = 1; i <=5; i++) 
						{
							System.out.println("Gomez");
							try {Thread.sleep(500);} catch (InterruptedException e) {}
						}
					});
		
		t1.start();
		t2.start();
		
		System.out.println("Thread Status "+t1.isAlive());
		System.out.println(t1.getName());
		t1.setName("Selena Thread");
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.join();
		t2.join();
	
		System.out.println("Camila Cebello");
		
		System.out.println("Thread Status "+t1.isAlive());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());



	}

}
