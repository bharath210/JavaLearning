package day4.strings;

public class PatternMatching1 {

	public static void main(String[] args) 
	{
		String text = "BharathKumar";
		String pattern = "rat";
		
		if(text.contains(pattern))
			System.out.println("Matched");
		else
			System.out.println("Did not matched");

	}

}
