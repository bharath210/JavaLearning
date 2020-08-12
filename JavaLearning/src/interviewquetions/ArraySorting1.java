package interviewquetions;
// {4,3,1,6,4,6,4} input
//{4,4,4,3,3,6,6,1} - output based on frequency of numbers
public class ArraySorting1 
{
  static int x=0;
	public static void main(String[] args) 
	{
		
		int a[] = {1,4,3,1,6,4,6,4,3,3,9};
		a= sort(a);

		int b[][]=new int[a.length][2];
		b[x][0] = a[0];
		b[x][1] = 1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i] == a[i-1])
			{
				b[x][1] = b[x][1] +1;
			}
			else
			{
				x++; 
				b[x][0] = a[i];
				b[x][1]=1;

			}		
		}
		x++;
		b=sort(b); 
		
		int arr[] = new int[a.length];
		

		int f =0;
		for (int m = 0; m < x; m++)
		{
			for (int n = 0; n < b[m][1];n++) 
			{
				int z = b[m][0];
				f++;
				for (int i = f; i ==f; i++) 
				{
					arr[i-1] = z;
				}
			}
		}
		for(int y:arr)
		{
			System.out.print(y+" ");
		}
	
	}
	
	
	
	public static int[] sort(int p[])

	{
		for(int i=0;i<p.length;i++)
		{
			for (int j = i+1; j < p.length; j++) 
			{
				int temp;
				if(p[i]>p[j])
				{
					temp =p[i];
					p[i]=p[j];
					p[j]=temp;
					
				}
			}
		}
		return p;
	}
	public static int[][] sort(int q[][])
	{
		int c[]= new int[2];
		for (int i = 0; i < x; i++) 
		{
			for (int j = i+1; j < x; j++)
			{
				if(q[i][1]<q[j][1])
				{
					c = q[i];
					q[i]=q[j];
					q[j] =c;
				}
			}
		} 
		return q;
	}
}
