package test.ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("x값 입력: ");
		String strX = sc.nextLine();		//Enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);		//정수형으로 강제 형변환

		System.out.println("y값 입력: ");
		String strY = sc.nextLine();		//Enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY);		//정수형으로 강제 형변환
		
		int res = x + y;
		System.out.println("result: " + res);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = sc.nextLine();
			
			//입력받은 데이터가 q와 같은지
			if(data.equals("q")) {
				break;	
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
 		System.out.println("종료");

		
	}

}
