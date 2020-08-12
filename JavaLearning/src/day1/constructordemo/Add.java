package day1.constructordemo;

public class Add
{
	int num1;
	int num2;
	int result;

	
	public Add()
	{
		num1 = 5;
		num2 = 20;
		System.out.println("In construction");
	}
	public Add(int a)
	{
		num1 = a;
	}

}
