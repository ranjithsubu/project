package Collection;

import java.util.ArrayList;
import java.util.List;

public class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentlist = new ArrayList<Student>();
		Student s1 = new Student(8, "ranjith");
		Student s2 = new Student(9, "ramesh");
		Student s3 = new Student(10, "sai");
		Student s4 = new Student(11, "settu");
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
		System.out.println(s3.id + " " + s3.name);
		System.out.println(s4.id + " " + s4.name);
		for (Student s : studentlist) {
			if (s.name.startsWith("s")) {
				System.out.println("name start with r " + s.name);
			}

		}

	}

}
