package ds.Calendar;

public class Event {
    private Date date;
    private int start;
    private int end;
    private String description;

    public Event(Date date, int start, int end, String description) {

    }

    //Accessors
    public Date getDate() {  return null; }
    public int getStart() {  return 0; }
    public int getEnd() {  return 0; }
    public String getDescription() {  return null; }

    //Mutator
    public void setDescription(String newDescription) {

    }

    public String toString() {

        return "";
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Event)) return false;
        if (this == obj) return true;

        Event other = (Event) obj;

        return false;
    }
}
