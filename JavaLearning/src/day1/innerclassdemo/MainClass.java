package day1.innerclassdemo;

public class MainClass {

	public static void main(String[] args) 
	{
		OuterClass obj1 = new OuterClass();
		obj1.show();
		OuterClass.InnerClass obj2 = obj1.new InnerClass();
		obj2.show();
		OuterClass.StaticInnerClass obj3 = new OuterClass.StaticInnerClass();
		obj3.show();
			

	}

}
