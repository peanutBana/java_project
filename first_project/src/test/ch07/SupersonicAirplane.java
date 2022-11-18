package test.ch07;

public class SupersonicAirplane extends Airplane {
	//상수
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필드
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");	
		}
		else {
			super.fly();		//부모 클래스의 메소드 실행
		}
	}
}
