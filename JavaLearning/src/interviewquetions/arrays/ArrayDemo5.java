package interviewquetions.arrays;
// printing the values of an array from even position
public class ArrayDemo5 
{

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6,7,8};
		
		for (int i = 1; i < a.length; i=i+2) //even position
		{
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i=i+2) //odd position
		{
			System.out.println(a[i]);
		}
	}

}
