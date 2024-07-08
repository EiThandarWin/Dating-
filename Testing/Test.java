package Testing;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Utilities.GeneralUtilities;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		GeneralUtilities g = new GeneralUtilities();
		Scanner i = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
		System.out.print("Enter your BOD : ");
		String ds = i.nextLine();
		Date d = (Date) formatter.parse(ds);
		System.out.println("Your sign is "+g.getZodiacSign(d));
		
	}

}
