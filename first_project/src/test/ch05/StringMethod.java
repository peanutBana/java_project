package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
//		String ssn = "9506241230123";	//주민번호
//		char sex = ssn.charAt(6);		//문자열의 인덱스번호에 해당하는 요소를 출력
//		int length = ssn.length();
//		
//		if(length == 13 ) {
//			System.out.println("주민번호 자릿수가 맞습니다.");			
//		}
//		else {
//			System.out.println("주민번호 자릿수가 맞지 않습니다.");						
//		}
//		
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다.");
//			break;
//		}
		
		
		String oldStr = "자바 문자열";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		
		

	}

}
