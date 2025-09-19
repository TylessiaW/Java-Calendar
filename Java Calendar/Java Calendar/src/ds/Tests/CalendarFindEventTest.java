package ds.Tests;

import ds.Calendar.Calendar;
import ds.Calendar.Date;
import ds.Calendar.Event;

public class CalendarFindEventTest {

	private static Date d = new Date(2035, 10, 3);
	
	private static void testFindEventNotMissing() {
		Calendar c = new Calendar();
		
		Event e1 = new Event(d, 2, 10, "event 1");
		Event e2 = new Event(d, 2, 10, "event 2");
		Event e3 = new Event(d, 2, 10, "event 3");
		
		c.addEvent(e1);
		c.addEvent(e2);
		c.addEvent(e3);
		
		String res = c.findEvent(e1) == 0 ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Found event at index 0");
		
		res = c.findEvent(e2) == 1 ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Found event at index 1");
		
		res = c.findEvent(e3) == 2 ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Found event at index 2");
	}
	
	private static void testFindEventMissing() {
		Calendar c = new Calendar();
		
		Event e1 = new Event(d, 2, 10, "event 1");
		Event e2 = new Event(d, 2, 10, "event 2");
		Event e3 = new Event(d, 2, 10, "event 3");
		
		c.addEvent(e1);
		c.addEvent(e3);
		
		String res = c.findEvent(e2) == -1 ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Event not found. -1 returned.");
	}
	
	public static void main(String[] args) {
		testFindEventNotMissing();
		testFindEventMissing();
	}

}
