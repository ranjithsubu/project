package bean;

public class Employee {

	private int empid;
	private String name;
	private int salary;
	private String cabin;
	private String date;

	public Employee(int empid, String name, int salary, String cabin, String date) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.cabin = cabin;
		this.date = date;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getDate() {
		return date;
	}

}
