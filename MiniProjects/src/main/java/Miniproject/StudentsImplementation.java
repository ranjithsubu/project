package Miniproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Bean.Student;
import Bean.Subject;

public class StudentsImplementation {
	public List<Student> prepareData() {

		ArrayList<Subject> civil1styearsl = new ArrayList<Subject>();
		Subject a1 = new Subject("english", 101, 50, 1);
		Subject a2 = new Subject("maths", 102, 60, 1);
		Subject a3 = new Subject("secience", 103, 70, 1);
		Subject a4 = new Subject("cadlab", 104, 80, 1);
		Subject a5 = new Subject("soillab", 105, 30, 1);
		civil1styearsl.add(a1);
		civil1styearsl.add(a2);
		civil1styearsl.add(a3);
		civil1styearsl.add(a4);
		civil1styearsl.add(a5);
		ArrayList<Subject> civil2ndyearsl = new ArrayList<Subject>();
		Subject b1 = new Subject("data", 201, 99, 3);
		Subject b2 = new Subject("c", 202, 80, 3);
		Subject b3 = new Subject("java", 203, 77, 3);
		Subject b4 = new Subject("embedded", 204, 83, 3);
		Subject b5 = new Subject("software", 205, 90, 3);
		civil2ndyearsl.add(b1);
		civil2ndyearsl.add(b2);
		civil2ndyearsl.add(b3);
		civil2ndyearsl.add(b4);
		civil2ndyearsl.add(b5);
		ArrayList<Subject> csesl = new ArrayList<Subject>();
		Subject c1 = new Subject("c++", 301, 15, 4);
		Subject c2 = new Subject("data Structure", 302, 95, 4);
		Subject c3 = new Subject("html", 303, 95, 4);
		Subject c4 = new Subject("system software", 304, 95, 4);
		Subject c5 = new Subject("hello", 305, 95, 4);
		csesl.add(c1);
		csesl.add(c2);
		csesl.add(c3);
		csesl.add(c4);
		csesl.add(c5);

		ArrayList<Student> studentlist = new ArrayList<Student>();
		Student s1 = new Student(111, "ranjith", "civil1st", civil1styearsl);
		Student s2 = new Student(222, "ramesh", "civil2nd", civil2ndyearsl);
		Student s3 = new Student(333, " suna bana", "cse", csesl);
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);

		return studentlist;
	}

	public void printdata(List<Student> studentlist) {
		for (Student studentdata : studentlist) {
			System.out.println(studentdata);

		}

	}

	/*
	 * public List<Student> resultCalculation(List<Student> studentlist) {
	 * ArrayList<Student> studentsresult = new ArrayList<Student>();
	 * 
	 * int sum = 0; boolean ispassed = true; for (Student studentdata : studentlist)
	 * {
	 * 
	 * for (Subject subjectlist : studentdata.getSubject()) { sum = sum +
	 * subjectlist.getMarksacquiard(); if (subjectlist.getMarksacquiard()<35) {
	 * ispassed = false; }
	 * 
	 * } studentdata.setTotal(sum); studentsresult.add(studentdata);
	 * 
	 * 
	 * } return studentlist; }
	 */

	public List<Student> getPassStudentDetail(List<Student> studentlist) {
		List<Student> studentpassdata = new ArrayList<Student>();

		for (Student studentdetail : studentlist) {
			boolean ispassed = true;
			for (Subject subjectdetial : studentdetail.getSubject()) {
				if (subjectdetial.getMarksacquiard() < 35) {
					ispassed = false;
					break;
				}

			}
			if (ispassed) {
				studentpassdata.add(studentdetail);
			}

		}
		return studentpassdata;
	}

	public List<Student> getFailStudentDetail(List<Student> studentlist) {
		List<Student> studentfaileddata = new ArrayList<Student>();

		for (Student studentdetail : studentlist) {
			boolean isFail = false;
			for (Subject subjectdetial : studentdetail.getSubject()) {
				if (subjectdetial.getMarksacquiard() < 35) {

					isFail = true;
					break;
				}

			}
			if (isFail) {
				studentfaileddata.add(studentdetail);

			}

		}
		return studentfaileddata;
	}

	public List<Student> resultCalculation(List<Student> studentresult) {
		List<Student> student = new ArrayList<Student>();
		for (Student studentdata : studentresult) {
			int sum = 0;
			for (Subject subjectlist : studentdata.getSubject()) {
				sum = sum + subjectlist.getMarksacquiard();

			}
			studentdata.setTotal(sum);
			student.add(studentdata);

		}
		return studentresult;

	}

	/*
	 * private List<Student> getHightestTotal(List<Student> studentlist){
	 * List<Student> students = new ArrayList<Student>(); int higthTotal = 0;
	 * for(Student studentdata:studentlist) { if(studentdata.getTotal()>higthTotal)
	 * { higthTotal = studentdata.getTotal(); students.add(studentdata); } } return
	 * students;
	 * 
	 * }
	 */
	private List<Student> getHightestTotal(List<Student> studentlist) {
		List<Student> students = new ArrayList<Student>();
		int higthTotal = 0;
		Student hightesttotal = null;
		for (Student student2 : students) {
			if (student2.getTotal() > higthTotal) {
				higthTotal = student2.getTotal();

				hightesttotal = student2;

			}
			students.add(hightesttotal);

		}
		return students;
	}

	public static void main(String[] args) {
		StudentsImplementation associate = new StudentsImplementation();
		List<Student> studentdetail = associate.prepareData();
		associate.printdata(studentdetail);
		System.out.println("pass students");
		associate.printdata(associate.getPassStudentDetail(studentdetail));
		System.out.println("fail students");
		associate.printdata(associate.getFailStudentDetail(studentdetail));
		System.out.println("student total ");
		associate.printdata(associate.resultCalculation(studentdetail));
		System.out.println("hight total");
		// associate.printdata(associate.getHightestTotal(studentdetail));
		associate.printdata(associate.getHightestTotal(studentdetail));

	}

}
