package day2.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println("Enter your name and number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
		String name = br.readLine();
		System.out.println(name);
		
	}

}
