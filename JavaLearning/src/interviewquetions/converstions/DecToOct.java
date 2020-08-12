package interviewquetions.converstions;

public class DecToOct {

	public static void main(String[] args)
	{
		String value = toOctal(883);
		System.out.println(value);
		
		System.out.println(Integer.toOctalString(569));
	}
	static String toOctal(int dec)
	{
		int rem;
		int oct[] = new int[40];
		int temp=0;
		while(dec>0)
		{
			rem = dec%8;
			oct[temp] = rem;
			temp++;
			dec = dec/8;
		}
		String octal = "";
		for (int i = temp-1; i >= 0; i--)
		{
			octal=octal+oct[i];
		}
		return octal;
	}

}
