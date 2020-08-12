package day3.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String, String> values = new HashMap<String, String>();
		values.put("King", "John Snow");
		values.put("Queen", "Sansa");
		values.put("Villian", "White Walkers");
		
		System.out.println(values.get("Queen"));
		
		Set<String> keys = values.keySet();
		for(String s:keys)
		{
			System.out.println(s+" "+values.get(s));
		}
		

	}

}
