package interviewquetions;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean res =isArmstrong(num);
		if(res)
		{
			System.out.println("Given number is Armstrong");
		}else
		{
			System.out.println("Given number is not a Armstrong number");
		}

	}
	static boolean isArmstrong(int n)
	{
		int rem=0,sum=0;
		int num=n;
		while(num>0)
		{
			rem = num%10;
			sum = (int) ((int) sum + Math.pow(rem, 3));
			num = num/10;
		}
		if(sum == n)
			return true;
		else
			return false;
		
	}

}
