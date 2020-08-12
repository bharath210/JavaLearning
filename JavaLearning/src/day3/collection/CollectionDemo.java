package day3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(28);
		values.add(35);
		values.add(16);
		values.add(21);
		values.add(32);
		Collections.sort(values);
		Collections.reverse(values);
		
		for(Integer i : values)
		{
			System.out.println(i);
		}

	}

}
