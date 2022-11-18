package test.ch07.poly;

public class InstanceofEx {
	
	//메소드
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student) {		//person Student type을 참조하냐?
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		Person p2 = new Student("홍길순",202230432);
		personInfo(p2);
		
		
		
	}

}
