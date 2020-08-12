package interviewquetions;

public class ASCIIDemo 
{

	public static void main(String[] args)
	{
		char c1 = 'a';
		char c2 = '$';
		int i1 = c1;
		int i2 = 'A';
		int i3 = (int)c2;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		for (int i = 46; i <= 57; i++) 
		{
			System.out.println("the valueof "+i+"is "+(char)i);
		}

	}

}
