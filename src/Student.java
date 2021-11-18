public class Student implements Comparable<Student>{
	private String name;

	public int getAge() {
		return age;
	}

	private int age;
	private double gpa;
	private double excellenceQuotient;

	Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

	public static int compareByAge(Student s1, Student s2) {
		return s1.getAge() - s2.getAge();
	}

	public String toString(){
		return name + ": " + gpa;
	}
}
