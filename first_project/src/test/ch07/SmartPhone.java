package test.ch07;

public class SmartPhone extends phone {
	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color){
		super(model, color);	// 부모 생성자 먼저 호출
		System.out.println("자식생성자 호출");
		
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
		
	}
}
