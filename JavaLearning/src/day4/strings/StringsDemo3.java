package day4.strings;

public class StringsDemo3 
{

	public static void main(String[] args) 
	{
		String name = "Jon,Sansa,Arya,Robb";
		String names[] = name.split(",");
		for(String a:names)
		{
			System.out.println(a);
		}

	}

}
