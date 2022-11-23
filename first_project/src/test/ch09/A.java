package test.ch09;

public class A {
	
	class B{
		//필드
		int field1 = 1;
		
		//생성자
		B(){
			System.out.println("B생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B의 메소드 실행");
		}
	}
	
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	
//	//2. A 클래스 생성자에서 사용 가능
//	A(){
//		B b = new B();
//	}
//	
//	//3. 메소드에서 사용 가능
//	void method() {
//		B b = new B();
//	}
}
