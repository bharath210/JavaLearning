package day5.designpatterns;
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

public class DesignPattern4 {

	public static void main(String[] args)
	{
		for(int i=1; i<=9;i++)
		{
			for (int j = 1; j <= i;j++)
			{
				if(i+j>10)
					break;
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
