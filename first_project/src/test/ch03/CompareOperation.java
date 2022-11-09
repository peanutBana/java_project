package test.ch03;

public class CompareOperation {

	public static void main(String[] args) {
		//정수끼리
		int n1 = 10;
		int n2 = 10;		
		boolean result1 = (n1 <= n2);
		System.out.println("result1: " + result1);
		
		//문자끼리
		char ch1 = 'A';
		char ch2 = 'B';
		boolean result2 = (ch1 > ch2);
		System.out.println("result2: " + result2);
		
		//정수와 실수
		int n3 = 1;
		double n4 = 1.0;
		boolean result3 = (n3 == n4);
		System.out.println("result3: " + result3);
		
		//float vs double
		float n5 = 0.1f;
		double n6 = 0.1;
		boolean result4 = (n5 == n6);
		boolean result5 = (n5 == (float)n6);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		//문자열끼리
		String str1 =  "자바"; 
		String str2 =  "java";
		boolean result6 = (str1.equals(str2));
		boolean result7 = (!str1.equals(str2));
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		
	}
		

}
