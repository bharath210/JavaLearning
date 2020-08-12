package day2.example;
// Anonymous class with interfaces

interface Abc
{
	void show();
}

public class AnonymousClassDemo2 {

	public static void main(String[] args) 
	{
		Abc a = new Abc() {
										public void show()
										{
											System.out.println("Showing");
										}
										
									};
			a.show();
	}

}
