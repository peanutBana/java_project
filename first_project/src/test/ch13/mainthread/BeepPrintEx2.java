package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		//Runnable : 스레드 실행을 위한 인터페이스
		Thread thread = new Thread(new Runnable() {
			//run() : 실제 스레드가 실행되는 코드
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);	//0.5초간 일시정지
					}catch(Exception e) {}
				}
			}});
		
		thread.start();		//thread 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
