package ds.Calendar;

public class Date implements Comparable<Date> {
    //Fields
    private int year;
    private int month;
    private int day;

    //Constructor
    public Date(int year, int month, int day) {
    
    }

    //Accessors
    public int getYear() { /* TODO */ return 0; }
    public int getMonth() { /* TODO */ return 0; }
    public int getDay() { /* TODO */ return 0; }

   
    public String toString() {
      
        return "";
    }

    
    public boolean equals(Object obj) {
       
        if (obj == null) return false;
        if (!(obj instanceof Date)) return false;
        if (this == obj) return true;

        Date other = (Date) obj;
       
        return false;
    }

  
    public int compareTo(Date other) {
       
        return 0;
    }
}
