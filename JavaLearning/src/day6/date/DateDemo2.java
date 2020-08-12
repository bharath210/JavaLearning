package day6.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo2 {

	public static void main(String[] args) 
	{
		Date date1 = new Date();
		SimpleDateFormat frmt  = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		String dt = frmt.format(date1);
		System.out.println(dt);
		
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz.getDisplayName());
		

		
	}

}
