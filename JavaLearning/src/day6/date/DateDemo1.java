package day6.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//Local date and time

public class DateDemo1 {

	public static void main(String[] args) 
	{
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDate yesterday = ld.minusDays(1);
		System.out.println(yesterday);
		LocalDateTime ldt = ld.atTime(lt);
		System.out.println(ldt);
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfYear());
		System.out.println(ldt.getHour());
		
		
		LocalDate date1 = LocalDate.of(1997, 3, 27);
		System.out.println(date1);
		LocalDateTime ldt2 = ld.atTime(lt);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(ldt2.format(formatter)+" "+ldt2.getDayOfWeek());

	}

}
