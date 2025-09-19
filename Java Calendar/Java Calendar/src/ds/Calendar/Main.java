package ds.Calendar;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(2025, 9, 2);
        Event e1 = new Event(d1, 10, 12, "CSC 385 Lecture");

        Calendar cal = new Calendar();   // our custom Calendar
        cal.addEvent(e1);

        System.out.println("My Calendar:");
        cal.dump();
    }
}
