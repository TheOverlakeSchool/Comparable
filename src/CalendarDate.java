import java.util.Comparator;

public class CalendarDate implements Comparable<CalendarDate> {
	// the year component
	private int year;
	// the month component
	private int month;
	// the day component
	private int day;

	// constructs a date with given year, month, day
	public CalendarDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// returns the year component
	public int getYear() {
		return year;
	}

	// returns the month component
	public int getMonth() {
		return month;
	}

	// returns the day component
	public int getDay() {
		return day;
	}

	// returns the date in yyyy/mm/dd format
	public String toString() {
		String result = year + "/";
		if (month < 10) {
			result += "0";
		}
		result += month + "/";
		if (day < 10) {
			result += "0";
		}
		result += day;
		return result;
	}

	@Override
	public int compareTo(CalendarDate o) {
//		if (year != o.year) {
//			return year - o.year;
//		}
//		if (month != o.month) {
//			return month - o.month;
//		}
//
//		return day - o.day;
		return toString().compareTo(o.toString());
	}
}
