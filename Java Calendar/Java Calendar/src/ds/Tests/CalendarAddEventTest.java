package ds.Tests;

import ds.Calendar.*;

public class CalendarAddEventTest {

	public static void main(String[] args) {
		Calendar c = new Calendar();
		
		Event e1 = new Event(
			new Date(2050, 9, 9),
			2, 20, "Future Dance Party"
		);
		
		boolean added = c.addEvent(e1);
		added &= c.addEvent(e1);
		added &= c.addEvent(e1);
		added &= c.addEvent(e1);
		
		String res1 = added ? "[PASS] " : "[FAIL] ";
		String res2 = c.addEvent(e1) ? "[FAIL] " : "[PASS] ";
		
		System.out.println(res1 + "adding an event below MAXEVENTS should return true");
		System.out.println(res2 + "adding an event beyond MAXEVENTS should return false");
	}

}
