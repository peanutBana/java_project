package test.ch06.exam01.package1;

public class B {	
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		a.method2();
		//a.method3();  // private는 클래스 안에서만 사용가능
	}
}

