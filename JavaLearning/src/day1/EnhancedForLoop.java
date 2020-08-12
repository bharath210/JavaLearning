package day1;

public class EnhancedForLoop {

	public static void main(String[] args) 
	{
		int a[] = {5,8,87,87};
		int b[] []= {
								{84,82,68,68,94}, 
								{9,3,8,4,65},
								{9,6,8,2,7,6,8}
				};
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ "  ");
			
		}
		System.out.println();
		
		for(int n[] : b)
		{
			for(int m: n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}

}
