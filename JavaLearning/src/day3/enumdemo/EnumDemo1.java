package day3.enumdemo;

enum Seasons
{
	WINTER,SUMMER,SPRING,FALL
}
public class EnumDemo1
{

	public static void main(String[] args)
	{
				System.out.println(Seasons.SUMMER);
				
				for(Seasons s : Seasons.values())
				{
					System.out.println(s);
				}
				System.out.println(Seasons.valueOf("SUMMER"));
				System.out.println(Seasons.valueOf("FALL").ordinal());
				
	}

}
