package test.ch06;

public class Car {
	//1.field : 객체의 데이터를 저장
		String company;
		String model;
		String color;
		int maxSpeed;
		static int numbering = 0;
		int speed;
//		boolean start = true;		//시동 여부
		
		
	Car(){
		numbering++;
	}
		
	Car(String model){
//		this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model,String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
		
	}
	
	//자바에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다.
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}	
	
