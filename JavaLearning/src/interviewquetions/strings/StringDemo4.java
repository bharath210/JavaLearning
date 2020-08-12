package interviewquetions.strings;
//Dividing the String into N equal parts
public class StringDemo4 
{

	public static void main(String[] args)
	{
		String str  = "abcabcabc";
		int n = 3;
		int len  = str.length();
		int chars= len/n; // no of  characters in string
		String sub[] = new String[n];
		int temp=0;
		if(len%n != 0)
		{
			System.out.println("Given String cannot be divided");
		}else
		{
			for (int j = 0; j < str.length(); j=j+chars)
			{			
				String part = str.substring(j,j+chars);
				sub[temp] = part;
				temp++;
				
			}
			for (int i = 0; i < sub.length; i++) 
			{
				System.out.println(sub[i]);
			}
		}
		

	}

}
