package interviewquetions.strings;

import java.util.Arrays;

//Determining the strings are Anagram
// two Stings are called if they have same characters, order can be different

public class StringDemo3
{

	public static void main(String[] args) 
	{
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
	
		if(str1.length() != str2.length())
		{
			System.out.println("Both strings are not Anagram");
		}
		else
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Both strings are Anagram");
			}else
			{
				System.out.println("Both strings are not Anagram");
			}
		}

	}

}
