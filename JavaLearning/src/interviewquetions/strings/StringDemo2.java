package interviewquetions.strings;
//counting the number of Vowels and constants in String
public class StringDemo2
{

	public static void main(String[] args)
	{
		String str = "My name is Bharath kumar";
		str =str.toLowerCase();
		int vCount = 0;
		int cCount =0;
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				vCount++;
			else if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
				cCount++;
		}
		System.out.println(vCount);
		System.out.println(cCount);

	}

}
