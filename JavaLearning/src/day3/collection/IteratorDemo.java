package day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo
{

	public static void main(String[] args) 
	{
		Collection values = new ArrayList();
		values.add(20);
		values.add(45);
		values.add(23);
		values.add(74);
		System.out.println(values);
		Iterator it = values.iterator();
		//System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
