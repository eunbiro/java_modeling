package java_modeling.ch01.asso;

import java.util.Vector;

public class Student {
	private String name;
		// Vector : ArrayList와 비슷하게 배열에 저장할 수 있다.
		// course는 1..*
	private Vector<Course> courses;
	
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	
	public void registerCourse(Course course) {		// 등록
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		courses.remove(course);
	}
}
