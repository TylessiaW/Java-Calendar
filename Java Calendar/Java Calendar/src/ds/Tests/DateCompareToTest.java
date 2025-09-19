package ds.Tests;

import ds.Calendar.Date;

public class DateCompareToTest {

	private static void testComparableYearNegative() {
		Date d1 = new Date(2023, 5, 15);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) < 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with year less than argument from compareTo");
	}
	
	private static void testComparableYearPositive() {
		Date d1 = new Date(2025, 5, 15);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) > 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with year greater than argument from compareTo");
	}
	
	private static void testComparableMonthNegative() {
		Date d1 = new Date(2024, 3, 15);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) < 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with month less than argument from compareTo");
	}
	
	private static void testComparableMonthPositive() {
		Date d1 = new Date(2024, 7, 15);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) > 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with month greater than argument from compareTo");
	}
	
	private static void testComparableDayNegative() {
		Date d1 = new Date(2024, 5, 10);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) < 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with day less than argument from compareTo");
	}
	
	private static void testComparableDayPositive() {
		Date d1 = new Date(2024, 5, 16);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) > 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date with day greater than argument from compareTo");
	}
	
	private static void testComparableSame() {
		Date d1 = new Date(2024, 5, 15);
		Date d2 = new Date(2024, 5, 15);
		
		String res = "";
		if(d1.compareTo(d2) == 0) {
			res = "[PASS] ";
		} else {
			res = "[FAIL] ";
		}
		
		System.out.println(res + "Calling Date same as argument from compareTo");
	}
	
	public static void main(String[] args) {
		testComparableYearNegative();
		testComparableYearPositive();
		testComparableMonthNegative();
		testComparableMonthPositive();
		testComparableDayNegative();
		testComparableDayPositive();
		testComparableSame();
	}

}
