package test.ch09;

public class Astatic {
	//public, private, default 접근제한자 사용가능
	static class B{
		int field1 = 1;
		B(){
			System.out.println("B생성자 실행");
		}
		void method1(){
			System.out.println("B메소드 실행");
		}
	}
	
	//1. 필드로 사용
	B field = new B();
	
	//2. 생성자에서 사용
	Astatic(){
		B b = new B();
	}
	
	//3. 메소드에서 사용가능
	void method1() {
		B b = new B();
	}
	
	//정적 메소드에서 사용가능
	static void method2() {
		B b = new B();
	}
}
