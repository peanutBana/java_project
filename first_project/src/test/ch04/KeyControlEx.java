package test.ch04;

import java.util.Scanner;

public class KeyControlEx {

	public static void main(String[] args) {
		// 키보드에서 1,2를 입력했을 때 속도를 증가, 감속 시키고 3 입력 시 종료시키는 프로그
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.증속, 2.감속, 3.종");
			System.out.println("-----------");
			System.out.println("선택 : ");
			String strNm = sc.nextLine();
			
			if(strNm.equals("1")) {
				speed+=1;
			}
			else if(strNm.equals("2")) {
				speed-=1;
			}
			else if(strNm.equals("3")){
				run = false;
			}
			else {
				System.out.println("1,2,3중에 입력하세요.");
			}
			System.out.println("speed : " + speed);
		}

	}

}
