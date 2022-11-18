package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰13미니","핑크");
		
		//phone에서 상속받은 필드 읽기
		System.out.println(myPhone.model + myPhone.color);
		
		//phone에서 상속받은 메소드 : 자식 객체에서 부모 객체에 가능 
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.revieveVoice("누구세요");
		myPhone.hangUp();
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
