package day1.constructordemo;

public class Calc {

	public static void main(String[] args)
	{
		Add obj = new Add();
		Add obj1 = new Add(20);
		System.out.println(obj.num1);
		System.out.println(obj1.num1);

	}

}
