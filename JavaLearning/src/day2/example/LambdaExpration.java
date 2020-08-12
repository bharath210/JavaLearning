package day2.example;

interface Print
{
	void show();
}

public class LambdaExpration 
{

	public static void main(String[] args) 
	{
		Print p = () -> System.out.println("Lambda Expration");
		p.show();

	}

}
