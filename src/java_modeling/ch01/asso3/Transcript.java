package java_modeling.ch01.asso3;

public class Transcript {
		// 연관관계에 의해 참조하는 속성
	private Student student;
	private Course course;
	
		// Transcript 자체의 속성
	private String date;
	private String Grade;	// 점수
	
	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		this.student.addTranscript(this);	// Transcript 객체를 넘겨준다.	this : 현재 객체
		this.course.addTranscript(this);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}
	
	
	
}
