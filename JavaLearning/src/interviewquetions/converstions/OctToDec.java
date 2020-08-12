package interviewquetions.converstions;

public class OctToDec {

	public static void main(String[] args)
	{
		String oct = "424652";
		int decVal = octToDec(oct);
		System.out.println(decVal);
		
		System.out.println(Integer.parseInt(oct, 8));

	}
	static int octToDec(String octal)
	{
		int num = Integer.parseInt(octal);
		int sum=0;
		int rem =0;
		int temp = 0;
		while(num>0)
		{
			rem = num%10;
			sum = sum+ (int)(rem*Math.pow(8, temp));
			temp++;
			num = num/10;
		}
		return sum;
	}

}
