package day3.enumdemo;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

enum WeekDay
{
	SUNDAY,MONDAY,TUESEDAY,WEDNESSDAY,THURSEDAY,FRIDAY,SATURDAY;
}
public class EnumMapDemo 
{

	public static void main(String[] args) 
	{
		EnumMap<WeekDay, String> days =new EnumMap<WeekDay, String>(WeekDay.class);
		days.put(WeekDay.SUNDAY, "1");
		days.put(WeekDay.MONDAY, "2");
		days.put(WeekDay.TUESEDAY, "3");
		days.put(WeekDay.WEDNESSDAY, "4");
		days.put(WeekDay.THURSEDAY, "5");
		days.put(WeekDay.FRIDAY, "6");
		days.put(WeekDay.SATURDAY, "7");
		
		System.out.println(WeekDay.MONDAY);
		for(Map.Entry m:days.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
	}

}
