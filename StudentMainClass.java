package Assignment1week3StudentDemo;

public class StudentMainClass {
	public static void main(String[] args) {
		StudentDAO stdao = new StudentDAO();
		stdao.addStudent();
		stdao.displyStudent();
		stdao.searchStudent(0);
		stdao.reomveName("Ali");
	}

}
