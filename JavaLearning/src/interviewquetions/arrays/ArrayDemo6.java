package interviewquetions.arrays;
// Largest value of array
public class ArrayDemo6 
{

	public static void main(String[] args) 
	{
		int a[] = {24,28,9,47,98,25};
		int ref =a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>ref)
				ref = a[i];
		
		}
		System.out.println(ref);
		
		for (int i = 0; i < a.length; i++)  // smallest value
		{
			if(a[i]<ref)
				ref = a[i];
		
		}
		System.out.println(ref);

	}

}
