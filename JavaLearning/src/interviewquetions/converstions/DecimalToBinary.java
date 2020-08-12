package interviewquetions.converstions;

public class DecimalToBinary 
{

	public static void main(String[] args) 
	{
		String value = toBinary(25);
		System.out.println(value);
		
		System.out.println(Integer.toBinaryString(67));

	}
	static String toBinary(int dec)
	{
		int rem;
		int bin[] = new int[40];
		int temp=0;
		while(dec>0)
		{
			rem = dec%2;
			bin[temp] = rem;
			temp++;
			dec = dec/2;
		}
		String binary = "";
		for (int i = temp-1; i >= 0; i--)
		{
			binary=binary+bin[i];
		}
		return binary;
	}

}
