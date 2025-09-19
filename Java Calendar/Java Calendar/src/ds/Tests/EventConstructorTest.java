package ds.Tests;

import ds.Calendar.Date;
import ds.Calendar.Event;

public class EventConstructorTest {

	private static Date d1 = new Date(2030, 5, 15);
	
	private static void testStartEndRange() {
		//Start below 0
		try {
			Event e = new Event(d1, -22, 10, "Test");
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Test start less than 0 throws correct exception");
		
		//End greater than 23
		try {
			Event e = new Event(d1, 0, 24, "Test");
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Test end greater than 23 throws correct exception");
		
		//Start and end equal 0
		try {
			Event e = new Event(d1, 0, 0, "Test");
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Test start and end equal 0 throws no exception");
		
		//Start and end equal 23
		try {
			Event e = new Event(d1, 23, 23, "Test");
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Test start and end equal 23 throws no exception");
	}
	
	private static void testStartAfterEnd() {
		try {
			Event e = new Event(d1, 22, 10, "Test");
			System.out.print("[FAIL] ");
		} catch(Exception e) {
			if(!(e instanceof IllegalArgumentException)) {
				System.out.print("[FAIL] ");
			} else {
				System.out.print("[PASS] ");
			}
		}
		System.out.println("Test start greater than end throws correct exception");
	}
	
	private static void testStartEqualEnd() {
		try {
			Event e = new Event(d1, 10, 10, "Test");
			System.out.print("[PASS] ");
		} catch(Exception e) {
			System.out.print("[FAIL] ");
		}
		System.out.println("Test start equals end throws no exception");
	}
	
	public static void main(String[] args) {
		testStartAfterEnd();
		testStartEqualEnd();
		testStartEndRange();
	}

}
