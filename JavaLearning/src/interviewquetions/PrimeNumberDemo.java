package interviewquetions;

import java.util.Scanner;

public class PrimeNumberDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean res =isPrime(num);
		if(res)
		{
			System.out.println("Given number is prime");
		}else
		{
			System.out.println("Given number is not a prime number");
		}
		
		
		System.out.println("Enter the range");
		int num1 = sc.nextInt();
		int num2  = sc.nextInt();
		for (int i = num1; i <= num2; i++)
		{
			boolean result = isPrime(i);
				if(result)
					System.out.print(i+" ");
		}


	}
	static boolean isPrime(int n)
	{
		boolean flag = true;
		int m =n/2;
		for(int i =2; i < n;i++)
		{
			if(n%i == 0) 
			{
				flag = false;	
				break;
			}
		}
		return flag;
	}

}
