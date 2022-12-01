package java_modeling.ch01.asso3;

import java.util.Vector;

public class Student {
	
	private String name;
	private Vector<Transcript> transcripts;		// 시험성적 리스트
	
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
		
		// 성적추가 
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
}
