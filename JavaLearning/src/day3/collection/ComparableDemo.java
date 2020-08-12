package day3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int rollNo,marks;
	String name;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Student s)
	{
		return rollNo>s.rollNo ? 1 : -1;
	}
	
}

public class ComparableDemo
{

	public static void main(String[] args) 
	{
		Student std1 = new Student(2, "John", 64);
		Student std2 = new Student(7, "Sansa", 93);
		Student std3 = new Student(4, "Arya", 83);
		Student std4 = new Student(6, "Robb", 78);
		
		List<Student> studs = new ArrayList<Student>();
		studs.add(std1);
		studs.add(std2);
		studs.add(std3);
		studs.add(std4);
		Collections.sort(studs);
		System.out.println(studs.get(3).toString());
		
		for(Student s:studs)
		{
			System.out.println(s);
		}

	}

}
