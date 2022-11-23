package test.ch09.outer;

public class Athis {
	//인스턴스 필드\
	String field  = "A-field";
	
	//인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B{
		String field = "B-field";
		
		void method() {
			System.out.println("B-method");
		}
		
		void print() {
			//B객체의 필드 메소드 사용
			System.out.println(this.field);
			this.method();
			
			//A객체의 필드 메소드 사용
			System.out.println(Athis.this.field);
			Athis.this.method();
		}
	}
	void useB() {
		B b = new B();
		b.print();
	}
}
