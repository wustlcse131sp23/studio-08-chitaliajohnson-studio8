package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * Profile for a Date
	 * 
	 * @param months the month of the year, expected 1-12
	 * @param days the day of the month, expected 1-31
	 * @param years the year
	 */
	public Date(int months, int days, int years, boolean holidays) {
		month = months;
		day = days;
		year = years;
		holiday = holidays;
	}
	public String toString() {
		if (holiday == true) {
			return month + "/" + day + "/" + year + " its a holiday";
		}
		else {
			return month + "/" + day + "/" + year + " its not a holiday";
		}
	}
    public static void main(String[] args) {
    	Date dateA = new Date(12, 25, 2003, true);
    	System.out.println(dateA.toString());
    	Date dateB = new Date (12, 21, 2005, false);
    	System.out.println(dateB.toString());
    	Date dateC = new Date (12, 21, 2005, false);
    	Date dateD = new Date (11,25, 2007, false);
    	Date dateE = new Date (3,1, 2003, false);
    	System.out.println(dateC.toString());
    	System.out.println(dateA.equals(dateB));
    	System.out.println(dateB.equals(dateC));
    	LinkedList<Date> list = new LinkedList<Date>();
    	System.out.println(list);
    	list.add(dateA);
    	list.add(dateB);
    	list.add(dateA);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(dateA);
    	set.add(dateB);
    	set.add(dateA);
    	System.out.println(set);
    }
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
