package day2.example;

class Printer
{
	void status()
	{
		System.out.println("Working");
	}
}

public class AnonymousClassDemo 
{

	public static void main(String[] args)
	{
		Printer p =new Printer() {
														void status()
														{
															System.out.println("Damaged");
														}
														
													};
				p.status();

	}

}
