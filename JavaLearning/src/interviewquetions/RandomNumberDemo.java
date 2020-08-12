package interviewquetions;

import java.util.Random;

public class RandomNumberDemo 
{

	public static void main(String[] args)
	{
		double a = Math.random();
		System.out.println(a); //0 below 1
		System.out.println(a*10);// 0 to 10
		System.out.println(a*100);  // 0 to 100
		
		int min = 100;
		int max = 500;
		double b = Math.random()*(max-min+1)+min;
		System.out.println(b);
		
		// we can generate random number using Random class
		
		Random rd = new Random();
		int c = rd.nextInt();
		boolean d = rd.nextBoolean();
		double e = rd.nextDouble();
		float f = rd.nextFloat();
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		int g = rd.nextInt(600); // range 0 to 600
		
		System.out.println(g);

	}

}
