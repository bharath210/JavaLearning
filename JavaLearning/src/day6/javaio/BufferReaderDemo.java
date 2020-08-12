package day6.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Strings");
		String str1 = br.readLine();
		String str2 = br.readLine();
		System.out.println(str1);
		System.out.println(str2);

	}

}
