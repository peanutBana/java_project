package java_modeling.ch01.asso1;

import java.util.Vector;

public class Student {
	//필드
	private String name;
	//Vector : ArrayList와 배열에 저장 가능
	//Course는 1..*
	private Vector<Course> courses; 		//Student knows Course
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	
	//메소드
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course              ) {
		
	}
	
}
