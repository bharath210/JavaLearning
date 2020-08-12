package day1;

public class BitwiseOperators
{

	public static void main(String[] args)
	{
		int a = 27;			  // 1 1 0 1 1
		int b = 22;			  // 1 0 1 1 0
		int c = a & b;       //  1 0 0 1 0
		int d = a | b;        //  1 1 1 1 1
		
		int e = a<<3;
		int f = a >> 2;
		
		System.out.println(f);

	}

}
