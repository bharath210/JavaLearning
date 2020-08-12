package interviewquetions.converstions;

public class HexToDec
{

	public static void main(String[] args)
	{
		String hex = "1Df5a";
		int decVal = hexToDec(hex);
		System.out.println(decVal);
		
		System.out.println(Integer.parseInt(hex, 16));

	}
	static int hexToDec(String hexVal)
	{
	
		String hexCode = "0123456789abcdef";
		String hex = hexVal.toLowerCase();
		int sum=0;
		int temp = 0;
		for(int i = hex.length()-1; i >= 0; i--)
		{
			char c =hex.charAt(i);
			int digit = hexCode.indexOf(c);

			sum = sum+ (int)(digit*Math.pow(16, temp));
			temp++;
		}
	
		return sum;
	}

}
