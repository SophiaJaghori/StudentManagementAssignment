package Assignment1week3StudentDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDAO {
	ArrayList<Student>al = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	public void addStudent() {
		System.out.println("Enter Students Id number !");
		int id = sc.nextInt();
		System.out.println("Enter sutdent's age ");
		int age = sc.nextInt();
		System.out.println("Enter Students name ");
		String name = sc.next();
		System.out.println("Enter Student's address");
		String address = sc.next();
		Student st = new Student(id, age, name, address);
		al.add(st);
		System.out.println("Done inserting!");
	}
	
	public void displyStudent() {
		for(Student student:al) {
			System.out.println("Name: "+student.getStudentName());
			System.out.println("age: "+ student.getStudentAge());
			System.out.println("Student Id: "+ student.getStudentId() );
			System.out.println("Address: "+ student.getStudentAddress());
		}
	}
	public void searchStudent(int index) {
		if(al.get(index)!=null) {
			System.out.println("index found "+ al.get(index).getStudentName());
			System.out.println("student full information is: "+ al.get(index).getStudentName()
					+" "+  al.get(index).getStudentId()+" "+ al.get(index).getStudentAge()+ " "+ al.get(index).getStudentAddress());
		}
		else {
			System.out.println("index not found!");
		}
		
		
	}
	
	public void reomveName(String stName) {
	
			Iterator<Student>itst = al.iterator();
			while(itst.hasNext()) {
				if(itst.next().getStudentName().compareTo(stName)==0) {
					itst.remove();
					System.out.println("Student wih number " + itst.next().getStudentId() + " was removed!");
					break;
				}
			}
		}
	
	

}
