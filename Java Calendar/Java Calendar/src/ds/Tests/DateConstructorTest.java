package ds.Tests;

import ds.Calendar.Date;

public class DateConstructorTest {

	private static void testYear() {
		//Test year out of range below 2021
		try {
			Date d = new Date(2019, 5, 15);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid year 2019");
		
		//Test year out of range above 2080
		try {
			Date d = new Date(2089, 5, 15);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid year 2089");
		
		//Test year in range
		try {
			for(int y = 2021; y <= 2080; y+= 1) {
				Date d = new Date(y, 5, 15);
			}
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Years 2021 through 2080 do not throw an exception");
	}
	
	private static void testMonth() {
		//Test month out of range below 1
		try {
			Date d = new Date(2030, 0, 15);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid month 0");
		
		//Test month out of range above 12
		try {
			Date d = new Date(2030, 15, 15);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid month 15");
		
		//Test year in range
		try {
			for(int m = 1; m <= 12; m+= 1) {
				Date d = new Date(2030, m, 15);
			}
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Months 1 through 12 do not throw an exception");
	}
	
	private static void testDay() {
		//Test day out of range below 1
		try {
			Date d = new Date(2030, 2, 0);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid day 0");
		
		//Test day out of range above 31
		try {
			Date d = new Date(2030, 5, 35);
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Throw correct exception for invalid day 35");
		
		//Test year in range
		try {
			for(int d = 1; d <= 31; d+= 1) {
				Date dt = new Date(2030, 5, d);
			}
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Days 1 through 31 do not throw an exception");
	}
	
	public static void main(String[] args) {
		testYear();
		testMonth();
		testDay();
	}

}
