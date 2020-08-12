package day1.object;

public class Calc
{

	public static void main(String[] args) 
	{
		Add obj = new Add();
		obj.num1=20;
		obj.num2=30;
		obj.perform();
		
		System.out.println(obj.result);

	}

}
