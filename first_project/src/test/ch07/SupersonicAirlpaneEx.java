package test.ch07;

public class SupersonicAirlpaneEx {

	public static void main(String[] args) {
		
		SupersonicAirplane sa =  new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //static 메소드는 클래스명.메소드 로 가져옴
		sa.fly();
	}

}
