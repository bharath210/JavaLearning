package day2.example;

public class WrapperClassDemo 
{

	public static void main(String[] args) 
	{
		int a = 10;  //Primitive data
		int b = 20;
		Integer k = new Integer(a); //Boxing or wrapping
		int j = k.intValue();   // Unboxing or unwrapping
		
		Integer m = b; // auto wrapping 
		int n = m;  //auto unwrapping
		
		System.out.println(k);
		System.out.println(n);
		
		String str = "12345";
		int i = Integer.parseInt(str);
		System.out.println(i);

	}

}
