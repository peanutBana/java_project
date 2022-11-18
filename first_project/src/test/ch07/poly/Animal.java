package test.ch07.poly;

public abstract class Animal {
	//일반 메소드
	public void breathe(){
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드
	//자식 메소드에서 반드시 오버라이딩 되어야한다.
	public abstract void sound();
	
}
