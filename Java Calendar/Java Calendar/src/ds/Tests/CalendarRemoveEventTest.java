package ds.Tests;

import ds.Calendar.Calendar;
import ds.Calendar.Date;
import ds.Calendar.Event;

public class CalendarRemoveEventTest {

	private static Date d = new Date(2055, 1, 3);
	
	private static void testRemoveMissingEvent() {
		Calendar c = new Calendar();
		
		Event e1 = new Event(d, 5, 17, "event");
		Event e2 = new Event(d, 2, 5, "event");
		Event e3 = new Event(d, 8, 12, "event");
		
		c.addEvent(e1);
		c.addEvent(e2);
		
		String res = c.removeEvent(e3) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Attempt to remove event not in calendar should return false");
	}
	
	private static void testRemoveEvent() {
		Calendar c = new Calendar();
		
		Event e1 = new Event(d, 5, 17, "event");
		Event e2 = new Event(d, 2, 5, "event");
		Event e3 = new Event(d, 8, 12, "event");
		
		c.addEvent(e1);
		c.addEvent(e2);
		c.addEvent(e3);
		
		String res = c.removeEvent(e2) ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Attempt to remove event in calendar should return true");
		
		res = c.findEvent(e2) == -1 ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Removed event not found.");
	}
	
	public static void main(String[] args) {
		testRemoveMissingEvent();
		testRemoveEvent();
	}

}
