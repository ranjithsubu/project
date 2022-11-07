package Bean;

import java.util.ArrayList;

public class Student {
	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	final int pass = 35;
	private int id;
	private String studentname;
	private String department;
	private int rank;
	private int total;
	public boolean isPass;

	ArrayList<Subject> subject;

	public Student(int id, String studentname, String department, ArrayList<Subject> subject) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.department = department;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return studentname;
	}

	public void setName(String name) {
		this.studentname = studentname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public ArrayList<Subject> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", department=" + department + ", rank=" + rank
				+ ", total=" + total + ", isPass=" + isPass + ", subject=" + subject + "]";
	}

}