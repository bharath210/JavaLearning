package interviewquetions.strings;
// counting the number of characters 
public class StringDemo1 {

	public static void main(String[] args) 
	{
		String str = "My name is Bharath kumar";
		int count =0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				count++;
		}
		System.out.println(count);
		System.out.println(str.length());

	}

}
