package java_modeling.ch01.asso3;

public class Transcript {
	//연관관계에 의해 참조하는 속성
	private Student student;
	private Course course;
	
	//Transcript 속성
	private String date;	//성적 날짜
	private String grade;	//점수
	
	//생성자
	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		this.student.addTranscript(this);
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
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}	
