package interviewquetions.arrays;
// remove duplicate numbers from an array
public class ArrayDemo7 {

	public static void main(String[] args) 
	{
		int a[] = {1, 6, 6,8, 3, 2, 2, 2, 5, 1};
		a = sort(a);
		int k =0;
		int b[] = new int[a.length];
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i] != a[i+1])
			{
				b[k] = a[i];
				k++;
			}
		}
		
		for (int i = 0; i < b.length; i++)
		{
			a[i] = b[i];
		}
		
		for(int m:b)
		{
			System.out.print(m+"  ");
		}
	}
	static int[] sort(int n[])
	{
		for (int i = 0; i < n.length; i++)
		{
			int temp=0;
			for (int j = i+1; j < n.length; j++)
			{
				if(n[i]>n[j])
				{
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		return n;
	}

}
