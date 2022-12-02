package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		//메인스레드 가져옴ㅋ
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()); //=> main
		
		
		//스레드 3개 생성
		for(int i=0; i<3; i++) {				
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");	//스레드 이름을 가져옴 	Thread-0
				}
			};
			threadA.start();
		}
		
		//chat 스레드 생성
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");	//스레드 이름을 가져옴 	Thread-0
			}
		};
		chatThread.setName("chatThread");	//스레드 실행 전 이름을 바꿈ㅋ
		chatThread.start();
	
		
	}

}
