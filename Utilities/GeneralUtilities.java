package Utilities;

import java.util.Date;
import java.util.Calendar;

public class GeneralUtilities {
	
	public static String getZodiacSign(Date date) {
		  if (date == null) {
		    throw new IllegalArgumentException("Invalid date provided");
		  }

		  Calendar calendar = Calendar.getInstance();
		  calendar.setTime(date);
		  int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-indexed
		  int day = calendar.get(Calendar.DAY_OF_MONTH);

		  if (month == 1) {
		    return (day >= 20) ? "Aquarius" : "Capricorn";
		  } else if (month == 2) {
		    return (day >= 19) ? "Pisces" : "Aquarius";
		  } else if (month == 3) {
		    return (day >= 21) ? "Aries" : "Pisces";
		  } else if (month == 4) {
		    return (day >= 20) ? "Taurus" : "Aries";
		  } else if (month == 5) {
		    return (day >= 21) ? "Gemini" : "Taurus";
		  } else if (month == 6) {
		    return (day >= 21) ? "Cancer" : "Gemini";
		  } else if (month == 7) {
		    return (day >= 23) ? "Leo" : "Cancer";
		  } else if (month == 8) {
		    return (day >= 23) ? "Virgo" : "Leo";
		  } else if (month == 9) {
		    return (day >= 23) ? "Libra" : "Virgo";
		  } else if (month == 10) {
		    return (day >= 23) ? "Scorpio" : "Libra";
		  } else if (month == 11) {
		    return (day >= 22) ? "Sagittarius" : "Scorpio";
		  } else if (month == 12) {
		    return (day < 22) ? "Sagittarius" : "Capricorn";
		  } else {
		    throw new IllegalArgumentException("Invalid month from date");
		  }
		}

	
}
