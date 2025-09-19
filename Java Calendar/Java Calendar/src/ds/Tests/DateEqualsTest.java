package ds.Tests;

import ds.Calendar.Date;

public class DateEqualsTest {

	private static void testUnequalDatesYears() {
		Date d1 = new Date(2030, 5, 15);
		Date d2 = new Date(2031, 5, 15);

		String res = d1.equals(d2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Unequal years should return false.");
	}
	
	private static void testUnequalDatesMonths() {
		Date d1 = new Date(2030, 5, 15);
		Date d2 = new Date(2030, 3, 15);

		String res = d1.equals(d2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Unequal months should return false.");
	}
	
	private static void testUnequalDatesDays() {
		Date d1 = new Date(2030, 5, 15);
		Date d2 = new Date(2030, 5, 1);

		String res = d1.equals(d2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Unequal days should return false.");
	}
	
	private static void testEqualDates() {
		Date d1 = new Date(2030, 5, 15);
		Date d2 = new Date(2030, 5, 15);

		String res = d1.equals(d2) ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Equal dates should return true.");
	}
	
	private static void testNonDateObjectsEquals() {
		Date d1 = new Date(2030, 5, 15);
		
		String res = d1.equals("a string") ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Passing a string to equals for Date object should be false");
		
		try {
			res = d1.equals(null) ? "[FAIL] " : "[PASS] ";
			System.out.println(res + "Passing a null to equals for Date object should be false");
		} catch(Exception e) {
			System.out.println("[FAIL] Passing a null to equals for Date object should not generate an exception");
		}
	}
	
	public static void main(String[] args) {
		testUnequalDatesYears();
		testUnequalDatesMonths();
		testUnequalDatesDays();
		testEqualDates();
		testNonDateObjectsEquals();
	}

}
