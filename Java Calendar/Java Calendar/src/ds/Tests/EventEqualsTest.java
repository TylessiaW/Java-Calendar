package ds.Tests;

import ds.Calendar.Date;
import ds.Calendar.Event;

public class EventEqualsTest {
	private static Date d1 = new Date(2030, 5, 15);
	private static Date d2 = new Date(2025, 7, 25);
	private static Date d3 = new Date(2030, 5, 15);

	private static void testEventDifferentDates() {
		Event e1 = new Event(d1, 5, 6, "event");
		Event e2 = new Event(d2, 5, 6, "event");
		
		String res = e1.equals(e2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Two events with different dates should not equal");
	}
	
	private static void testEventDifferentStart() {
		Event e1 = new Event(d1, 2, 6, "event");
		Event e2 = new Event(d3, 5, 6, "event");
		
		String res = e1.equals(e2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Two events with different starts should not equal");
	}
	
	private static void testEventDifferentEnds() {
		Event e1 = new Event(d1, 5, 6, "event");
		Event e2 = new Event(d3, 5, 22, "event");
		
		String res = e1.equals(e2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Two events with different ends should not equal");
	}
	
	private static void testEventDifferentDescriptions() {
		Event e1 = new Event(d1, 5, 6, "event 1");
		Event e2 = new Event(d3, 5, 6, "event 2");
		
		String res = e1.equals(e2) ? "[FAIL] " : "[PASS] ";
		System.out.println(res + "Two events with different descriptions should not equal");
	}
	
	private static void testEventEqualEvents() {
		Event e1 = new Event(d1, 5, 6, new String("event"));
		Event e2 = new Event(d3, 5, 6, new String("event"));
		
		String res = e1.equals(e2) ? "[PASS] " : "[FAIL] ";
		System.out.println(res + "Two events that should equal");
	}
	
	public static void main(String[] args) {
		testEventDifferentDates();
		testEventDifferentStart();
		testEventDifferentEnds();
		testEventDifferentDescriptions();
		testEventEqualEvents();
	}

}
