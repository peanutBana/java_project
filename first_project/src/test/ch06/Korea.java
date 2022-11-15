package test.ch06;

public class Korea {
	
	//final필드 : 수정불가 / 초기값을 무조건 줘야한다.(필드 선언시 OR 생성자에서)
	final String nation = "대한민국";
	final String ssn;	//주민번호
	
	//인스턴스 필드
	String name;
	
	//생성자
	Korea(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
		
	}
	
	
}
