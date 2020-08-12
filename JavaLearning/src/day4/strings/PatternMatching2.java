package day4.strings;

public class PatternMatching2 
{

	public static void main(String[] args)
	{
		String text = "BharathKumar";
		String pattern = "rat";
		int count =0;
		int tlen = text.length();
		int plen = pattern.length();
		char c,p;
		for(int i=0; i<=tlen-plen;i++)
		{
			c= text.charAt(i);
			p = pattern.charAt(0);
			if(p == c)
			{
				for(int j=i,k=0;j<i+plen;j++,k++)
				{
					c=text.charAt(j);
					p=pattern.charAt(k);
					if(p == c)
						count++;
				}
			}
		}
		
		if(count == plen)
			System.out.println("Matched");
		else
			System.out.println("Did not Matched");

	}

}
