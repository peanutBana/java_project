package test.ch08.field_multi;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();	//중요60
		myCar.tire2 = new KumhoTire();
		myCar.run();

	}

}
