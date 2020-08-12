package day4.strings;

import java.util.Scanner;

// concatinating two strings
// finding length of two strings

public class StringsDemo1 
{

	public static void main(String[] args)
	{
		String s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = s1.concat(s2);
		
		System.out.println(s3);//
		System.out.println(s1.length());
		System.out.println(s2.length());;
		
	

	}

}
