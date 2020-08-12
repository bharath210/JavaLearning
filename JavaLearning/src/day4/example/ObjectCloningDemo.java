package day4.example;
class Students implements Cloneable
{
	int rollNo;
	String name;
	public Students(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}

public class ObjectCloningDemo 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Students s1 = new Students(1, "Alex");
		System.out.println(s1);
		
		Students s2 = (Students)s1.clone();
		
		System.out.println(s2);
		s2.rollNo =2;
		System.out.println(s2);

	}

}
