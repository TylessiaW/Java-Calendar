package ds.Tests;

import ds.Calendar.Date;

public class DateToStringTest {
	public static void main(String[] args) {
		Date d = new Date(2030, 5, 15);
		String expected = "5/15/2030";
		System.out.println("Should return " + expected);
		System.out.println("Your toString method returns " + d);
	}

}
