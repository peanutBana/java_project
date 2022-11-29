package java_modeling.ch01.asso3;

import java.util.Vector;

public class Course {
	
	private String name;
	private Vector<Transcript> transcripts;	
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	public String getName() {		//Course name을 return
		return name;
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

