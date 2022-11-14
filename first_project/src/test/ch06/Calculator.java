package test.ch06;

public class Calculator {
	//메소드 오버로딩 : 같은 이름의 메소드를 여러개 만든다.
	//매개변수의 순서, 타입, 개수 중에 하나가 달라야한다.
	double areaRectangle(double width) {
		return width * width;
	}
	
	//매개변수의 타입 다름
	int areaRectangle(int width) {
		return width * width;
	}
	
	//매개변수 개수 다름
	double areaRectangle(double width, double height) {
		return width + height;
	}
	
	
	
	
//	//리턴값이 없는 메소드 선언
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//	}
//
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
//	
//	//int 형으로 리턴
//	int plus(int x ,int y ) {
//		int result = x + y;
//		return result;
//	}
//	
//	//double 형으로 리턴값이 있는 메소드
//	double divide(int x, int y) {
//		double result = (double) x / y;
//		return result;
//	}
}