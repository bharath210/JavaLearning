package day4.strings;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args) 
	{
		String str,rev = "";
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		for (int i = str.length()-1; i>=0;i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

}
