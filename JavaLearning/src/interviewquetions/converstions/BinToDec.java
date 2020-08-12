package interviewquetions.converstions;

public class BinToDec {

	public static void main(String[] args) 
	{
		String bin = "10110";
		int decVal = binToDec(bin);
		System.out.println(decVal);
		
		System.out.println(Integer.parseInt(bin, 2));

	}
	static int binToDec(String binary)
	{
		int num = Integer.parseInt(binary);
		int sum=0;
		int rem =0;
		int temp = 0;
		while(num>0)
		{
			rem = num%10;
			sum = sum+ (int)(rem*Math.pow(2, temp));
			temp++;
			num = num/10;
		}
		return sum;
	}

}
