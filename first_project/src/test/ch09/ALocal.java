package test.ch09;

public class ALocal {
	void useB(int arg) {
		
		int var = 1;		//final 속성을 가짐
		
		class B{
			//인스턴스 필드
			int field1 = 1;
			
			//생성자
			B(){
				System.out.println("B생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");
			}
			
			void method2() {
//				arg = 2;
//				var = 1;  수정불가능
			}
		}
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
	}
}
