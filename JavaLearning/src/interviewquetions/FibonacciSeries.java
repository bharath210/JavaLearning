package interviewquetions;

import java.util.Scanner;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
		
		
		System.out.println();   
		int fib=0;                      // code for printing fibonacci series upto a number 
			for (int i = 1; i <= n; i++)
			{
				fib = fibonacci(i);
				if(fib>n)
					break;
			
				System.out.print(fib+" ");
			
			}
			
//			System.out.println();
//			int t1 =0;
//			int t2 = 1;
//			int sum = 0;
//			for (int i = 1; i <= n; i++)
//			{
//				sum = t1+t2;
//				t1=t2;
//				t2=sum;
//				System.out.print(sum+ " ");
//			}
			
			
		}
	
	static int fibonacci(int n)
	{
		if(n == 1|| n == 2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);

	}

}
