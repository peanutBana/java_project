package java_modeling.ch01.asso2;

import java.util.Vector;

import java_modeling.ch01.asso3.Transcript;

public class Course {
	
	private String name;
	private Vector<Transcript> transcripts;	
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//수강신청한 학생 추가ㅋ
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
}
