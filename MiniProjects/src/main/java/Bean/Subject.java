package Bean;

public class Subject {
	private String subjectname;
	private int code;
	private int marksacquiard;
	private int semester;
	public Subject(String name, int code, int marksacquiard, int semester) {
		super();
		this.subjectname = name;
		this.code = code;
		this.marksacquiard = marksacquiard;
		this.semester = semester;
	}

	public String getName() {
		return subjectname;
	}
	public void setName(String name) {
		this.subjectname = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getMarksacquiard() {
		return marksacquiard;
	}
	public void setMarksacquiard(int marksacquiard) {
		this.marksacquiard = marksacquiard;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Subject [subjectname=" + subjectname + ", code=" + code + ", marksacquiard=" + marksacquiard
				+ ", semester=" + semester + "]";
	}
	
	
	
}