import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClient {
	public static void main(String[] args) {
		Student a = new Student("Kamya", 16, 3.8);
		Student b = new Student("Kai", 17, 3.6);
		List<Student> students = new ArrayList<>();
		students.add(a);
		students.add(b);
		sort(students);
		System.out.println(students);
	}

	public static void sort(List<Student> students) {
		Collections.sort(students);
	}


}
