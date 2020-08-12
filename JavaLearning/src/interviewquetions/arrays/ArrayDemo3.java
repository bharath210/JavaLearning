package interviewquetions.arrays;
//Left rotating the elements of an array
public class ArrayDemo3 
{

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6};
		int n =2;
		for(int j =0; j<n;j++)
		{
			int i =0;
			int first = a[0];
			for (i = 0; i < a.length-1; i++) 
			{
				a[i] = a[i+1];
			}
			a[i] = first;
		}
		
		for(int k:a)
		{
			System.out.print(k+"  ");
		}

	}

}
