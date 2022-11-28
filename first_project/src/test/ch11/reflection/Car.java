package test.ch11.reflection;

public class Car {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class clazz = Car.class;	//클래스 객체를 얻는 방법
//		Class clazz = Class.forName("test.ch11.reflection.Car");
		
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지 이름: " + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름: " + clazz.getSimpleName());
		System.out.println("클래스의 이름: " + clazz.getName());
		
		
	}

}
