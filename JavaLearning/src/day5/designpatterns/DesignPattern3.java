package day5.designpatterns;
 //            5
//          4 5
//      3  4 5
//    2 3 4 5           
// 1 2 3 4 5  
public class DesignPattern3 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if(5-j>=i)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++)
		{
			for (int k = 4; k >= i; k--)
			{
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
