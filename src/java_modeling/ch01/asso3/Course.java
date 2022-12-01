package java_modeling.ch01.asso3;

import java.util.Vector;

public class Course {
	
	private String name;
	private Vector<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
		// 과목명
	public String getName() {
		return name;
	}
	
		// 수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
