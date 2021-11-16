import java.util.*;

public class ComparableClient {
	public static void main(String[] args) {
//		Student a = new Student("Kamya", 16, 3.8);
//		Student b = new Student("Kai", 17, 3.6);
////		System.out.println((byte)a.toString().charAt(0));
////		System.out.println((byte)b.toString().charAt(0));
//		List<Student> students = new ArrayList<>();
//		students.add(a);
//		students.add(b);
//		students.sort(null);
//		System.out.println(students);

//		CalendarDate date1 = new CalendarDate(2021,11,16);
//		CalendarDate date2 = new CalendarDate(2021,11,15);
//		List<CalendarDate> dates = new ArrayList<>(List.of(date1, date2));
//		dates.sort(null);
//		System.out.println(dates);

		Location sydney = new Location("Sydney", -34.1,151.1);
		Location singapore = new Location("Singapore", 1.35, 103.82);
		Location kirkland = new Location("Kirkland", 47.67, -122.2);
		Location redmond = new Location("Redmond",47.67,-122.12);
		List<Location> locations = new LinkedList<>(List.of(sydney,singapore,kirkland,redmond));
		locations.sort(null);
		for (Location location : locations) {
			System.out.println(location);
		}
	}



}
