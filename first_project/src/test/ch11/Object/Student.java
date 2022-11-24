package test.ch11.Object;

public class Student {
	private int no;
	private String name;
	
	public Student(int no) {
		this.no = no;	//필드에 초기값 할당
		this.name = name;
	}

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public int hashCode() {
		System.out.println("No: " + no + ", Name: " + name);
		int hashCode = no + name.hashCode();	//번호 이름이 같으면 동일한 값이 생성된다.
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		
		//obj가 Student객체를 가지고 있는지?
		if(obj instanceof Student) {
			Student target = (Student)obj;
			
			//no와 name 같은지 비교
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
