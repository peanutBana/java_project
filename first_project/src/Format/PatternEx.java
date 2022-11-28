package Format;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		/*
		 02-222-2222
		 010-2222-2222 
		 */
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";		//패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);		//matches(패턴,데이터);
		System.out.println(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@naver.com";
		boolean result1 = Pattern.matches(regExp, data);		//matches(패턴,데이터);
		System.out.println(result1);
	}

}
