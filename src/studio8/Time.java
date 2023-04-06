package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean timeForm;
	
	/**
	 * Profile for Time
	 * 
	 * @param hours the hour of the day, expected 0 to 23
	 * @param minutes the minute of the hour, expected 0 to 59
	 * @param hourFormat whether 12 or 24 hour format, if true it is 24 hour format
	 */
	public Time(int hours, int minutes, boolean hourFormat) {
		hour = hours;
		minute = minutes;
		timeForm = hourFormat;
	}
	public String toString() {
		if (timeForm == true) {
			return hour + ":" + minute;
		}
		else {
			if (hour >= 12) {
				return hour - 12 + ":" + minute;
			}
			else {
				return hour + ":" + minute;
			}
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, timeForm);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && timeForm == other.timeForm;
	}
	public static void main(String[] args) {
		Time timeA = new Time(13, 48, true);
		System.out.println(timeA.toString());
		Time timeB = new Time(15, 20, false);
		System.out.println(timeB.toString());
		Time timeC = new Time(15, 20, false);
		System.out.println(timeC.toString());
		System.out.println(timeA.equals(timeB));
		System.out.println(timeB.equals(timeC));
    }

}