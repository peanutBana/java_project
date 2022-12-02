package test.ch13.mainthread;

import java.awt.Toolkit;
	
public class BeepPrintEx4 extends Thread{
	@Override
	 public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
           toolkit.beep();// 빔 소리를 낸다
           try {
              // thread는 동시에 여러가지 일을 처리하기 위해 사용한다
              Thread.sleep(500);// 1000이 1초 500은 0.5초 동안 일시정지
           } catch (Exception e) {}
        }
     }

	public static void main(String[] args) {
		Thread thread = new BeepPrintEx4();
		 
         thread.start();		//thread 실행
 		
 		for(int i=0; i<5; i++) {
 			System.out.println("띵");
 			try {
 				Thread.sleep(500);
 			}catch(Exception e) {}
 		}
	}
}
