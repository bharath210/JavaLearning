package day3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// we can sort elements based on our logic
public class ComparatorDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<Integer>();
		values.add(286);
		values.add(352);
		values.add(164);
		values.add(219);
		values.add(327);
		
		Comparator< Integer> c = (Integer a, Integer b) ->
														{
															if(a%10>b%10)
																return 1;
																else
																	return -1;
														};
		//Comparator< Integer> c = (a,b) -> a%10>b%10 ? 1 : -1;
		
		Collections.sort(values, c);
		
		
		for(Integer i : values)
		{
			System.out.println(i);
		}

	}

}
