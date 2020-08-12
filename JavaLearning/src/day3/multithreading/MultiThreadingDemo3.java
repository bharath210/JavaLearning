package day3.multithreading;

public class MultiThreadingDemo3 {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(()->
						{
							for (int i = 1; i <=5; i++) 
							{
								System.out.println("Hannah");
								try {Thread.sleep(500);} catch (InterruptedException e) {}
							}
						});
		Thread t2 = new Thread(()->
							{
								for (int i = 1; i <=5; i++) 
								{
									System.out.println("Beaker");
									try {Thread.sleep(500);} catch (InterruptedException e) {}
								}
							});
		t1.start();
		t2.start();

	}

}
