package interviewquetions.converstions;

public class DecToHex {

	public static void main(String[] args) 
	{
		String value = toHex(7653);
		System.out.println(value);
		
		System.out.println(Integer.toHexString(7653));

	}
	static String toHex(int dec)
	{
		int rem;
		char temp[] = new char[40];
		char[] val = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int n=0;
		while(dec>0)
		{
			rem = dec%16;
			temp[n] = val[rem];
			n++;
			dec = dec/16;
		}
		String hexDecimal = "";
		for (int i = n-1; i >= 0; i--)
		{
			hexDecimal=hexDecimal+temp[i];
		}
		return hexDecimal;
	}

}
