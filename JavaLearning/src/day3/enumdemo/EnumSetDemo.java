package day3.enumdemo;

import java.util.EnumSet;
import java.util.Iterator;

enum Colors
{
	RED,GREEN,BLUE,YELLOW,CYAN,MRGRNTA;
}
public class EnumSetDemo
{

	public static void main(String[] args) 
	{
		EnumSet clr = EnumSet.of(Colors.RED, Colors.GREEN);
		
		Iterator it = clr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		EnumSet clr2 = EnumSet.allOf(Colors.class);
		
		Iterator it2 = clr2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}

	}

}
