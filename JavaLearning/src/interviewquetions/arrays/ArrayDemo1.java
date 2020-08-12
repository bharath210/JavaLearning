package interviewquetions.arrays;
// copying the elements from one array to another
public class ArrayDemo1 
{

	public static void main(String[] args) 
	{
		int a[] = {5,8,8,9,1,66,87};
		int b[]= new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		for(int k : b)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		//printing the array in reverse order
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
