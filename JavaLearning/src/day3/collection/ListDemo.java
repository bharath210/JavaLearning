package day3.collection;


import java.util.ArrayList;
import java.util.List;

public class ListDemo
{

	public static void main(String[] args)
	{
		List values = new ArrayList();
		values.add(10);
		values.add(20);
		values.add(40);
		values.add(2, 30);
		
		for(int i = 0; i< values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		
	}

}
