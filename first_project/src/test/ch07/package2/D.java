package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A{
	public D() {
		super();	//A클래스의 생성자 호출
	}
	public void method1(){
		super.field = "2";
		super.method();
		
		this.field = "1";
	}
	public void method2(){
		//상속을 통한 접근은 가능하나 직접 객체를 생성해서 사용할 수는 없다.
//		A a = new A();	
//		a.field = "1";
//		a.method();
	}
}
