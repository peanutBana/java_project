package test.ch08.type;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a;
		
		//자동형변환
		a = b;
		a = c;
		a = d;
		a = e;
	}

}
