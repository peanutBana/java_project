package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		//학생 객체 생성
		Student s1 = new Student("haseo");
		Student s2 = new Student("gildong");
		
		//과목 객체 생성 
		Course jv = new Course("Java");
		Course dp = new Course("Design Patter");
				
		//수강신청
		Transcript t1 = new Transcript(s1, jv);		
		Transcript t2 = new Transcript(s1, dp);	
		Transcript t3 = new Transcript(s2, dp);
		
		t1.setDate("2022");
		t1.setGrade("B0");
		
		t2.setDate("2022");
		t2.setGrade("D+");
		
		t3.setDate("2023");
		t3.setGrade("C+");
	
		
		for(Transcript ts : s1.getTranscripts()) {
			System.out.println(ts.getGrade());
		}
		
	}
}
