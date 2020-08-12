package day1.innerclassdemo;

public class OuterClass 
{
	void show()
	{
		System.out.println("In Outer Class");
	}
	class InnerClass
	{
		void show()
		{
			System.out.println("In Inner Class");
		}
	}
	static class StaticInnerClass
	{
		void show()
		{
			System.out.println("In Static Inner Class");
		}
	}

}
