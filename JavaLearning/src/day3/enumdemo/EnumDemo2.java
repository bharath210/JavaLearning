package day3.enumdemo;

public class EnumDemo2
{
enum Days
{
	SUNDAY(1),MONDAY(2),TUESEDAY(3),WEDNESSDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	int value;
	Days(int i)
	{
		value = i;
	}
}
	public static void main(String[] args) 
	{
		Days d1 = Days.SUNDAY;
		Days d2 = Days.MONDAY;
		System.out.println(d1);
		
		System.out.println(d2.value);
		
		for(Days d: Days.values())
		{
			System.out.println("The value of"+d+" is "+ d.value);
		}
	}

}
