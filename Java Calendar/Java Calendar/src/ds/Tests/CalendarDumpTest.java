package ds.Tests;

import ds.Calendar.Calendar;
import ds.Calendar.Date;
import ds.Calendar.Event;

public class CalendarDumpTest {

	public static void main(String[] args) {
		Calendar c = new Calendar();
		
		Date d1 = new Date(2055, 1, 3);
		Date d2 = new Date(2037, 11, 9);
		Date d3 = new Date(2041, 7, 13);
		
		Event e1 = new Event(d1, 5, 17, "event");
		Event e2 = new Event(d2, 2, 5, "event");
		Event e3 = new Event(d3, 8, 12, "event");
		
		c.addEvent(e1);
		c.addEvent(e2);
		c.addEvent(e3);
		
		System.out.println("Expected result of calling dump()");
		System.out.println("1/3/2055 5 -- 17: event\n11/9/2037 2 -- 5: event\n7/13/2041 8 -- 12: event");
		System.out.println("\nActual result of calling dump()");
		c.dump();
		
		System.out.println("\n-After removing second event to create a gap-");
		c.removeEvent(e2);
		System.out.println("Expected result of calling dump()");
		System.out.println("1/3/2055 5 -- 17: event\n7/13/2041 8 -- 12: event");
		System.out.println("\nActual result of calling dump()");
		c.dump();
		
	}

}
