package day4.strings;

public class StringBufferDemo 
{

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Bharath");
		str.append(" Kumar");
		
		System.out.println(str);
		str.insert(7, 'p');
		System.out.println(str);
		str.deleteCharAt(7);
		System.out.println(str);
		str.replace(8, 11, "goud");
		System.out.println(str);

	}

}
