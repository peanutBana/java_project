package test.ch10;

public class ExecptionEx1 {

	public static void printLength(String data) {
		try {
			int result = data.length();	//문자 수 저장
			System.out.println("문자 수: " + result);
		}
		catch(NullPointerException e) {		//에러 났을 때 실행시킬 코드 작성
			
			//예외 처리 정보를 얻는 세가지 방법
//				System.out.println(e.getMessage());		//예외 발행한 이유만 리턴
//				System.out.println(e.toString());		//예외 발행한 이유 + 예외의 종류 리턴
				e.printStackTrace();					//예외 발행한 이유 + 예외의 종류 + 예외가 발생한 곳 리턴
		}
		finally {		//무조건 실행
			System.out.println("마무리 실행");
		}
	
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("apple");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
