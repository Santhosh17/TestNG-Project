package com.auto.dateFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateFormatter {
	@Test
	public void dateFormat() throws ParseException {
		String d = "13/12/2019";
		
		Date d1 = new Date();
		System.out.println(d1);
		
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Date formattedDate = sd.parse(d);
		System.out.println(formattedDate);
		
		String day = new SimpleDateFormat("d").format(formattedDate);
		System.out.println(day);
		
		String dayDoubleDigit = new SimpleDateFormat("dd").format(formattedDate);
		System.out.println(dayDoubleDigit);
		
		String monthInNumberFormatSingleDigit = new SimpleDateFormat("M").format(formattedDate);
		System.out.println(monthInNumberFormatSingleDigit);
		
		String monthInNumberFormatDoubleDigit = new SimpleDateFormat("MM").format(formattedDate);
		System.out.println(monthInNumberFormatDoubleDigit);
		
		String monthInShortFormat = new SimpleDateFormat("MMM").format(formattedDate);
		System.out.println(monthInShortFormat);
		
		String monthInFullLengthFormat = new SimpleDateFormat("MMMM").format(formattedDate);
		System.out.println(monthInFullLengthFormat);
		
		String yearInShortFormat = new SimpleDateFormat("yy").format(formattedDate);
		System.out.println(yearInShortFormat);
		
		String yearInFullLengthFormat = new SimpleDateFormat("yyyy").format(formattedDate);
		System.out.println(yearInFullLengthFormat);
		
		System.out.println(formattedDate);
	}
}
