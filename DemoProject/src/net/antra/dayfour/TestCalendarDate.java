package net.antra.dayfour;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendarDate {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);
		
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, -45);
		System.out.println(cal.getTime());
	}
}
