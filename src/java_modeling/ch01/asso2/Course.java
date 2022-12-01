package java_modeling.ch01.asso2;

import java.util.Vector;

public class Course {
	
	private String name;
		// 수강신청한 학생들
	private Vector<Student> students;
	
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
		// 과목명
	public String getName() {
		return name;
	}
	
		// 수강신청한 학생을 추가
	public void addStudent(Student student) {
		students.add(student);
	}
	
		// 수강취소한 학생을 제거
	public void removeStudent(Student student) {
		// 원래는 삭제하고자 하는 정보가 있는지 먼저 확인 필요
		students.remove(student);
	}
}
