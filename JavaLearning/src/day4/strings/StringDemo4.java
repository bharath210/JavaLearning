package day4.strings;
// remove letters from string = 654@@wsd7asdf7ad25
//48-57

public class StringDemo4 
{
	public static String convert(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i <sb.length(); i++) 
		{
			if(sb.charAt(i)<48 || sb.charAt(i)>57)
			{
				sb = sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();	
	}

	public static void main(String[] args) 
	{
		String str = "654wsd7asdf7ad25";
		String str2 = convert(str);
		System.out.println(str2);
		

	}

}
