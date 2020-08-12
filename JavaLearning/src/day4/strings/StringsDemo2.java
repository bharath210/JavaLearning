package day4.strings;

class Student
{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return  rollNo+ " "+name;
	}
	
	
	
}
public class StringsDemo2 
{

	public static void main(String[] args) 
	{
		Student s1  = new Student(2, "Jon Snow");
		System.out.println(s1);
	}

}
