package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
//		Child child = new Child();
//		Parent parent = child;		//parent > child ==> 자동타입변환
		
//		parent.method1();
//		parent.method2();	//오버라이드 된 메소드를 물러온다.
//		parent.method3();	//자식 객체에 있는 메소드는 불러오지 않는다.
		
//		parent.부모필드 = 2;
//		parent.자식필드 = 1;
		
		
		Parent parent = new Child();	//자동 타입변환
		
//		instanceof : 객체의 타입확인을 위한 연산자
		if(parent instanceof Child){	// => parent의 타입이 Child이냐? ==> true;
			
			//parent가 Child 타입이 아니라면 강제 타입변환을 할 수 없으므로!
			Child child = (Child)parent;	//강제 타입변환
			child.자식필드 = 1;
			child.method3();				
		}
		
		//부모타입의 parent를 child로 강제 타입변환 하면 child의 필드, 메소드를 사용 가능하다.
	}

}
