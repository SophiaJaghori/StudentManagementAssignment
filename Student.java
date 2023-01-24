package Assignment1week3StudentDemo;

public class Student {
	private int studentId;
	private int studentAge;
	private String studentName;
	private String studentAddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, int studentAge, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	

}
