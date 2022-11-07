package bean;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentBean> studentlist = new ArrayList<>();

		StudentBean s1 = new StudentBean(11, "hii");
		StudentBean s2 = new StudentBean(22, "hello");
		StudentBean s3 = new StudentBean(33, "good");
		StudentBean s4 = new StudentBean(44, "morining");
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		for (StudentBean student : studentlist) {
			if (student.getName().startsWith("h")) {
				System.out.println(student.getId() + "  " + student.getName());
			}

		}

	}

}
