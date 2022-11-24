package test.ch11.System;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			// 엔터키를 읽지 않았을때 실행
			if(keycode != 13 && keycode != 10) {
				if(keycode == 49) {	//숫자 1
					speed ++;
				}else if(keycode == 50) {
					speed--;
				}else if(keycode == 51) {
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println("===============");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("===============");
				System.out.println("현재 속도: " + speed);
				System.out.print("선택: ");
			
			}
			keycode = System.in.read();	//키를 하나씩 읽음
		}
	}

}
