package test.ch06.exam01.package2;

import test.ch06.exam01.package1.A;
import test.ch06.exam01.package1.B;

public class C {
	public C(){	
		A a = new A();
		B a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
	}
}
