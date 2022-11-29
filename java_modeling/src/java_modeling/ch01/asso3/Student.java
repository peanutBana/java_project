
package java_modeling.ch01.asso3;

import java.util.Vector;

public class Student {
	//필드
	private String name;
	private Vector<Transcript> transcripts;		//성적리스트
	
	//생성자
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public Vector<Transcript> getTranscripts() {
		return transcripts;
	}

	public void setTranscripts(Vector<Transcript> transcripts) {
		this.transcripts = transcripts;
	}
	
	
}

