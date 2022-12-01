package java_modeling.ch01.asso3;

public class main {

	public static void main(String[] args) {
		Student s1 = new Student("william");
		Student s2 = new Student("mari");
		
		Course jv = new Course("java");
		Course dp = new Course("Design Pattern");
		
			// 수강신청
		Transcript t1 = new Transcript(s1, jv);
		Transcript t2 = new Transcript(s1, dp);
		Transcript t3 = new Transcript(s2, jv);
		
		t1.setDate("2022");
		t1.setGrade("B0");
		// william의 2022년 java 성적이 B0
		
		t2.setDate("2022");
		t2.setGrade("D+");
		// william의 2022년 dp 성적이 D+
		
		t3.setDate("2023");
		t3.setGrade("C+");
		// mari의 2023년 java 성적이 C+
		
	}

}
