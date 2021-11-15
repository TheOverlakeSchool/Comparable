public class Student implements Comparable<Student>{
	private String name;
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

	public String toString(){
		return name + ": " + gpa;
	}
}
