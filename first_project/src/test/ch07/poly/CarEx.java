package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
	Car myCar = new Car();
	
	//타이어 객 생성
	myCar.tire = new HankookTire();
	myCar.run();

	}

}
