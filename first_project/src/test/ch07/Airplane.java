package test.ch07;

//public final class Airplane  클래스에 final이 붙으면 그 클래스는 
//부모클래스로 사용할 수 없다, 메소드같은 경우는 오버라이드 불가능
public class Airplane {
	//메소드
	public void lane() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반 비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	
	}
}
