package interviewquetions;

import java.util.Scanner;

public class PalindromeNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean res =isPalindrome(num);
		if(res)
		{
			System.out.println("Given number is Palindrome");
		}else
		{
			System.out.println("Given number is not a Palindrome number");
		}
	}
	static boolean isPalindrome(int n)
	{
		int rem,temp = 0;
		int num =n;
		while(num>0)
		{
	
			rem = num%10;
			temp = (temp *10)+rem;
			num = num/10;
		}
		if(temp == n)
			return true;
		else
			return false;
	}

}
