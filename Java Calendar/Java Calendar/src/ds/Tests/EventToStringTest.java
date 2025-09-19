package ds.Tests;

import ds.Calendar.Date;
import ds.Calendar.Event;

public class EventToStringTest {

	private static Date d = new Date(2024, 4, 13);
	
	public static void main(String[] args) {
		Event e = new Event(d, 18, 20, "A class of structures");
		String res = "4/13/2024 18 -- 20: A class of structures";
		System.out.println("Expected return \n" + res);
		System.out.println("\nWhat your toString returns \n" + e);
	}

}
