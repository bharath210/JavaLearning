package day5.designpatterns;
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
public class DesignPattern1 
{

	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i ; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i ; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 5; j >= i; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) 
		{
			int k = 0;
			for (int j = 5; j >= i; j--) 
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
